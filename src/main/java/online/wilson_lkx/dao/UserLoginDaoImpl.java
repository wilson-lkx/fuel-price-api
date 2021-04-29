package online.wilson_lkx.dao;

import online.wilson_lkx.helper.Encryption;
import online.wilson_lkx.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Repository
@Transactional
public class UserLoginDaoImpl implements UserLoginDao {

    @Autowired
    EntityManager em;

    @Override
    public User getUser(String email, String password) throws NoSuchAlgorithmException {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<User> criteriaQuery = builder.createQuery(User.class);

        Root<User> root = criteriaQuery.from(User.class);
        criteriaQuery.where(builder.equal(root.get(User_.EMAIL), email));
        List<User> users = em.createQuery(criteriaQuery).getResultList();

        if(users.isEmpty() == false) {
            User user = users.get(0);
            if (Encryption.encryptWord(password + user.getSalt()).equalsIgnoreCase(user.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
