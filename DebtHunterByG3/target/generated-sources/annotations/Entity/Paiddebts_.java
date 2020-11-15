package Entity;

import Entity.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-15T18:10:08")
@StaticMetamodel(Paiddebts.class)
public class Paiddebts_ { 

    public static volatile SingularAttribute<Paiddebts, Date> date;
    public static volatile SingularAttribute<Paiddebts, Integer> paidId;
    public static volatile SingularAttribute<Paiddebts, String> paidMail;
    public static volatile SingularAttribute<Paiddebts, String> paidName;
    public static volatile SingularAttribute<Paiddebts, Integer> paidCost;
    public static volatile SingularAttribute<Paiddebts, Users> usersId;
    public static volatile SingularAttribute<Paiddebts, String> paidDescription;

}