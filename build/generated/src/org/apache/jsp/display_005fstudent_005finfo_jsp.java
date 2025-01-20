package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import DB.DBCon;

public final class display_005fstudent_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Display Student Info</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles.css\"> <!-- Link to your common CSS file -->\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-color: #f0f0f0;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding-top: 80px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Navigation Bar */\n");
      out.write("        .navbar {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: #333;\n");
      out.write("            position: fixed;\n");
      out.write("            top: 0;\n");
      out.write("            width: 100%;\n");
      out.write("            z-index: 1000;\n");
      out.write("            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.5);\n");
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
      out.write("            border-radius: 5px;\n");
      out.write("            transition: background-color 0.3s, color 0.3s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav-left a:hover,\n");
      out.write("        .nav-right a:hover {\n");
      out.write("            background-color: #0ef;\n");
      out.write("            color: #000;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* User Details Display */\n");
      out.write("        .user-details {\n");
      out.write("            background-color: #fff;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            margin: 20px auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            width: 80%;\n");
      out.write("            max-width: 600px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .user-details h2 {\n");
      out.write("            text-align: center;\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .user-details p {\n");
      out.write("            font-size: 1.1em;\n");
      out.write("            color: #555;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
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
      out.write("    <!-- User Details -->\n");
      out.write("    ");

        String username = request.getParameter("username");
        if (username != null && !username.isEmpty()) {
            Connection connection = null;
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;
            try {
                // Use the DBCon class to get the database connection
                connection = DBCon.getConnection();

                // Query to search user
                String query = "SELECT * FROM user_info WHERE u_name = ?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    // Display user details
                    out.println("<div class='user-details'>");
                    out.println("<h2>User Details</h2>");
                    out.println("<p><strong>Username:</strong> " + resultSet.getString("u_name") + "</p>");
                    out.println("<p><strong>Password:</strong> " + resultSet.getString("pswd") + "</p>");
                    out.println("<p><strong>Date of Registration:</strong> " + resultSet.getString("d_reg") + "</p>");
                    out.println("<p><strong>Date of Birth:</strong> " + resultSet.getString("dob") + "</p>");
                    out.println("<p><strong>Gender:</strong> " + resultSet.getString("gender") + "</p>");
                    out.println("<p><strong>Qualification 1:</strong> " + resultSet.getString("quali1") + "</p>");
                    out.println("<p><strong>Qualification 2:</strong> " + resultSet.getString("quali2") + "</p>");
                    out.println("<p><strong>Address:</strong> " + resultSet.getString("addr") + "</p>");
                    out.println("<p><strong>City:</strong> " + resultSet.getString("city") + "</p>");
                    out.println("<p><strong>Contact:</strong> " + resultSet.getString("contact") + "</p>");
                    out.println("<p><strong>Email:</strong> " + resultSet.getString("email") + "</p>");
                    out.println("</div>");
                } else {
                    out.println("<h2>No record found for the username: " + username + "</h2>");
                }
            } catch (Exception e) {
                out.println("Error: " + e.getMessage());
            } finally {
                // Closing the resources
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            }
        } else {
            out.println("<h2>Please enter a username.</h2>");
        }
    
      out.write("\n");
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
