/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Database.DatabaseConnection;
import Entity.Debts;
import static Entity.Debts_.debtId;
import Entity.Users;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author GuideKai
 */
@WebServlet(name = "TestServlet", urlPatterns = {"/Test"})
public class TestServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_DebtHunterByG3_war_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        HttpSession session = request.getSession();
        Users u = (Users) session.getAttribute("user"); 

        String sql1 = "Select * from Debts d WHERE USERS_ID = ?" ;
        String sql2 = "Select debt_name, description, cost from Debts d WHERE Debtor_Mail = ?" ;
        String sql = "Select * from Debts d";
//        Query qry = em.createNativeQuery(sql) ;
//
//        List<Debts> dl = qry.getResultList() ;
//        request.setAttribute("debts", dl);
        List<Debts> dl = new ArrayList();
        try {
            Connection conn = DatabaseConnection.getConn();
            PreparedStatement ps = conn.prepareStatement(sql1);
            
//            for (Debts debts : dl) {
//                ps.setInt(1, debts.getDebtId()) ;
//                ps.setString(2, debts.getDebtName()) ;
//                ps.setString(3, debts.getDebtorMail()) ;
//                ps.setString(4, debts.getDescription()) ;
//                ps.setInt(5, debts.getCost()) ;
//                ResultSet rs = ps.executeQuery();
//                dl.add(debts) ;
//            }
            
            ps.setInt(1, u.getId());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Debts d = new Debts() ;
                d.setDebtId(rs.getInt("debt_id"));
                d.setDebtName(rs.getString("debt_name"));
                d.setDebtorMail(rs.getString("debtor_mail"));
                d.setDescription(rs.getString("description"));
                d.setCost(rs.getInt("cost"));
//                
                dl.add(d);
            }
            
                request.setAttribute("debts", dl);
                request.getRequestDispatcher("/ShowBoard.jsp").forward(request, response);

        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        try {
            Connection conn = DatabaseConnection.getConn();
            PreparedStatement ps = conn.prepareStatement(sql2);
            
//            for (Debts debts : dl) {
//                ps.setInt(1, debts.getDebtId()) ;
//                ps.setString(2, debts.getDebtName()) ;
//                ps.setString(3, debts.getDebtorMail()) ;
//                ps.setString(4, debts.getDescription()) ;
//                ps.setInt(5, debts.getCost()) ;
//                ResultSet rs = ps.executeQuery();
//                dl.add(debts) ;
//            }
            Debts d = new Debts() ;            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                d.setDebtName(rs.getString("debt_name"));
                d.setDescription(rs.getString("description"));
                d.setCost(rs.getInt("cost"));
                ps.setString(1, d.getDebtorMail());  
                dl.add(d);
            }
            
                request.setAttribute("collectors", dl);
                request.getRequestDispatcher("/ShowBoard.jsp").forward(request, response);
        } catch (Exception ex) {
            System.out.println(ex);
        }

//            request.setAttribute("debts", dl);
//            request.getRequestDispatcher("/WEB-INF/ShowBoard.jsp").forward(request, response); 
           
        
//        request.setAttribute("collectors", dl);
        request.getRequestDispatcher("/ShowBoard.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
