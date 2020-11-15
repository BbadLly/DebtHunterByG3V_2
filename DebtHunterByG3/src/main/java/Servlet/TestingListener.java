/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.SendMail;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class TestingListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("Auto send starting!!!!!");
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("------------------------");

        Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.HOUR_OF_DAY, 19);
        c1.set(Calendar.MINUTE, 46);
        c1.set(Calendar.SECOND, 00);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                SendMail sm = new SendMail();
//                sm.sendEmail("gridpong01@gmail.com", "name");
                System.out.println("------!!!!!!!!!!!!Done!!!!!!!!!!!!!--------");
                //setEmail(emailContent, subject);
            }
        },
                c1.getTime(), 86400000);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("Auto send shut down!!!!!");
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("------------------------");
        
        
        
    }

}
