package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<style>\n");
      out.write("* {\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the header */\n");
      out.write("header {\n");
      out.write("    background-color: #666;\n");
      out.write("    padding: 30px;\n");
      out.write("    text-align: center;\n");
      out.write("    font-size: 35px;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Create two columns/boxes that floats next to each other */\n");
      out.write("nav {\n");
      out.write("    float: left;\n");
      out.write("    width: 30%;\n");
      out.write("    height: 300px; /* only for demonstration, should be removed */\n");
      out.write("    background: #ccc;\n");
      out.write("    padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the list inside the menu */\n");
      out.write("nav ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("article {\n");
      out.write("    float: left;\n");
      out.write("    padding: 20px;\n");
      out.write("    width: 70%;\n");
      out.write("    background-color: #f1f1f1;\n");
      out.write("    height: 300px; /* only for demonstration, should be removed */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clear floats after the columns */\n");
      out.write("section:after {\n");
      out.write("    content: \"\";\n");
      out.write("    display: table;\n");
      out.write("    clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the footer */\n");
      out.write("footer {\n");
      out.write("    background-color: #777;\n");
      out.write("    padding: 10px;\n");
      out.write("    text-align: center;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */\n");
      out.write("@media (max-width: 600px) {\n");
      out.write("    nav, article {\n");
      out.write("        width: 100%;\n");
      out.write("        height: auto;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <h1>Vaccination Registration</h1>\n");
      out.write("       </header>\n");
      out.write("    <section>\n");
      out.write("  <nav>\n");
      out.write("      <img src=\"a.jpg\" alt=\"Italian\"  width=\"380\" height=\"280\">\n");
      out.write("  </nav>\n");
      out.write("  <article>\n");
      out.write("        <form method=\"POST\">\n");
      out.write("     <table width=\"50%\" border=\"0\" align=\"center\">\n");
      out.write("         <tbody>  \n");
      out.write("    <tr>\n");
      out.write("        <td><label>Nation_Id:</label></td>\n");
      out.write("        <td><input type=\"text\" name=\"nationId\" pattern=\"[0-9]{1} [0-9]{4} [0-9]{7} [0-9]{1} [0-9]{2}\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><label>Code_No:</label></td>\n");
      out.write("        <td><input type=\"text\" name=\"code\" pattern=\"EX[0-9]{8}\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><label>First_Name:</label></td>\n");
      out.write("        <td><input type=\"text\" name=\"firstName\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><label>Last_Name:</label></td>\n");
      out.write("        <td><input type=\"text\" name=\"lastName\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><label>Gender:</label></td>\n");
      out.write("        <td><select name=\"gender\">\n");
      out.write("                <option>FEMALE</option>\n");
      out.write("                <option>MALE</option>\n");
      out.write("                </select></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("        <td><label>Vaccination_Site:</label></td>\n");
      out.write("        <td><select name=\"vSite\">\n");
      out.write("                <option>Kigali</option>\n");
      out.write("                <option>North</option>\n");
      out.write("                <option>South</option>\n");
      out.write("                <option>West</option>\n");
      out.write("                <option>East</option>\n");
      out.write("            </select></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><label>Vaccination_Date:</label></td>\n");
      out.write("        <td><input type=\"date\" name=\"vDate\"></td>\n");
      out.write("    </tr>\n");
      out.write("   <tr>\n");
      out.write("        <td><label>Vaccine_Name:</label></td>\n");
      out.write("        <td><select name=\"vname\">\n");
      out.write("                <option>Pfizer</option>\n");
      out.write("                <option>Johnson</option>\n");
      out.write("                <option>Astrazeneca</option>\n");
      out.write("                \n");
      out.write("            </select></td>\n");
      out.write("    </tr>\n");
      out.write("     <tr>\n");
      out.write("        <td><label>Vaccine:</label></td>\n");
      out.write("        <td><select name=\"vac\">\n");
      out.write("                <option>1st Dose</option>\n");
      out.write("                <option>2nd Dose</option>\n");
      out.write("                <option></option>\n");
      out.write("                \n");
      out.write("            </select></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td> \n");
      out.write("            <button formaction=\"http://localhost:8080/RestService/webresources/service/save\" type=\"submit\" id=\"nav\">Register</button>\n");
      out.write("        </td>\n");
      out.write("    </tr>   \n");
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("       </article>\n");
      out.write("</section>\n");
      out.write("    <footer>\n");
      out.write("  <p>WELCOME !!!</p>\n");
      out.write("</footer>\n");
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
