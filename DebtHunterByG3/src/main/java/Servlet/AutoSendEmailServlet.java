/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.MailAutomate;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author KaiNiYam
 */
public class AutoSendEmailServlet implements ServletContextListener {

    private ExecutorService executor;
    
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("Auto send shut down!!!!!");
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("------------------------");
        executor.shutdown();
        //Notification that the servlet context is about to be shut down.   
    }

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        // do all the tasks that you need to perform just after the server starts
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("Auto send starting!!!!!");
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("------------------------");
        executor = Executors.newSingleThreadExecutor();
        MailAutomate ma = new MailAutomate();
        executor.submit(ma);
        //Notification that the web application initialization process is starting
//        Timer timer = new Timer();
//        TimerTask tt = new TimerTask() {
//            public void run() {
//                Calendar cal = Calendar.getInstance(); //this is the method you should use, not the Date(), because it is desperated.
//
//                int hour = cal.get(Calendar.HOUR_OF_DAY);//get the hour number of the day, from 0 to 23
//
//                if (hour == 0) {
//                    System.out.println("doing the scheduled task");
//                }
//            }
//        };
//        timer.schedule(tt, 1000, 1000 * 5);//	delay the task 1 second, and then run task every five seconds
//        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                SendMail sm = new SendMail();
//                sm.sendEmail("gridpong01@gmail.com", "name");
//                System.out.println("------!!!!!!!!!!!!Done!!!!!!!!!!!!!--------");
//                //setEmail(emailContent, subject);
//            }
//        }, 
//                c1.getTime(), 86400000);
    }

}
