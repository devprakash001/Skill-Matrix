/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package student;
import DB.DBCon;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class UpdateProfile extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            HttpSession session=request.getSession();
            String username = session.getAttribute("user").toString();
            String dob = request.getParameter("dob");
            String gender = request.getParameter("gender");
            String quali1 = request.getParameter("quali1");
            String quali2 = request.getParameter("quali2");
            String address = request.getParameter("addr");
            String city = request.getParameter("city");
            String contact = request.getParameter("contact");
            String email = request.getParameter("email");
            DBCon db = new DBCon();
            db.pstmt = db.con.prepareStatement("UPDATE user_info SET dob = ?, gender = ?, quali1 = ?, quali2 = ?, addr = ?, city = ?, contact = ?, email = ? WHERE u_name = ?");
            db.pstmt.setString(1, dob);
            db.pstmt.setString(2, gender);
            db.pstmt.setString(3, quali1);
            db.pstmt.setString(4, quali2);
            db.pstmt.setString(5, address);
            db.pstmt.setString(6, city);
            db.pstmt.setString(7, contact);
            db.pstmt.setString(8, email);
            db.pstmt.setString(9, username);
            int i = db.pstmt.executeUpdate();
            if (i > 0) {
                response.sendRedirect("EditProfile.jsp?success=Profile updated successfully");
            } else {
                response.sendRedirect("EditProfile.jsp?error=Failed to update the profile. Please try again.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}