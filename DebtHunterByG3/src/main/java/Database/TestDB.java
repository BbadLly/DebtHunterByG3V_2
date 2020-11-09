/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Entity.Users;
import java.sql.*;

/**
 *
 * @author inwle
 */
public class TestDB {

    public static void main(String[] args) {
        Connection con = null;
        try {
            DatabaseConnection dbCon = new DatabaseConnection();
            con = dbCon.getConn();
            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from USERS");
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + " " + rs.getString(2));
//            }
//            String sql = "INSERT INTO DEBTS (DEBT_NAME, DEBTOR_MAIL, DESCRIPTION, COST) VALUES (?, ?, ?, ?)";
//            PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            pstmt.setString(1, "Coke");
//            pstmt.setString(2, "1@gmail.com");
//            pstmt.setString(3, "Arai ko dai");
//            pstmt.setInt(4, 50);
////            pstmt.setInt(5, 1);
//            pstmt.executeUpdate();
                
//             Users u = em.createQuery("SELECT u from Users u WHERE u.email = :email", Users.class)
//                .setParameter("email", userName).getSingleResult() ;   
//      
        } catch (Exception e) {
            System.out.println("Error1: " + e);
        }

    }
}
