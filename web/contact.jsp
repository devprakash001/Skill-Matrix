<%-- 
    Document   : contact
    Created on : 1 Sep, 2024, 7:17:19 PM
    Author     : fujitsu
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Us - Skill Matrix</title>
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

        /* Contact Section */
        .contact-section {
            padding: 60px 20px;
            background-color: #ffffff;
            max-width: 1200px;
            margin: 50px auto;
            border-radius: 20px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            text-align: center;
        }

        .contact-section h1 {
            font-size: 3rem;
            color: #1E3A8A;
            margin-bottom: 30px;
            font-weight: 700;
        }

        .contact-section p {
            font-size: 1.2rem;
            color: #4B5563;
            line-height: 1.6;
            max-width: 900px;
            margin: 0 auto 40px;
        }

        .contact-form {
            display: flex;
            flex-direction: column;
            gap: 20px;
            max-width: 600px;
            margin: 0 auto;
        }

        .contact-form input,
        .contact-form textarea {
            padding: 15px;
            font-size: 1rem;
            border: 1px solid #ccc;
            border-radius: 5px;
            outline: none;
        }

        .contact-form button {
            padding: 15px;
            font-size: 1rem;
            color: #fff;
            background-color: #1E3A8A;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .contact-form button:hover {
            background-color: #0ef;
            color: #1a1a1a;
        }

        .contact-info {
            margin-top: 40px;
        }

        .contact-info p {
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

    <!-- Contact Section -->
    <section class="contact-section">
        <h1>Contact Us</h1>
        <p>We'd love to hear from you! Whether you have questions, suggestions, or just want to say hello, please reach out to us using the form below.</p>
        
        <form class="contact-form" action="submit_contact.jsp" method="post">
            <input type="text" name="name" placeholder="Your Name" required>
            <input type="email" name="email" placeholder="Your Email" required>
            <textarea rows="6" name="message" placeholder="Your Message" required></textarea>
            <button type="submit">Send Message</button>
        </form>

        <div class="contact-info">
            <p>📞 Phone: +91 98380 11971</p>
            <p>📞 Phone: +91 8707331446</p>
            <p>📧 Email: devsingh98011@gmail.com</p>
            <p>📧 Email: aayushjaiswal878@gmail.com</p>
            <p>🏢 Address: 1/253 Jankipuram Extension, Lucknow, Uttar Pradesh (226021)</p>
        </div>
    </section>

    <!-- Footer -->
    <footer>
        <p>&copy; 2024 Skill Matrix. All rights reserved.</p>
    </footer>
</body>
</html>
