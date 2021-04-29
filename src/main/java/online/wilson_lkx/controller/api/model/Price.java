package online.wilson_lkx.controller.api.model;

import java.sql.Date;

public class Price {

    private Integer id;
    private Long dateFrom;
    private Long dateUntil;
    private Double ron95;
    private Double ron97;
    private Double diesel;

    public Price() {
    }

    public Price(online.wilson_lkx.model.FuelPrice fuelPrice) {
        this.id = fuelPrice.getId();
        this.dateFrom = fuelPrice.getDateFrom().getTime();
        this.dateUntil = fuelPrice.getDateUntil().getTime();
        this.ron95 = fuelPrice.getRon95();
        this.ron97 = fuelPrice.getRon97();
        this.diesel = fuelPrice.getDiesel();
    }

    public static online.wilson_lkx.model.FuelPrice convertModel(Price price) {
        online.wilson_lkx.model.FuelPrice vtsFuelPrice = new online.wilson_lkx.model.FuelPrice();
        vtsFuelPrice.setId(price.getId());
        vtsFuelPrice.setDateFrom(new Date(price.getDateFrom()));
        vtsFuelPrice.setDateUntil(new Date(price.getDateUntil()));
        vtsFuelPrice.setRon95(price.getRon95());
        vtsFuelPrice.setRon97(price.getRon97());
        vtsFuelPrice.setDiesel(price.getDiesel());
        return vtsFuelPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Long dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Long getDateUntil() {
        return dateUntil;
    }

    public void setDateUntil(Long dateUntil) {
        this.dateUntil = dateUntil;
    }

    public Double getRon95() {
        return ron95;
    }

    public void setRon95(Double ron95) {
        this.ron95 = ron95;
    }

    public Double getRon97() {
        return ron97;
    }

    public void setRon97(Double ron97) {
        this.ron97 = ron97;
    }

    public Double getDiesel() {
        return diesel;
    }

    public void setDiesel(Double diesel) {
        this.diesel = diesel;
    }
}
