/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Dao.GeneralDao;
import Domain.Patient;
import Domain.users;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "Servlet/record", urlPatterns = {"/Servlet/record"})
public class Servlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
//       String NatId = request.getParameter("nationId");
//      String CodeNo = request.getParameter("code");
//      String fname = request.getParameter("firstName");
//      String Lname = request.getParameter("lastName");
//      String Gender = request.getParameter("gender");
//      String vaccination_Site = request.getParameter("vSite");
//      
//      String Vdate = request.getParameter("vDate");
//      LocalDate vDate = LocalDate.parse(Vdate);
//      
//      String vaccination_Name  = request.getParameter("vname");
//      String urukingo = request.getParameter("vac");
//      GeneralDao<Patient> dao = new GeneralDao<Patient>(Patient.class);
//     Patient pt = new Patient(NatId, CodeNo, fname, Lname, Gender, vaccination_Site, vDate, vaccination_Name, urukingo);
//     
//      
//     dao.create(pt);
//      
      String userName = request.getParameter("userName");
       String password = request.getParameter("password");
       GeneralDao<users> dao = new GeneralDao<users>(users.class);
       users us = new users(userName, password);
      response.sendRedirect("/App1/form.jsp");
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
