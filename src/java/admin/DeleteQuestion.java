package admin;
import DB.DBCon;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class DeleteQuestion extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            String ques_id = request.getParameter("questionId");
            DBCon db = new DBCon();
            db.pstmt = db.con.prepareStatement("DELETE FROM ques_mstr WHERE ques_id = ?");
            db.pstmt.setString(1, ques_id);
            int rowsDeleted = db.pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                response.sendRedirect("delete_question.jsp?success=Question deleted successfully with Question ID: " + ques_id);
            } else {
                response.sendRedirect("delete_question.jsp?error=Failed to delete the question. Please try again.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
