package online.wilson_lkx.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserInfo.class)
public abstract class UserInfo_ {

	public static volatile SingularAttribute<UserInfo, String> userLastName;
	public static volatile SingularAttribute<UserInfo, Integer> id;
	public static volatile SingularAttribute<UserInfo, String> userFirstName;
	public static volatile SingularAttribute<UserInfo, Integer> userId;

	public static final String USER_LAST_NAME = "userLastName";
	public static final String ID = "id";
	public static final String USER_FIRST_NAME = "userFirstName";
	public static final String USER_ID = "userId";

}

