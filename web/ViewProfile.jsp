<%-- 
    Document   : ViewProfile
    Created on : 12 Sep, 2024, 2:51:46 PM
    Author     : fujitsu
--%>

<%@page import="DB.DBCon"%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Profile</title>
    <style>
        body {
            display: flex;
            flex-direction: column;
            align-items: center;
            background-color: #000;
            margin: 0;
            padding-top: 80px;
            color: #fff;
            font-family: 'Arial', sans-serif;
        }

        /* Navigation Bar */
        .navbar {
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 20px;
            background-color: #111;
            box-shadow: 0 2px 10px rgba(0, 78, 146, 0.7);
            position: fixed;
            top: 0;
            width: 100%;
            z-index: 1000;
        }

        .nav-container {
            display: flex;
            justify-content: space-between;
            width: 100%;
            max-width: 1200px;
            padding: 0 20px;
        }

        .nav-left, .nav-right {
            display: flex;
            gap: 20px;
        }

        .nav-left li, .nav-right li {
            list-style: none;
        }

        .nav-left a, .nav-right a {
            text-decoration: none;
            color: #fff;
            padding: 10px 20px;
            transition: background-color 0.3s, color 0.3s;
            border-radius: 5px;
            border: 2px solid #0ef;
        }

        .nav-left a:hover, .nav-right a:hover {
            background-color: #0ef;
            color: #000;
        }

        /* Content Area */
        .content {
            padding: 20px;
            max-width: 800px;
            width: 100%;
            margin-top: 20px;
        }

        h2 {
            font-size: 2.5em;
            text-align: center;
            margin-bottom: 20px;
            color: #0ef;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.6);
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 40px;
            background-color: #333;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 6px 12px rgba(0, 0, 0, 0.4);
        }

        th, td {
            padding: 15px 20px;
            text-align: left;
            font-size: 1.2em;
        }

        th {
            background-color: #444;
            color: #0ef;
            border-bottom: 2px solid #555;
        }

        td {
            background-color: #222;
            color: #ddd;
        }

        /* Table row hover effect */
        tr:hover td {
            background-color: #0ef;
            color: #000;
        }

        /* Back Button Styling */
        .back-btn {
            padding: 15px 30px;
            font-size: 1.2em;
            color: #000;
            background: #0ef;
            border: none;
            border-radius: 10px;
            cursor: pointer;
            text-decoration: none;
            transition: background 0.3s ease, color 0.3s ease;
            margin-bottom: 20px;
            box-shadow: 0 6px 12px rgba(0, 238, 255, 0.4);
        }

        .back-btn:hover {
            background: #fff;
            color: #000;
            box-shadow: 0 0 20px #0ef, 0 0 60px #0ef, 0 0 100px #0ef;
        }

    </style>
</head>
<body>

    <!-- Customized Navigation Bar -->
    <nav class="navbar">
        <div class="nav-container">
            <ul class="nav-left">
                <li><a href="StudentHome.jsp">Home</a></li>
                <li><a href="EditProfile.jsp">Edit Profile</a></li>
                <li><a href="ChangePasswordStudent.jsp">Change Password</a></li>
            </ul>
            <ul class="nav-right">
                <li><a href="index.html">Logout</a></li>
            </ul>
        </div>
    </nav>

    <div class="content">
        <h2>Your Profile</h2>

        <div class="table-container">
            <%
                String currentUser = (String) session.getAttribute("user");
                if (currentUser != null) {
                    try {
                        DBCon db = new DBCon();
                        db.pstmt = db.con.prepareStatement("SELECT * FROM user_info WHERE u_name = ?");
                        db.pstmt.setString(1, currentUser);
                        db.rst = db.pstmt.executeQuery();

                        if (db.rst.next()) {
                            out.print("<table>");
                            out.print("<tr><th>Field</th><th>Value</th></tr>");
                            out.print("<tr><td>Username</td><td>" + db.rst.getString("u_name") + "</td></tr>");
                            out.print("<tr><td>Date of Birth</td><td>" + db.rst.getString("dob") + "</td></tr>");
                            out.print("<tr><td>Gender</td><td>" + db.rst.getString("gender") + "</td></tr>");
                            out.print("<tr><td>Qualification 1</td><td>" + db.rst.getString("quali1") + "</td></tr>");
                            out.print("<tr><td>Qualification 2</td><td>" + db.rst.getString("quali2") + "</td></tr>");
                            out.print("<tr><td>Address</td><td>" + db.rst.getString("addr") + "</td></tr>");
                            out.print("<tr><td>City</td><td>" + db.rst.getString("city") + "</td></tr>");
                            out.print("<tr><td>Contact</td><td>" + db.rst.getString("contact") + "</td></tr>");
                            out.print("<tr><td>Email</td><td>" + db.rst.getString("email") + "</td></tr>");
                            out.print("</table>");
                        } else {
                            out.print("<p>No details found for the user: " + currentUser + "</p>");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        out.print("<p>Error retrieving user details. Please try again later.</p>");
                    }
                } else {
                    out.print("<p>No user logged in.</p>");
                }
            %>
        </div>
    </div>

    <a href="StudentHome.jsp" class="back-btn">Back to Home</a>

</body>
</html>
