package online.wilson_lkx.dao;

import online.wilson_lkx.model.FuelPrice;
import online.wilson_lkx.model.FuelPrice_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public class FuelPriceDaoImpl implements FuelPriceDao {

    @Autowired
    EntityManager em;

    @Override
    public List<FuelPrice> findVtsFuelPriceByDate(Date date) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<FuelPrice> criteriaQuery = builder.createQuery(FuelPrice.class);

        Root<FuelPrice> root = criteriaQuery.from(FuelPrice.class);
        criteriaQuery.where(builder.lessThanOrEqualTo(root.<Date>get(FuelPrice_.DATE_FROM), date),
                builder.greaterThanOrEqualTo(root.<Date>get(FuelPrice_.DATE_UNTIL), date));

        TypedQuery<FuelPrice> query = em.createQuery(criteriaQuery);
        return query.getResultList();
    }
}
