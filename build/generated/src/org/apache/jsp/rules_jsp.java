package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rules_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Skill Matrix - Rules</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 100vh;\n");
      out.write("            background-color: #000;\n");
      out.write("            margin: 0;\n");
      out.write("            padding-top: 80px; /* To avoid overlap with navbar */\n");
      out.write("            color: #fff;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Navigation Bar */\n");
      out.write("        .navbar {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: #000;\n");
      out.write("            box-shadow: 0 2px 10px rgba(0, 78, 146, 0.7);\n");
      out.write("            position: fixed;\n");
      out.write("            top: 0;\n");
      out.write("            width: 100%;\n");
      out.write("            z-index: 1000;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav-container {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            width: 100%;\n");
      out.write("            max-width: 1200px;\n");
      out.write("            padding: 0 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav-left, .nav-right {\n");
      out.write("            display: flex;\n");
      out.write("            gap: 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav-left li, .nav-right li {\n");
      out.write("            list-style: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav-left a, .nav-right a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            transition: background-color 0.3s, color 0.3s;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            border: 2px solid #0ef;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav-left a:hover, .nav-right a:hover {\n");
      out.write("            background-color: #0ef;\n");
      out.write("            color: #000;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-btn, .register-btn {\n");
      out.write("            background-color: #0ef;\n");
      out.write("            color: #000;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            transition: background-color 0.3s, color 0.3s, transform 0.3s;\n");
      out.write("            font-weight: bold;\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-btn:hover, .register-btn:hover {\n");
      out.write("            background-color: #00aaff;\n");
      out.write("            color: #fff;\n");
      out.write("            transform: translateY(-5px);\n");
      out.write("            box-shadow: 0 10px 20px rgba(0, 78, 146, 0.7);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Rules Section */\n");
      out.write("        .rules-section {\n");
      out.write("            padding: 60px 20px;\n");
      out.write("            max-width: 800px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .rules-section h2 {\n");
      out.write("            font-size: 2.5em;\n");
      out.write("            color: #0ef;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .rules-section p {\n");
      out.write("            font-size: 1.2em;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .rules-points {\n");
      out.write("            text-align: left;\n");
      out.write("            list-style-type: none;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .rules-points li {\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            font-size: 1.1em;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .rules-points li strong {\n");
      out.write("            color: #0ef;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Responsive Design */\n");
      out.write("        @media (max-width: 768px) {\n");
      out.write("            .nav-container {\n");
      out.write("                flex-direction: column;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .rules-section {\n");
      out.write("                padding: 30px 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .rules-section h2 {\n");
      out.write("                font-size: 2em;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .rules-section p {\n");
      out.write("                font-size: 1em;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .rules-points li {\n");
      out.write("                font-size: 1em;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- Navigation Bar -->\n");
      out.write("    <nav class=\"navbar\" role=\"navigation\" aria-label=\"Main Navigation\">\n");
      out.write("        <div class=\"nav-container\">\n");
      out.write("            <ul class=\"nav-left\">\n");
      out.write("                <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("                <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"nav-right\">\n");
      out.write("                <li><a href=\"Login.jsp\" class=\"login-btn\">Login</a></li>\n");
      out.write("                <li><a href=\"Registration.jsp\" class=\"register-btn\">Register</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <!-- Rules Section -->\n");
      out.write("    <main class=\"rules-section\">\n");
      out.write("        <h2>Rules of Skill Matrix</h2>\n");
      out.write("        <p>To ensure a smooth and fair examination process, we have established the following rules:</p>\n");
      out.write("        <ul class=\"rules-points\">\n");
      out.write("            <li><strong>Integrity and Honesty:</strong> Maintain integrity and honesty during exams.</li>\n");
      out.write("            <li><strong>No Unauthorized Materials:</strong> Do not use unauthorized materials or aids.</li>\n");
      out.write("            <li><strong>Time Management:</strong> Complete the exam within the allotted time.</li>\n");
      out.write("            <li><strong>Follow Instructions:</strong> Follow all instructions provided during the exam.</li>\n");
      out.write("            <li><strong>Report Issues:</strong> Report any technical issues immediately to the exam proctor.</li>\n");
      out.write("        </ul>\n");
      out.write("    </main>\n");
      out.write("</body>\n");
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
