<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Library Login</title>
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
        <h2 class="form-title">LOGIN</h2>
        <form class="login-form" id="login-form" method="POST" action="<%=request.getContextPath()%>/LoginServlet">
            <div class="form-group">
                <input type="email" name="email" id="email" placeholder="Email" required />
            </div>

            <div class="form-group">
                <input type="password" name="password" id="password" placeholder="Password" required />
            </div>

            <div class="form-group form-button">
                <input type="submit" name="login" id="login" class="form-submit" value="Login" />
            </div>

            <a href="forgot-password.jsp" class="signup-image-link">Forgot Password?</a>

            <!-- Display error message if login fails -->
            <c:if test="${not empty error}">
                <div style="color: red; text-align: center; margin-top: 20px;">
                    <p>${error}</p>
                </div>
            </c:if>
        </form>
    </div>

</body>
</html>
