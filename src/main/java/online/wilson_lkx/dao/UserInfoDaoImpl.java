package online.wilson_lkx.dao;

import online.wilson_lkx.model.UserInfo;
import online.wilson_lkx.model.UserInfo_;
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
public class UserInfoDaoImpl implements UserInfoDao {

    @Autowired
    EntityManager em;

    @Override
    public UserInfo getUserInfoByUserId(int userId) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<UserInfo> criteriaQuery = builder.createQuery(UserInfo.class);

        Root<UserInfo> root = criteriaQuery.from(UserInfo.class);
        criteriaQuery.where(builder.equal(root.get(UserInfo_.USER_ID), userId));

        TypedQuery<UserInfo> query = em.createQuery(criteriaQuery);
        return query.getResultList().get(0);
    }
}
