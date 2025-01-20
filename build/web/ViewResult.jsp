<%-- 
    Document   : ViewResult
    Created on : 13 Sep, 2024, 6:40:25 PM
    Author     : fujitsu
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="DB.DBCon"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Exam Result</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap');

        body {
            font-family: 'Poppins', sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            background-color: #f4f4f4;
            color: #333;
        }

        /* Neon Navigation Bar */
        .neon-navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 15px 30px;
            background-color: #1a1a1a;
            box-shadow: 0 2px 10px rgba(0, 78, 146, 0.7);
            position: sticky;
            top: 0;
            width: 100%;
            z-index: 1000;
        }

        .neon-nav-left,
        .neon-nav-right {
            display: flex;
            gap: 25px;
            align-items: center;
        }

        .neon-nav-right {
            margin-right: 20px;
            gap: 15px;
        }

        .neon-nav-left li,
        .neon-nav-right li {
            list-style: none;
        }

        .neon-nav-left a,
        .neon-nav-right a {
            text-decoration: none;
            color: #0ef;
            padding: 10px 20px;
            border: 2px solid #0ef;
            border-radius: 5px;
            transition: all 0.3s ease;
            font-weight: 600;
            text-transform: uppercase;
            font-size: 0.9rem;
        }

        .neon-nav-left a:hover,
        .neon-nav-right a:hover {
            background-color: #0ef;
            color: #1a1a1a;
            box-shadow: 0 0 10px #0ef, 0 0 20px #0ef, 0 0 30px #0ef;
        }

        .content {
            padding: 100px 20px;
            max-width: 800px;
            width: 100%;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
            background-color: #fff;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        }

        table th, table td {
            padding: 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        table th {
            background-color: #333;
            color: white;
        }

        .no-result {
            background-color: #f9f9f9;
            padding: 20px;
            text-align: center;
            border: 1px solid #ccc;
            margin-top: 20px;
        }
    </style>
</head>
<body>

    <!-- Neon Navigation Bar -->
    <nav class="neon-navbar">
        <ul class="neon-nav-left">
            <li><a href="StudentHome.jsp">Home</a></li>
            <li><a href="ChangePasswordStudent.jsp">Change Password</a></li>
            <li><a href="index.html">Logout</a></li>
        </ul>
        <ul class="neon-nav-right">
            <!-- You can add additional links here if required -->
        </ul>
    </nav>

    <!-- Exam Result Content -->
    <div class="content">
        <h2>Your Exam Result</h2>
        <div class="result">
            <%
                String userId = (String)session.getAttribute("user");

                DBCon db = new DBCon();
                try {
                    PreparedStatement pstmt = db.con.prepareStatement("SELECT * FROM result_mstr WHERE user_id = ?");
                    pstmt.setString(1, userId);
                    ResultSet rst = pstmt.executeQuery();

                    if (rst.next()) {
            %>
            <table>
                <tr>
                    <th>Exam Date</th>
                    <th>Score</th>
                    <th>Total Attempts</th>
                    <th>Correct Answers</th>
                </tr>
                <tr>
                    <td><%= rst.getString("exam_date") %></td>
                    <td><%= rst.getInt("score") %></td>
                    <td><%= rst.getInt("t_attempt") %></td>
                    <td><%= rst.getInt("c_answer") %></td>
                </tr>
            </table>
            <%
                    } else {
            %>
            <div class="no-result">No result found for this user.</div>
            <%
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            %>
        </div>
    </div>

</body>
</html>
