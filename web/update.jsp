<%-- 
    Document   : update
    Created on : Oct 25, 2022, 9:02:49 PM
    Author     : user
--%>


<%@page import="Domain.Patient"%>
<%@page import="Dao.GeneralDao"%>
<%@page import="java.time.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>vaccination update</title>
        <style>
            h1{
                text-align: center;
            }
            body{
                background-color: darksalmon;
             
            }
            #nav{
                padding: 10px;
                background-color: yellow;
            }
        </style>
         
    </head>
    <body>
     
        <h1>Vaccination_Update</h1>
  
         <form action="http://localhost:8080/RestService/webresources/service/update" method="POST">
              <%
     String NationId = (String)request.getParameter("nationId");        
     String CodeNo = (String)request.getParameter("code");
     String fname = (String)request.getParameter("firstName");
     String Lname =(String) request.getParameter("lastName");
     String Gender = (String)request.getParameter("gender");
     String vaccination_Site = (String)request.getParameter("vSite");     
     String Vdate =(String) request.getParameter("vDate");
     LocalDate vDate = LocalDate.parse(Vdate);      
     String vaccination_Name  =(String) request.getParameter("vname");
     String urukingo = (String)request.getParameter("vac");
        %>
     <table width="50%" border="0" align="center">
         <tbody>  
    <tr>
        <td><label>Nation_Id:</label></td>
        <td><input type="text" name="nationId" pattern="[0-9]{1} [0-9]{4} [0-9]{7} [0-9]{1} [0-9]{2}"></td>
    </tr>
    <tr>
        <td><label>Code_No:</label></td>
        <td><input type="text" name="code" pattern="EX[0-9]{8}"></td>
    </tr>
    <tr>
        <td><label>First_Name:</label></td>
        <td><input type="text" name="firstName"></td>
    </tr>
    <tr>
        <td><label>Last_Name:</label></td>
        <td><input type="text" name="lastName"></td>
    </tr>
    <tr>
        <td><label>Gender:</label></td>
        <td><select name="gender">
                <option>FEMALE</option>
                <option>MALE</option>
                </select></td>
    </tr>
    
    <tr>
        <td><label>Vaccination_Site:</label></td>
        <td><select name="vSite">
                <option>Kigali</option>
                <option>North</option>
                <option>South</option>
                <option>West</option>
                <option>East</option>
            </select></td>
    </tr>
    <tr>
        <td><label>Vaccination_Date:</label></td>
        <td><input type="date" name="vDate"></td>
    </tr>
   <tr>
        <td><label>Vaccine_Name:</label></td>
        <td><select name="vname">
                <option>Pfizer</option>
                <option>faizal</option>
                <option></option>
                
            </select></td>
    </tr>
     <tr>
        <td><label>Vaccine:</label></td>
        <td><select name="vac">
                <option>1st Dose</option>
                <option>2nd Dose</option>
                <option></option>
                
            </select></td>
    </tr>
    <tr>
        <td>
            <%
           // <button formaction="/App1/ServletUpdate" type="submit" id="nav">UPDATE</button>
    %>
    <button  type="submit" id="nav">UPDATE</button>
        </td>
    </tr>
   
        </tbody>
            </table>
       
     
        
        </form>
    </body>
</html>
