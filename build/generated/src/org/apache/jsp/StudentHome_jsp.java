package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class StudentHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Student Module</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background-color: #f4f4f4;\n");
      out.write("            color: #333;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Navigation Bar */\n");
      out.write("        .navbar {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("            padding: 15px 30px;\n");
      out.write("            background-color: #333;\n");
      out.write("            color: #fff;\n");
      out.write("            position: fixed; \n");
      out.write("            top: 0;\n");
      out.write("            left: 0; \n");
      out.write("            width: 100%; \n");
      out.write("            z-index: 1000;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar ul {\n");
      out.write("            display: flex;\n");
      out.write("            list-style-type: none;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            gap: 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar a {\n");
      out.write("            color: #fff;\n");
      out.write("            text-decoration: none;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            transition: background-color 0.3s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar a:hover {\n");
      out.write("            background-color: #0ef;\n");
      out.write("            color: #000;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Student Module Content */\n");
      out.write("        .content {\n");
      out.write("            padding: 100px 20px;\n");
      out.write("            max-width: 1200px;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .section {\n");
      out.write("            margin-bottom: 40px;\n");
      out.write("            background-color: #fff;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .section h2 {\n");
      out.write("            font-size: 2em;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("            color: #0099ff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Set grid to 3 columns for items */\n");
      out.write("        .section ul {\n");
      out.write("            display: grid;\n");
      out.write("            grid-template-columns: repeat(3, 1fr);\n");
      out.write("            gap: 20px;\n");
      out.write("            list-style-type: none;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .section li {\n");
      out.write("            background-color: #f4f4f4;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .section li:hover {\n");
      out.write("            background-color: #0099ff;\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .section li a {\n");
      out.write("            color: inherit;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Footer */\n");
      out.write("        footer {\n");
      out.write("            background-color: #333;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- Navigation Bar -->\n");
      out.write("    <nav class=\"navbar\">\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"StudentHome.jsp\">Home</a></li>\n");
      out.write("            <li><a href=\"ChangePasswordStudent.jsp\">Change Password</a></li>\n");
      out.write("            <li><a href=\"index.html\">Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <br><br>\n");
      out.write("    <!-- Student Module Content -->\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <section class=\"section\">\n");
      out.write("            <h2>Student Module</h2>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"ViewProfile.jsp\">Profile</a></li>\n");
      out.write("                <li><a href=\"SubjectWiseExam.jsp\">Start Subject-Wise Exam</a></li> <!-- Updated Link -->\n");
      out.write("                <li><a href=\"ViewResult.jsp\">View Result</a></li>\n");
      out.write("                <li><a href=\"DeleteAccount.jsp\">Delete Your Account</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </section>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Footer -->\n");
      out.write("    <footer>\n");
      out.write("        <p>&copy; 2024 Student Module. All rights reserved.</p>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
