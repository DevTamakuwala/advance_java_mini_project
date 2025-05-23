<!DOCTYPE html>

<%
    if (session.getAttribute("userEmail") != null) {
        String userType = (String) session.getAttribute("user_type");
        if ("student".equals(userType)) {
            response.sendRedirect("student_dashboard.jsp");
        } else if ("admin".equals(userType)) {
            response.sendRedirect("admin_dashboard.jsp");
        }
    }
%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Library Registration</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins:400,600&display=swap">
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Poppins', sans-serif;
        }

        body, html {
            height: 100%;
        }

        body {
            background: url('./images/register.jpg') no-repeat center center/cover;
            backdrop-filter: blur(5px);
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .glass-form {
            background: rgba(255, 255, 255, 0.1);
            backdrop-filter: blur(10px);
            border-radius: 15px;
            padding: 40px;
            width: 400px;
            box-shadow: 0 8px 32px rgba(0, 0, 0, 0.25);
            color: white;
        }

        .form-title {
            text-align: center;
            font-size: 28px;
            margin-bottom: 30px;
            color: #fff;
        }

        .form-group {
            margin-bottom: 20px;
            position: relative;
        }

        .form-group input {
            width: 100%;
            padding: 10px 15px;
            border: none;
            border-radius: 8px;
            outline: none;
            font-size: 16px;
        }

        .form-submit {
            width: 100%;
            padding: 12px;
            border: none;
            background: #4CAF50;
            color: white;
            font-size: 18px;
            border-radius: 8px;
            cursor: pointer;
        }

        .form-submit:hover {
            background: #45a049;
        }

        .signup-image-link {
            display: block;
            text-align: center;
            margin-top: 20px;
            color: #fff;
            text-decoration: underline;
        }

    </style>
</head>
<body>

    <div class="glass-form">
        <h2 class="form-title">REGISTRATION</h2>
<form class="register-form" id="register-form" method="POST" action="register">
            <div class="form-group">
                <input type="text" name="name" id="name" placeholder="Name" required />
            </div>

            <div class="form-group">
                <input type="email" name="email" id="email" placeholder="Email" required />
            </div>

            <div class="form-group">
                <input type="text" name="cono" id="cono" placeholder="Contact Number" required />
            </div>

            <div class="form-group">
                <input type="password" name="password" id="password" placeholder="Password" required />
            </div>

            <div class="form-group">
                <input type="password" name="cpassword" id="cpassword" placeholder="Confirm Password" required />
            </div>

            <div class="form-group form-button">
                <input type="submit" name="signup" id="signup" class="form-submit" value="Register" />
            </div>

            <a href="Login.jsp" class="signup-image-link">I AM ALREADY A MEMBER.</a>
        </form>
    </div>

</body>
</html>
