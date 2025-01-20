package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DB.DBCon;

public final class Exam_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Start Exam</title>\n");
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
      out.write("        .navbar {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("            padding: 15px 30px;\n");
      out.write("            background-color: #333;\n");
      out.write("            color: #fff;\n");
      out.write("            position: fixed;\n");
      out.write("            top: 0;\n");
      out.write("            left: 0;\n");
      out.write("            width: 100%;\n");
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
      out.write("        .content {\n");
      out.write("            padding: 80px 20px 20px;\n");
      out.write("            max-width: 800px;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .question {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            background-color: #fff;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            padding: 15px;\n");
      out.write("            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .question h3 {\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .options {\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .options label {\n");
      out.write("            display: block;\n");
      out.write("            margin: 5px 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .submit-btn {\n");
      out.write("            background-color: #0ef;\n");
      out.write("            color: #000;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            transition: background 0.3s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .submit-btn:hover {\n");
      out.write("            background-color: #00bfff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .timer {\n");
      out.write("            font-size: 1.2em;\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            color: #0ef;\n");
      out.write("            position: fixed;\n");
      out.write("            top: 70px;\n");
      out.write("            right: 20px;\n");
      out.write("            background-color: rgba(255, 255, 255, 0.8);\n");
      out.write("            padding: 10px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar\">\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"StudentHome.jsp\">Home</a></li>\n");
      out.write("            <li><a href=\"ChangePasswordStudent.jsp\">Change Password</a></li>\n");
      out.write("            <li><a href=\"index.html\">Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div id=\"timer\" class=\"timer\">Time Remaining: 02:00</div>\n");
      out.write("\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <h2>Start Exam</h2>\n");
      out.write("        <form id=\"examForm\" action=\"SubmitExam.jsp\" method=\"post\">\n");
      out.write("            <input type=\"hidden\" id=\"timeSpent\" name=\"timeSpent\" value=\"0\">\n");
      out.write("            ");

                DBCon db = new DBCon();
                try {
                    db.pstmt = db.con.prepareStatement("SELECT * FROM ques_mstr");
                    db.rst = db.pstmt.executeQuery();
                    while(db.rst.next()) {
            
      out.write("\n");
      out.write("            <div class=\"question\">\n");
      out.write("                <h3>");
      out.print( db.rst.getString("que") );
      out.write("</h3>\n");
      out.write("                <div class=\"options\">\n");
      out.write("                    <label>\n");
      out.write("                        <input type=\"radio\" name=\"question_");
      out.print( db.rst.getInt("ques_id") );
      out.write("\" value=\"");
      out.print( db.rst.getString("op1") );
      out.write("\">\n");
      out.write("                        ");
      out.print( db.rst.getString("op1") );
      out.write("\n");
      out.write("                    </label>\n");
      out.write("                    <label>\n");
      out.write("                        <input type=\"radio\" name=\"question_");
      out.print( db.rst.getInt("ques_id") );
      out.write("\" value=\"");
      out.print( db.rst.getString("op2") );
      out.write("\">\n");
      out.write("                        ");
      out.print( db.rst.getString("op2") );
      out.write("\n");
      out.write("                    </label>\n");
      out.write("                    <label>\n");
      out.write("                        <input type=\"radio\" name=\"question_");
      out.print( db.rst.getInt("ques_id") );
      out.write("\" value=\"");
      out.print( db.rst.getString("op3") );
      out.write("\">\n");
      out.write("                        ");
      out.print( db.rst.getString("op3") );
      out.write("\n");
      out.write("                    </label>\n");
      out.write("                    <label>\n");
      out.write("                        <input type=\"radio\" name=\"question_");
      out.print( db.rst.getInt("ques_id") );
      out.write("\" value=\"");
      out.print( db.rst.getString("op4") );
      out.write("\">\n");
      out.write("                        ");
      out.print( db.rst.getString("op4") );
      out.write("\n");
      out.write("                    </label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");

                    }
                } catch(Exception e) {
                    e.printStackTrace();
                }
            
      out.write("\n");
      out.write("            <button type=\"submit\" class=\"submit-btn\">Submit Exam</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        document.addEventListener('DOMContentLoaded', function() {\n");
      out.write("            let timeLeft = 120; // 2 minutes in seconds\n");
      out.write("            const timerDisplay = document.getElementById('timer');\n");
      out.write("            const examForm = document.getElementById('examForm');\n");
      out.write("            const timeSpentInput = document.getElementById('timeSpent');\n");
      out.write("\n");
      out.write("            function updateTimer() {\n");
      out.write("                const minutes = Math.floor(timeLeft / 60);\n");
      out.write("                const seconds = timeLeft % 60;\n");
      out.write("                timerDisplay.textContent = `Time Remaining: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${minutes}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(':');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${seconds < 10 ? '0' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${seconds}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("`;\n");
      out.write("                \n");
      out.write("                if (timeLeft <= 0) {\n");
      out.write("                    clearInterval(timerInterval);\n");
      out.write("                    examForm.submit();\n");
      out.write("                } else {\n");
      out.write("                    timeLeft--;\n");
      out.write("                    timeSpentInput.value = 120 - timeLeft; // Time spent in seconds\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            const timerInterval = setInterval(updateTimer, 1000);\n");
      out.write("\n");
      out.write("            examForm.addEventListener('submit', function() {\n");
      out.write("                clearInterval(timerInterval);\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            // Initial call to set the timer immediately\n");
      out.write("            updateTimer();\n");
      out.write("        });\n");
      out.write("    </script>\n");
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
