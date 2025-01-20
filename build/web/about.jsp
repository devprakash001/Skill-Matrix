<%-- 
    Document   : about
    Created on : 1 Sep, 2024, 7:12:41 PM
    Author     : fujitsu
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>About Skill Matrix</title>
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

        /* About Section */
        .about-section {
            padding: 60px 20px;
            background-color: #ffffff;
            max-width: 1200px;
            margin: 50px auto;
            border-radius: 20px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            text-align: center;
        }

        .about-section h1 {
            font-size: 3rem;
            color: #1E3A8A;
            margin-bottom: 30px;
            font-weight: 700;
        }

        .about-section p {
            font-size: 1.2rem;
            color: #4B5563;
            line-height: 1.6;
            max-width: 900px;
            margin: 0 auto 40px;
        }

        .about-image {
            width: 100%;
            max-width: 600px;
            border-radius: 15px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            margin: 20px 0;
        }

        /* Features Section */
        .features-section {
            padding: 60px 20px;
            background-color: #EFF6FF;
            text-align: center;
            margin-top: 50px;
        }

        .features-section h2 {
            font-size: 2.5rem;
            margin-bottom: 40px;
            color: #1E3A8A;
            font-weight: 700;
        }

        .features {
            display: flex;
            flex-wrap: wrap;
            gap: 40px;
            justify-content: center;
        }

        .feature-item {
            background-color: #fff;
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            max-width: 300px;
            text-align: left;
            transition: transform 0.3s ease;
        }

        .feature-item:hover {
            transform: translateY(-10px);
        }

        .feature-item h3 {
            font-size: 1.5rem;
            color: #1E3A8A;
            margin-bottom: 15px;
            font-weight: 600;
        }

        .feature-item p {
            font-size: 1rem;
            color: #4B5563;
            line-height: 1.5;
        }

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

    <!-- About Section -->
    <section class="about-section">
        <h1>About Skill Matrix</h1>
        <p>Welcome to Skill Matrix, the ultimate platform to enhance your skills and unlock your full potential. We are committed to providing innovative tools and resources for learners and professionals alike.</p>
        <img src="images/Skill-Matrix-Competency-Matrix-article-with-templates.jpg" alt="About Skill Matrix" class="about-image">
        <p>At Skill Matrix, we believe in continuous growth and development. Our platform offers personalized learning paths, skill assessments, and a vibrant community to help you achieve your goals.</p>
    </section>

    <!-- Features Section -->
    <section class="features-section">
        <h2>Why Choose Skill Matrix?</h2>
        <div class="features">
            <div class="feature-item">
                <h3>Comprehensive Assessments</h3>
                <p>Evaluate your skills with our tailored assessments designed for every industry.</p>
            </div>
            <div class="feature-item">
                <h3>Personalized Learning</h3>
                <p>Enjoy flexible learning paths to match your unique goals and schedule.</p>
            </div>
            <div class="feature-item">
                <h3>Collaborative Community</h3>
                <p>Engage with like-minded individuals to share ideas and grow together.</p>
            </div>
        </div>
    </section>

    <!-- Footer -->
    <footer>
        <p>&copy; 2024 Skill Matrix. All rights reserved.</p>
    </footer>
</body>
</html>
