<%-- 
    Document   : EditProfile
    Created on : 27 Nov, 2024, 7:03:30 PM
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
    <title>Edit Profile</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Arial', sans-serif;
            background: linear-gradient(to bottom, #0a0a0a, #1c1c1c);
            color: #f5f5f5;
            min-height: 100vh;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

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

        .form-container {
            background-color: #222;
            border-radius: 10px;
            box-shadow: 0 6px 12px rgba(0, 238, 255, 0.3);
            margin: 140px auto 20px;
            padding: 25px;
            width: 100%;
            max-width: 700px;
        }

        h2 {
            color: #0ef;
            text-align: center;
            text-transform: uppercase;
            margin-bottom: 20px;
            letter-spacing: 1px;
        }

        form {
            display: flex;
            flex-direction: column;
            gap: 15px;
        }

        label {
            font-weight: bold;
            margin-bottom: 5px;
        }

        input, select {
            width: 97%;
            padding: 10px;
            border: 1px solid #555;
            border-radius: 5px;
            background-color: #333;
            color: #f5f5f5;
        }

        input:focus, select:focus {
            outline: none;
            border-color: #0ef;
        }

        button {
            padding: 12px;
            font-size: 1.2em;
            font-weight: bold;
            background: #0ef;
            color: #111;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background 0.3s, color 0.3s;
        }

        button:hover {
            background: #f5f5f5;
            color: #000;
        }

        .cancel-link {
            text-align: center;
            margin-top: 10px;
            color: #0ef;
            text-decoration: none;
            transition: color 0.3s;
        }

        .cancel-link:hover {
            color: #fff;
        }

        @media (max-width: 768px) {
            .form-container {
                padding: 20px;
            }
        }
    </style>
</head>
<body>
    <nav class="navbar">
        <div class="nav-container">
            <ul class="nav-left">
                <a href="StudentHome.jsp">Home</a>
                <a href="ViewProfile.jsp">View Profile</a>
                <a href="ChangePasswordStudent.jsp">Change Password</a>
            </ul>
            <ul class="nav-right">
                <li><a href="index.html">Logout</a></li>
            </ul>
        </div>
    </nav>

    <div class="form-container">
        <h2>Edit Profile</h2>
        <form action="UpdateProfile" method="POST">
            <%
                String currentUser = (String) session.getAttribute("user");
                if (currentUser != null) {
                    try {
                        DBCon db = new DBCon();
                        db.pstmt = db.con.prepareStatement("SELECT * FROM user_info WHERE u_name = ?");
                        db.pstmt.setString(1, currentUser);
                        db.rst = db.pstmt.executeQuery();

                        if (db.rst.next()) {
            %>
            <label for="dob">Date of Birth</label>
            <input type="date" name="dob" id="dob" value="<%= db.rst.getString("dob") %>" required>

            <label for="gender">Gender</label>
            <select name="gender" id="gender" required>
                <option value="male" <%= db.rst.getString("gender").equals("male") ? "selected" : "" %>>Male</option>
                <option value="female" <%= db.rst.getString("gender").equals("female") ? "selected" : "" %>>Female</option>
            </select>

            <label for="quali1">Qualification 1</label>
            <input type="text" name="quali1" id="qualification1" oninput="convertToUppercase(this)" value="<%= db.rst.getString("quali1") %>" required>

            <label for="quali2">Qualification 2</label>
            <input type="text" name="quali2" id="qualification2" oninput="convertToUppercase(this)" value="<%= db.rst.getString("quali2") %>" required>

            <label for="addr">Address</label>
            <input type="text" name="addr" id="addr" value="<%= db.rst.getString("addr") %>" required>

            <label for="city">City</label>
            <input type="text" name="city" id="city" value="<%= db.rst.getString("city") %>" required>

            <label for="contact">Contact</label>
            <input 
        type="text" 
        name="contact" 
        id="contact" 
        maxlength="10" 
        required 
        oninput="restrictToDigits(this)" 
        pattern="\d{10}" 
        title="Contact number must be exactly 10 digits."
        value="<%= db.rst.getString("contact") %>">

            <label for="email">Email</label>
            <input type="email" name="email" id="email" value="<%= db.rst.getString("email") %>" required>

            <button type="submit">Save Changes</button>
            <a href="StudentHome.jsp" class="cancel-link">Cancel</a>
            <%
                        } else {
                            out.print("<p>Error: No user details found.</p>");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        out.print("<p>Error fetching user details.</p>");
                    }
                } else {
                    out.print("<p>No user logged in.</p>");
                }
            %>
        </form>
    </div>
    <script>
        function convertToUppercase(input) {
            input.value = input.value.toUpperCase();
        }
    </script>
</body>
</html>
