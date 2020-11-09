/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Database.DatabaseConnection;
import Entity.Users;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GuideKai
 */
@WebServlet(name = "AddUserToDBServlet", urlPatterns = {"/AddUserToDB"})
public class AddUserToDBServlet extends HttpServlet {

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
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String fname = request.getParameter("firstname");
        String lname = request.getParameter("lastname");
        String tel = request.getParameter("tel");
//        int tel = Integer.parseInt(t);
        Users u = new Users();

        String sql = "INSERT INTO USERS (EMAIL, PASSWORD, FIRSTNAME, LASTNAME, TEL) VALUES (?, ?, ?, ?, ?)";
        try ( Connection conn = DatabaseConnection.getConn();  
                PreparedStatement stm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stm.setString(1, email);
            stm.setString(2, password);
            stm.setString(3, fname);
            stm.setString(4, lname);
            stm.setString(5, tel);
            
            stm.executeUpdate();
                ResultSet rs = stm.getGeneratedKeys();
                while (rs.next()) {
                    u.setId(rs.getInt(1));
                }
                
            
            conn.close();

        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        request.setAttribute("1", email);
        request.setAttribute("2", password);
        request.setAttribute("3", fname);
        request.setAttribute("4", lname);
        request.setAttribute("5", tel);
        request.getRequestDispatcher("/Login.jsp").forward(request, response);
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
