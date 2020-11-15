/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 *
 * @author KaiNiYam
 */
public class SendMail {

    final String username = "debthunterbyg3@gmail.com";
    final String password = "debthunter333";

    public boolean sendEmail(String email, String name) {
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("DebtHunter"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(email)
            );
            message.setSubject("Remind!!!!!!!!!!");
            message.setText("Dear " + name + "\n\n Please pay within today");

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

//String dateString = format.format( new Date()   );
//Date   date       = format.parse ( "2009-12-31" );    
//            String myDate = "2014/10/29 18:10:45";
//LocalDate today = LocalDate.now();
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//            Date date1 = sdf.format(today);
//            long millis = date.getTime();
long miliSec = 3010; 

        // Creating date format 
        DateFormat simple = new SimpleDateFormat("dd MMM yyyy HH:mm:ss:SSS Z"); 

        // Creating date from milliseconds 
        // using Date() constructor 
            Transport.send(message); 

            System.out.println("Done");
            return true;

        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return false;
    }

}
