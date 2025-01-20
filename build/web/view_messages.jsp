<%-- 
    Document   : view_messages
    Created on : 13 Sep, 2024, 8:22:37 PM
    Author     : fujitsu
--%>

<%@ page import="java.sql.*, DB.DBCon" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Contact Messages - Admin</title>
    <style>
        body {
            display: flex;
            flex-direction: column;
            align-items: center;
            background-color: #000;
            color: #fff;
            margin: 0;
            padding-top: 80px;
        }

        /* Navigation Bar */
        .navbar {
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 20px;
            background-color: #000;
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
            gap: 15px;
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
            padding: 100px 20px;
            max-width: 1200px;
            width: 100%;
        }

        /* Table Styling */
        table {
            width: 100%;
            margin: 50px 0;
            border-collapse: collapse;
            border-radius: 8px;
            overflow: hidden;
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 15px;
            text-align: left;
            word-wrap: break-word;
        }

        th {
            background-color: #333;
            color: white;
            font-size: 1.2em;
            font-weight: bold;
        }

        td {
            background-color: #fff;
            color: #333;
        }

        tr:nth-child(even) td {
            background-color: #f9f9f9;
        }

        tr:hover td {
            background-color: #e0e0e0;
            cursor: pointer;
        }

        /* Back Button */
        .back-btn {
            margin-top: 20px;
            padding: 10px 20px;
            font-size: 1em;
            color: #000;
            background: #0ef;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            text-decoration: none;
            margin: -50px;
            transition: background 0.3s ease, color 0.3s ease;
        }

        .back-btn:hover {
            background: #fff;
            color: #000;
            box-shadow: 0 0 10px #0ef, 0 0 40px #0ef, 0 0 80px #0ef;
        }
    </style>
</head>
<body>

    <!-- Navigation Bar -->
    <nav class="navbar">
        <div class="nav-container">
            <ul class="nav-left">
                <li><a href="AdminHome.jsp">Home</a></li>
                <li><a href="ChangePasswordAdmin.jsp">Change Password</a></li>
                <li><a href="index.html">Logout</a></li>
            </ul>
        </div>
    </nav>

    <!-- Content Section -->
    <div class="content">
        <section class="section">
            <h2>Messages from Contact Form</h2>
            <table>
                <tr>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Message</th>
                </tr>
                <%
                    DBCon db = null;
                    try {
                        db = new DBCon();
                        db.pstmt = db.con.prepareStatement("SELECT name, email, message FROM contact_feed");
                        db.rst = db.pstmt.executeQuery();
                        
                        while (db.rst.next()) {
                %>
                            <tr>
                                <td><%= db.rst.getString("name") %></td>
                                <td><%= db.rst.getString("email") %></td>
                                <td><%= db.rst.getString("message") %></td>
                            </tr>
                <%
                        }
                    } catch (Exception e) {
                        out.println("<tr><td colspan='3'>Error fetching messages</td></tr>");
                    }
                %>
            </table>
        </section>
    </div>

    <a href="AdminHome.jsp" class="back-btn">Back</a>

</body>
</html>
