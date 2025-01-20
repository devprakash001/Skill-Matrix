package admin;
import DB.DBCon;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AddQuestion extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            String question = request.getParameter("question");
            String option1 = request.getParameter("option1");
            String option2 = request.getParameter("option2");
            String option3 = request.getParameter("option3");
            String option4 = request.getParameter("option4");
            String correctAnswer = request.getParameter("correctAnswer");
            DBCon db = new DBCon();
            db.pstmt = db.con.prepareStatement("INSERT INTO ques_mstr (que, op1, op2, op3, op4, ans) VALUES (?, ?, ?, ?, ?, ?)");
            db.pstmt.setString(1, question);
            db.pstmt.setString(2, option1);
            db.pstmt.setString(3, option2);
            db.pstmt.setString(4, option3);
            db.pstmt.setString(5, option4);
            db.pstmt.setString(6, correctAnswer);
            int rowsInserted = db.pstmt.executeUpdate();
            if (rowsInserted > 0) {
                response.sendRedirect("add_question.jsp?success=Question added successfully");
            } else {
                response.sendRedirect("add_question.jsp?error=Failed to add question. Try again.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
