package online.wilson_lkx.dao;

import online.wilson_lkx.model.Role;
import online.wilson_lkx.model.Role_;
import online.wilson_lkx.model.UserRole;
import online.wilson_lkx.model.UserRole_;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class RoleDaoImpl implements RoleDao {

    @Autowired
    EntityManager em;

    @Override
    public Role getRoleById(int id) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Role> criteriaQuery = builder.createQuery(Role.class);

        Root<Role> root = criteriaQuery.from(Role.class);
        criteriaQuery.where(builder.equal(root.get(Role_.id), id));

        TypedQuery<Role> query = em.createQuery(criteriaQuery);
        return query.getResultList().get(0);
    }
}
