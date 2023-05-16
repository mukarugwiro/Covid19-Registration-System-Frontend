/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import Dao.GeneralDao;
import Domain.Patient;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet (name="Delete", urlPatterns = {"/Delete"})
public class Delete extends HttpServlet{
       @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException{
        String delete=request.getParameter("nationId");
        
           GeneralDao dao = new GeneralDao(Patient.class);
           Patient pt = new Patient(delete);
           dao.delete(pt);
             response.sendRedirect("/App1/Display.jsp"); 
        
    }
}
