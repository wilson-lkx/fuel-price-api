package online.wilson_lkx.dao;

import online.wilson_lkx.model.FuelPrice;

import java.util.Date;
import java.util.List;

public interface FuelPriceDao {

    List<FuelPrice> findVtsFuelPriceByDate(Date date);
}
