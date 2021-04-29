package online.wilson_lkx.repository;

import online.wilson_lkx.dao.FuelPriceDao;
import online.wilson_lkx.model.FuelPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelPriceRepository extends JpaRepository<FuelPrice, Integer>, FuelPriceDao {

}