package Entity;

import Entity.Paymenthistory;
import Entity.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2563-11-13T23:14:06")
@StaticMetamodel(Debts.class)
public class Debts_ { 

    public static volatile SingularAttribute<Debts, Date> date;
    public static volatile SingularAttribute<Debts, String> debtName;
    public static volatile SingularAttribute<Debts, Integer> cost;
    public static volatile SingularAttribute<Debts, String> debtorMail;
    public static volatile SingularAttribute<Debts, Users> usersId;
    public static volatile SingularAttribute<Debts, String> description;
    public static volatile SingularAttribute<Debts, Integer> debtId;
    public static volatile ListAttribute<Debts, Paymenthistory> paymenthistoryList;

}