/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.DatabaseConnection;
import Entity.Debts;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author KaiNiYam
 */
public class Testing extends TimerTask {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_DebtHunterByG3_war_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
    SendMail sm = new SendMail();
    
    @Override
    public void run() {
        Date date = new Date(System.currentTimeMillis());
        String dateFormat = formatter.format(date);
        String query = "SELECT * FROM DEBTS WHERE IS_DEBT_PAID = FALSE AND DATE < '" + dateFormat + "'";
        
        List<Debts> ary = new ArrayList();
        try{
            Connection conn = DatabaseConnection.getConn();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Debts d = new Debts();
                d.setDebtId(rs.getInt("debt_id"));
                d.setDebtName(rs.getString("debt_name"));
                d.setDebtorMail(rs.getString("debtor_mail"));
                d.setDescription(rs.getString("description"));
                d.setCost(rs.getInt("cost"));
                d.setCollectorMail(rs.getString("collector_mail"));
                d.setIsDebtPaid(rs.getBoolean("is_debt_paid"));
                ary.add(d);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        Iterator i = ary.iterator();
        while(i.hasNext()){
            Debts temp = (Debts) i.next();
            try{
            sm.sendEmail(temp.getDebtorMail(), temp.getDebtName());
            }
            catch(Exception e){
                e.printStackTrace();
            }
            System.out.println("Email to " + temp.getDebtorMail() + " for collecting " + temp.getDebtName() + " has been Sent!");
        }
        
        
    }

    
    
}
