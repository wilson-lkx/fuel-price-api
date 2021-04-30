package online.wilson_lkx.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "fuel_price")
public class FuelPrice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "date_from")
    private Date dateFrom;

    @Column(name = "date_until")
    private Date dateUntil;

    @Column(name = "ron95")
    private Double ron95;

    @Column(name = "ron97")
    private Double ron97;

    @Column(name = "diesel")
    private Double diesel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateUntil() {
        return dateUntil;
    }

    public void setDateUntil(Date dateUntil) {
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
