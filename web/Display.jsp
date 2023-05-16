<%-- 
    Document   : Display
    Created on : Oct 22, 2022, 5:47:15 PM
    Author     : user
--%>

<%@page import="java.util.List"%>
<%@page import="Domain.Patient"%>
<%@page import="Dao.GeneralDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script>
            var url="http://localhost:8080/RestService/webresources/service/list";
            $.getJSON(url, function(list){
               
                for(i=0;i<list.length;i=i+1){
                    console.log(list);
                    var table= document.querySelector("#table");
                    var row= table.insertRow();
                    row.insertCell(0).innerHTML=list[i].nationId;
                    row.insertCell(1).innerHTML=list[i].code;
                    row.insertCell(2).innerHTML=list[i].firstName;
                    row.insertCell(3).innerHTML=list[i].lastName;
                    row.insertCell(4).innerHTML=list[i].gender;
                    row.insertCell(5).innerHTML=list[i].vaccine_Site;
                    row.insertCell(6).innerHTML=list[i].vaccination_Date;
                    row.insertCell(7).innerHTML=list[i].vaccination_Name;
                   // if(list[i].vaccine=="1st Dose"){
                      //  row.insertCell(8).innerHTML="<a href=http://localhost:8080/RestService/webresources/service/firstDose?nationId="+national_id+">1st Dose</a>";
                    //}else{
                        row.insertCell(8).innerHTML=list[i].vaccine;
                   // }

                     
                     var national_id = list[i].nationId.replace(/ /g,'%20');
                        row.insertCell(9).innerHTML="<a href=http://localhost:8080/RestService/webresources/service/nationId?nationId="+national_id+">Delete</a>";
                     //row.insertCell(10).innerHTML=list[i].update;
                    var national_id = list[i].nationId.replace(/ /g,'%20'); 
            //row.insertCell(10).innerHTML="<a href=http://localhost:8080/RestService/webresources/service/update?nationId="+national_id+">update</a>";
        
        row.insertCell(10).innerHTML='<a href=/App1/card.jsp?nationId='+national_id+'>card</a>'
       // row.insertCell(11).innerHTML='<a href=http://localhost:8080/App1/update.jsp?nationId='+list[i].nationId+'>update</a>'       
        //row.insertCell(11).innerHTML='<a href=http://localhost:8080/App1/update.jsp?nationId='+national_id+'&code='+list[i].code+'&firstName='+list[i].firstName+'&lastName='+list[i].lastName+'&gender='+list[i].gender+'&vaccine_Site='+list[i].vaccine_Site+'&vaccine_Date='+list[i].vaccine_Date+'&vaccine_Name='+list[i].vaccine_Name+'&vaccine='+list[i].vaccine+'>update</a>'       
        }
            });
        </script>
        <title>Table</title>
        <style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
    </head>
    <body>
        <h1 align="center">Table</h1>
        <table id="table" class="table" border="1" cellpadding="8" cellspacing="0" align="center">
                    <th>Nation ID</th>
                    <th>Code</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Gender</th>
                    <th>Vaccination_site</th>
                    <th>Vaccination Date</th>
                    <th>Vaccine_Name</th>
                    <th>Vaccine</th>
                    <th>Delete</th>
                    <th>Card</th>
                   
                   
             
             
               
            </table>
       
    <td><a href="/App1/form.jsp" id="nav">BACK TO FORM</a> </td>
        <br> <br>
     <td><a href="/App1/cards.jsp" id="nav">NEXT TO CARD</a></td>   
        <br> <br>
    </body>
</html>
