package online.wilson_lkx.controller.api.model;

import online.wilson_lkx.model.FuelPrice;

import java.sql.Date;

public class ApiFuelPrice {

    private Integer id;
    private Long dateFrom;
    private Long dateUntil;
    private Double ron95;
    private Double ron97;
    private Double diesel;

    public ApiFuelPrice() {
    }

    public ApiFuelPrice(FuelPrice fuelPrice) {
        this.id = fuelPrice.getId();
        this.dateFrom = fuelPrice.getDateFrom().getTime();
        this.dateUntil = fuelPrice.getDateUntil().getTime();
        this.ron95 = fuelPrice.getRon95();
        this.ron97 = fuelPrice.getRon97();
        this.diesel = fuelPrice.getDiesel();
    }

    public static FuelPrice convertModel(ApiFuelPrice apiFuelPrice) {
        FuelPrice fuelPrice = new FuelPrice();
        fuelPrice.setId(apiFuelPrice.getId());
        fuelPrice.setDateFrom(new Date(apiFuelPrice.getDateFrom()));
        fuelPrice.setDateUntil(new Date(apiFuelPrice.getDateUntil()));
        fuelPrice.setRon95(apiFuelPrice.getRon95());
        fuelPrice.setRon97(apiFuelPrice.getRon97());
        fuelPrice.setDiesel(apiFuelPrice.getDiesel());
        return fuelPrice;
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
