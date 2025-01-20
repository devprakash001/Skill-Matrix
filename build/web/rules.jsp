<%@page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rules - Skill Matrix</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap');

        body {
            font-family: 'Poppins', sans-serif;
            margin: 0;
            padding: 0;
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
        
        .neon-nav-left {
            margin-left: -30px; /* Adjusted the right margin to pull the 'Register' button inwards */
            gap: 25px; /* Reduced gap to bring 'Login' and 'Register' closer */
        }
        
        .neon-nav-right {
            margin-right: 50px; /* Adjusted the right margin to pull the 'Register' button inwards */
            gap: 15px; /* Reduced gap to bring 'Login' and 'Register' closer */
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

        /* Rules Section */
        .rules-section {
            padding: 60px 20px;
            background-color: #ffffff;
            max-width: 1200px;
            margin: 50px auto;
            border-radius: 20px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            text-align: center;
        }

        .rules-section h1 {
            font-size: 3rem;
            color: #1E3A8A;
            margin-bottom: 30px;
            font-weight: 700;
        }

        .rules-section p {
            font-size: 1.2rem;
            color: #4B5563;
            line-height: 1.6;
            max-width: 900px;
            margin: 0 auto 40px;
        }

        .rules-points {
            text-align: left;
            list-style: none;
            padding: 0;
            max-width: 800px;
            margin: 20px auto;
        }

        .rules-points li {
            margin-bottom: 15px;
            font-size: 1.2rem;
            color: #333;
            line-height: 1.5;
        }

        .rules-points li strong {
            color: #1E3A8A;
        }

        /* Footer */
        footer {
            background-color: #1a1a1a;
            color: #fff;
            padding: 20px;
            text-align: center;
            margin-top: 40px;
            width: 100%;
        }
    </style>
</head>
<body>
    <!-- Navigation Bar -->
    <nav class="neon-navbar">
        <ul class="neon-nav-left">
            <li><a href="index.html">Home</a></li>
            <li><a href="about.jsp">About</a></li>
            <li><a href="rules.jsp">Rules</a></li>
            <li><a href="contact.jsp">Contact</a></li>
        </ul>
        <ul class="neon-nav-right">
            <li><a href="Login.jsp" class="neon-btn">Login</a></li>
            <li><a href="Registration.jsp" class="neon-btn">Register</a></li>
        </ul>
    </nav>

    <!-- Rules Section -->
    <section class="rules-section">
        <h1>Rules of Skill Matrix</h1>
        <p>To maintain a smooth and ethical experience on our platform, please follow the guidelines below:</p>
        <ul class="rules-points">
            <li><strong>Integrity and Honesty:</strong> Always act with integrity during assessments.</li>
            <li><strong>No Unauthorized Materials:</strong> Using unauthorized resources is strictly prohibited.</li>
            <li><strong>Time Management:</strong> Adhere to the time limits for each activity.</li>
            <li><strong>Follow Instructions:</strong> Carefully follow all provided guidelines.</li>
            <li><strong>Report Issues:</strong> Immediately report any technical problems or concerns.</li>
        </ul>
    </section>

    <!-- Footer -->
    <footer>
        <p>&copy; 2024 Skill Matrix. All rights reserved. | <a href="contact.jsp" style="color: #0ef;">Contact Us</a></p>
    </footer>
</body>
</html>
