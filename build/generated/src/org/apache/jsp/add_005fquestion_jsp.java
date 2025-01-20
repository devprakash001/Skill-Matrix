package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005fquestion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Add Question</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            background-color: #000;\n");
      out.write("            color: #fff;\n");
      out.write("            height: 100vh;\n");
      out.write("            padding-top: 80px;\n");
      out.write("            margin: 0;\n");
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
      out.write("        .nav-left,\n");
      out.write("        .nav-right {\n");
      out.write("            display: flex;\n");
      out.write("            gap: 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav-left li,\n");
      out.write("        .nav-right li {\n");
      out.write("            list-style: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav-left a,\n");
      out.write("        .nav-right a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            transition: background-color 0.3s, color 0.3s;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            border: 2px solid #0ef;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav-left a:hover,\n");
      out.write("        .nav-right a:hover {\n");
      out.write("            background-color: #0ef;\n");
      out.write("            color: #000;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Floating Label Form Styling */\n");
      out.write("        .wrapper {\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            width: 400px;\n");
      out.write("            margin-top: 75px;\n");
      out.write("            background: transparent;\n");
      out.write("            border: 5px solid #333;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            padding: 30px;\n");
      out.write("            transition: .5s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper:hover {\n");
      out.write("            border: 5px solid #0ef;\n");
      out.write("            box-shadow: 0 0 20px #0ef, inset 0 0 20px #0ef;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h2 {\n");
      out.write("            font-size: 2em;\n");
      out.write("            text-align: center;\n");
      out.write("            color: #fff;\n");
      out.write("            transition: .5s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper:hover h2 {\n");
      out.write("            color: #0ef;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input-box {\n");
      out.write("            position: relative;\n");
      out.write("            width: 100%;\n");
      out.write("            margin: 20px 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input-box input,\n");
      out.write("        .input-box textarea {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            font-size: 1em;\n");
      out.write("            color: #fff;\n");
      out.write("            background: transparent;\n");
      out.write("            border: none;\n");
      out.write("            border-bottom: 2px solid #fff;\n");
      out.write("            outline: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input-box input:focus,\n");
      out.write("        .input-box textarea:focus {\n");
      out.write("            border-bottom: 2px solid #0ef;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input-box label {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 10px;\n");
      out.write("            left: 10px;\n");
      out.write("            font-size: 1em;\n");
      out.write("            color: #aaa;\n");
      out.write("            transition: 0.3s ease;\n");
      out.write("            pointer-events: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input-box input:focus ~ label,\n");
      out.write("        .input-box textarea:focus ~ label,\n");
      out.write("        .input-box input:not(:placeholder-shown) ~ label,\n");
      out.write("        .input-box textarea:not(:placeholder-shown) ~ label {\n");
      out.write("            top: -20px;\n");
      out.write("            left: 10px;\n");
      out.write("            font-size: 0.8em;\n");
      out.write("            color: #0ef;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .submit-btn {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            font-size: 1em;\n");
      out.write("            color: #fff;\n");
      out.write("            background: #0ef;\n");
      out.write("            border: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("            transition: background 0.3s ease, color 0.3s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .submit-btn:hover {\n");
      out.write("            background: #fff;\n");
      out.write("            color: #000;\n");
      out.write("            box-shadow: 0 0 10px #0ef, 0 0 40px #0ef, 0 0 80px #0ef;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- Navigation Bar -->\n");
      out.write("    <nav class=\"navbar\">\n");
      out.write("        <div class=\"nav-container\">\n");
      out.write("            <ul class=\"nav-left\">\n");
      out.write("                <li><a href=\"AdminHome.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"ChangePasswordAdmin.jsp\">Change Password</a></li>\n");
      out.write("                <li><a href=\"index.html\">Logout</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <!-- Add Question Form -->\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("        <h2>Add Question</h2>\n");
      out.write("        <form action=\"AddQuestion\" method=\"post\">\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <input type=\"text\" id=\"ques_id\" name=\"ques_id\" placeholder=\" \" required>\n");
      out.write("                <label for=\"ques_id\">Question ID:</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <input type=\"text\" id=\"question\" name=\"question\" placeholder=\" \" required>\n");
      out.write("                <label for=\"question\">Question:</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <input type=\"text\" id=\"option1\" name=\"option1\" placeholder=\" \" required>\n");
      out.write("                <label for=\"option1\">Option 1:</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <input type=\"text\" id=\"option2\" name=\"option2\" placeholder=\" \" required>\n");
      out.write("                <label for=\"option2\">Option 2:</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <input type=\"text\" id=\"option3\" name=\"option3\" placeholder=\" \" required>\n");
      out.write("                <label for=\"option3\">Option 3:</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <input type=\"text\" id=\"option4\" name=\"option4\" placeholder=\" \" required>\n");
      out.write("                <label for=\"option4\">Option 4:</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <input type=\"text\" id=\"correctAnswer\" name=\"correctAnswer\" placeholder=\" \" required>\n");
      out.write("                <label for=\"correctAnswer\">Correct Answer:</label>\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"submit-btn\">Add Question</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
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
