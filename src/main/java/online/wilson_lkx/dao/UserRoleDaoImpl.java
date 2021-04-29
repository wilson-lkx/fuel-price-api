package online.wilson_lkx.dao;

import online.wilson_lkx.model.UserRole;
import online.wilson_lkx.model.UserRole_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Repository
@Transactional
public class UserRoleDaoImpl implements UserRoleDao {

    @Autowired
    EntityManager em;

    @Override
    public UserRole getUserRoleByUserId(int userId) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<UserRole> criteriaQuery = builder.createQuery(UserRole.class);

        Root<UserRole> root = criteriaQuery.from(UserRole.class);
        criteriaQuery.where(builder.equal(root.get(UserRole_.userId), userId));

        TypedQuery<UserRole> query = em.createQuery(criteriaQuery);
        return query.getResultList().get(0);
    }
}
