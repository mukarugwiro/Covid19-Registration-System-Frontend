<%-- 
    Document   : signin
    Created on : Oct 26, 2022, 12:57:18 PM
    Author     : user
--%>

<%
   String username = request.getParameter("username");
   String password = request.getParameter("password");
   if(username.equals("admin")&& password.equals("project"))
   {
     %>
     
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    
    
<style>
* {
    box-sizing: border-box;
}

body {
    font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
    background-color: #666;
    padding: 30px;
    text-align: center;
    font-size: 35px;
    color: white;
}

/* Create two columns/boxes that floats next to each other */
nav {
    float: left;
    width: 30%;
    height: 300px; /* only for demonstration, should be removed */
    background: #ccc;
    padding: 20px;
}

/* Style the list inside the menu */
nav ul {
    list-style-type: none;
    padding: 0;
}

article {
    float: left;
    padding: 20px;
    width: 70%;
    background-color: #f1f1f1;
    height: 300px; /* only for demonstration, should be removed */
}

/* Clear floats after the columns */
section:after {
    content: "";
    display: table;
    clear: both;
}

/* Style the footer */
footer {
    background-color: #777;
    padding: 10px;
    text-align: center;
    color: white;
}

/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
@media (max-width: 600px) {
    nav, article {
        width: 100%;
        height: auto;
    }
}
</style>
</head>
<body>
    <header>
        <h1>Vaccination Registration</h1>
       </header>
    <section>
  <nav>
      <img src="a.jpg" alt="Italian"  width="380" height="280">
  </nav>
  <article>
        <form method="POST">
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
                <option>Johnson</option>
                <option>Astrazeneca</option>
                
            </select></td>
    </tr>
     <tr>
        <td><label>Vaccine:</label></td>
        <td><select name="vac">
                <option>1st Dose</option>
                <option>2nd Dose</option>
                <option>3rd Dose</option>
                
                
            </select></td>
    </tr>
    <tr>
        <td> 
            <button formaction="http://localhost:8080/RestService/webresources/service/save" type="submit" id="nav">Register</button>
        </td>
    </tr>   

        </tbody>
            </table>
        </form>
       </article>
</section>
    <footer>
  <p>WELCOME !!!</p>
</footer>
    </body>
</html>

    
     <%
   }
   else
   {
    out.println("you are not admin just go back and login again");   
   }
%>

