package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DB.DBCon;

public final class SubmitExam_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Exam Result</title>\n");
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
      out.write("        .content {\n");
      out.write("            padding: 80px 20px;\n");
      out.write("            max-width: 800px;\n");
      out.write("            width: 100%;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .result {\n");
      out.write("            background-color: #fff;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            padding: 20px;\n");
      out.write("            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .score {\n");
      out.write("            font-size: 2em;\n");
      out.write("            color: #0ef;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav-link {\n");
      out.write("            display: inline-block;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: #0ef;\n");
      out.write("            color: #000;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav-link:hover {\n");
      out.write("            background-color: #00bfff;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <h2>Exam Result</h2>\n");
      out.write("        <div class=\"result\">\n");
      out.write("            ");

                int score = 0;
                int totalQuestions = 0;

                DBCon db = new DBCon();
                try {
                    db.pstmt = db.con.prepareStatement("SELECT * FROM ques_mstr"); // Adjust table name if needed
                    db.rst = db.pstmt.executeQuery();
                    
                    while (db.rst.next()) {
                        totalQuestions++;
                        int quesId = db.rst.getInt("ques_id");
                        String correctAnswer = db.rst.getString("ans").trim(); // Trim correct answer
                        String userAnswer = request.getParameter("question_" + quesId); // Get user answer

                        // Check if the user answer is not null and compare it correctly
                        if (userAnswer != null && userAnswer.trim().equalsIgnoreCase(correctAnswer)) {
                            score++;
                        }
                    }
            
      out.write("\n");
      out.write("            <p class=\"score\">Your Score: ");
      out.print( score );
      out.write(" out of ");
      out.print( totalQuestions );
      out.write("</p>\n");
      out.write("            ");

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    db.close(); // Ensure database connection is closed properly
                }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <a href=\"StudentHome.jsp\" class=\"nav-link\">Back to Home</a>\n");
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
