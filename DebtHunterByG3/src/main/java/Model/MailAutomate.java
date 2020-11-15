/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Timer;

/**
 *
 * @author KaiNiYam
 */
public class MailAutomate implements Runnable{

//    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_DebtHunterByG3_war_1.0-SNAPSHOTPU");
//        EntityManager em = emf.createEntityManager();
//        Debts d = em.find(Debts.class, 1);
//        LocalDate today = LocalDate.now();
////       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
////System.out.println(java.time.LocalDate.now()); 
//        System.out.println(today);
////        if(today.equals(d.getDate())) {
////            System.out.println("Pay me now!!");
////        } else {
////            System.out.println("Pay me if you can");
//        }
//        
////        LocalDate wid =  LocalDate.
                
    public static void main(String[] args) {
  
//        Calendar c1 = Calendar.getInstance();
//        c1.set(Calendar.HOUR_OF_DAY, 19);
//        c1.set(Calendar.MINUTE,26);
//        c1.set(Calendar.SECOND, 00);
        
        
        
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                SendMail sm = new SendMail();
////                sm.sendEmail("gridpong01@gmail.com", "name");
//                System.out.println("------!!!!!!!!!!!!Done!!!!!!!!!!!!!--------");
//                //setEmail(emailContent, subject);
//            }
//        }, 
//                c1.getTime(), 86400000);
//        System.out.println(timer);
    }

    @Override
    public void run() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new Testing(), 0, 1000*60 );
    }
    
    }

