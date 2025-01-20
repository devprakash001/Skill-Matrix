<%-- 
    Document   : StudentHome
    Created on : 2 Sep, 2024, 9:18:20 PM
    Author     : fujitsu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Module</title>
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
            max-width: 1200px;
            width: 100%;
        }

        .section {
            margin-bottom: 40px;
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            transition: box-shadow 0.3s ease;
        }

        .section:hover {
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
        }

        .section h2 {
            font-size: 2em;
            margin-bottom: 20px;
            text-align: center;
            color: #0099ff;
        }

        .section ul {
            display: grid;
            grid-template-columns: repeat(3, 1fr);
            gap: 20px;
            list-style-type: none;
            padding: 0;
            width: 100%;
        }

        .section li {
            background-color: transparent;
            padding: 0;
            border: 2px solid #0099ff;
            border-radius: 10px;
            text-align: center;
            transition: background-color 0.3s ease, transform 0.3s ease;
            cursor: pointer;
        }

        .section li:hover {
            background-color: #0099ff;
            color: #fff;
            transform: translateY(-5px);
        }

        .section li a {
            display: block;
            height: 100%;
            width: 100%;
            color: inherit;
            text-decoration: none;
            font-size: 1.2em;
            font-weight: bold;
            padding: 20px;
            box-sizing: border-box;
        }

        footer {
            background-color: #1a1a1a;
            color: #fff;
            padding: 20px;
            text-align: center;
            margin-top: -50PX;
            width: 100%;
        }
    </style>
</head>
<body>

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

    <div class="content">
        <section class="section">
            <h2>Student Module</h2>
            <ul>
                <li><a href="ViewProfile.jsp">Profile</a></li>
                <li><a href="EditProfile.jsp">Edit Profile</a></li>
                <li><a href="Exam.jsp">Start Exam</a></li>
                <li><a href="ViewResult.jsp">View Result</a></li>
                <li><a href="DeleteAccount.jsp">Delete Your Account</a></li>
            </ul>
        </section>
    </div>

    <footer>
        <p>&copy; 2024 Student Module. All rights reserved.</p>
    </footer>

</body>
</html>
