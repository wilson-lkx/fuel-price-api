package online.wilson_lkx.model;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FuelPrice.class)
public abstract class FuelPrice_ {

	public static volatile SingularAttribute<FuelPrice, Double> diesel;
	public static volatile SingularAttribute<FuelPrice, Double> ron97;
	public static volatile SingularAttribute<FuelPrice, Double> ron95;
	public static volatile SingularAttribute<FuelPrice, Integer> id;
	public static volatile SingularAttribute<FuelPrice, Date> dateUntil;
	public static volatile SingularAttribute<FuelPrice, Date> dateFrom;

	public static final String DIESEL = "diesel";
	public static final String RON97 = "ron97";
	public static final String RON95 = "ron95";
	public static final String ID = "id";
	public static final String DATE_UNTIL = "dateUntil";
	public static final String DATE_FROM = "dateFrom";

}

