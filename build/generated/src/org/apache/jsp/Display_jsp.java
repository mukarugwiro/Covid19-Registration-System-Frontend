package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Domain.Patient;
import Dao.GeneralDao;

public final class Display_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            var url=\"http://localhost:8080/RestService/webresources/service/list\";\n");
      out.write("            $.getJSON(url, function(list){\n");
      out.write("               \n");
      out.write("                for(i=0;i<list.length;i=i+1){\n");
      out.write("                    console.log(list);\n");
      out.write("                    var table= document.querySelector(\"#table\");\n");
      out.write("                    var row= table.insertRow();\n");
      out.write("                    row.insertCell(0).innerHTML=list[i].nationId;\n");
      out.write("                    row.insertCell(1).innerHTML=list[i].code;\n");
      out.write("                    row.insertCell(2).innerHTML=list[i].firstName;\n");
      out.write("                    row.insertCell(3).innerHTML=list[i].lastName;\n");
      out.write("                    row.insertCell(4).innerHTML=list[i].gender;\n");
      out.write("                    row.insertCell(5).innerHTML=list[i].vaccine_Site;\n");
      out.write("                    row.insertCell(6).innerHTML=list[i].vaccination_Date;\n");
      out.write("                    row.insertCell(7).innerHTML=list[i].vaccination_Name;\n");
      out.write("                   // if(list[i].vaccine==\"1st Dose\"){\n");
      out.write("                      //  row.insertCell(8).innerHTML=\"<a href=http://localhost:8080/RestService/webresources/service/firstDose?nationId=\"+national_id+\">1st Dose</a>\";\n");
      out.write("                    //}else{\n");
      out.write("                        row.insertCell(8).innerHTML=list[i].vaccine;\n");
      out.write("                   // }\n");
      out.write("\n");
      out.write("                     \n");
      out.write("                     var national_id = list[i].nationId.replace(/ /g,'%20');\n");
      out.write("                        row.insertCell(9).innerHTML=\"<a href=http://localhost:8080/RestService/webresources/service/nationId?nationId=\"+national_id+\">Delete</a>\";\n");
      out.write("                     //row.insertCell(10).innerHTML=list[i].update;\n");
      out.write("                    var national_id = list[i].nationId.replace(/ /g,'%20'); \n");
      out.write("            //row.insertCell(10).innerHTML=\"<a href=http://localhost:8080/RestService/webresources/service/update?nationId=\"+national_id+\">update</a>\";\n");
      out.write("        \n");
      out.write("        row.insertCell(10).innerHTML='<a href=/App1/card.jsp?nationId='+national_id+'>card</a>'\n");
      out.write("       // row.insertCell(11).innerHTML='<a href=http://localhost:8080/App1/update.jsp?nationId='+list[i].nationId+'>update</a>'       \n");
      out.write("        //row.insertCell(11).innerHTML='<a href=http://localhost:8080/App1/update.jsp?nationId='+national_id+'&code='+list[i].code+'&firstName='+list[i].firstName+'&lastName='+list[i].lastName+'&gender='+list[i].gender+'&vaccine_Site='+list[i].vaccine_Site+'&vaccine_Date='+list[i].vaccine_Date+'&vaccine_Name='+list[i].vaccine_Name+'&vaccine='+list[i].vaccine+'>update</a>'       \n");
      out.write("        }\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <title>Table</title>\n");
      out.write("        <style>\n");
      out.write("table {\n");
      out.write("    font-family: arial, sans-serif;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td, th {\n");
      out.write("    border: 1px solid #dddddd;\n");
      out.write("    text-align: left;\n");
      out.write("    padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {\n");
      out.write("    background-color: #dddddd;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 align=\"center\">Table</h1>\n");
      out.write("        <table id=\"table\" class=\"table\" border=\"1\" cellpadding=\"8\" cellspacing=\"0\" align=\"center\">\n");
      out.write("                    <th>Nation ID</th>\n");
      out.write("                    <th>Code</th>\n");
      out.write("                    <th>First Name</th>\n");
      out.write("                    <th>Last Name</th>\n");
      out.write("                    <th>Gender</th>\n");
      out.write("                    <th>Vaccination_site</th>\n");
      out.write("                    <th>Vaccination Date</th>\n");
      out.write("                    <th>Vaccine_Name</th>\n");
      out.write("                    <th>Vaccine</th>\n");
      out.write("                    <th>Delete</th>\n");
      out.write("                    <th>Card</th>\n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("             \n");
      out.write("             \n");
      out.write("               \n");
      out.write("            </table>\n");
      out.write("       \n");
      out.write("    <td><a href=\"/App1/form.jsp\" id=\"nav\">BACK TO FORM</a> </td>\n");
      out.write("        <br> <br>\n");
      out.write("     <td><a href=\"/App1/cards.jsp\" id=\"nav\">NEXT TO CAR</a></td>   \n");
      out.write("        <br> <br>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
