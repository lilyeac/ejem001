/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-19 22:34:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formulario_005femail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<form action=\"");
      out.print(application.getAttribute("CONTROLLER").toString());
      out.write("/Enviar/Email\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t<table id=\"registro\" width=\"110\" border=\"0\" cellspacing=\"0\" cellpadding=\"5\">\r\n");
      out.write("\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"center\">DATOS EMPLEADO</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("    \t\t<td valign=\"top\">Servidor</td>\r\n");
      out.write("    \t\t<td> \r\n");
      out.write("\t\t\t\t<select name=\"tipo_servidor\">\r\n");
      out.write("\t\t\t\t\t<option value='gmail'>gmail</option>\r\n");
      out.write("\t\t\t\t\t<option value='hotmail'>hotmail</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t    \t</td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Asunto</td>\r\n");
      out.write("\t\t\t<td><input name=\"asunto\" type=\"text\"> </td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Destinatario</td>\r\n");
      out.write("\t\t\t<td><input name=\"destinatarios\" type=\"text\" value=\"ingenio.ds@hotmail.com\"> </td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("  \t\t<tr>\r\n");
      out.write("    \t\t<td colspan=\"2\">Mensaje</td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("  \t\t<tr>\r\n");
      out.write("    \t\t<td colspan=\"2\"><textarea name=\"contenido\" cols=\"40\" rows=\"5\"></textarea></td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("  \t\t\r\n");
      out.write("  \t\t<tr>\r\n");
      out.write("    \t\t<td>Adjuntos</td>\r\n");
      out.write("    \t\t<td><input name=\"adjuntos\" type=\"file\" multiple=\"multiple\"></td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("  \t\t<tr align=\"center\">\r\n");
      out.write("    \t\t<td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Enviar\"></td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</form>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
