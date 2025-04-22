<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Error - Library Management System</title>
    <style>
        body {
            margin: 0;
            font-family: 'Roboto', sans-serif;
            background-color: #f4f4f4;
            color: #333;
        }

        header {
            background-color: #dc3545;
            color: white;
            padding: 25px 50px;
            text-align: center;
            box-shadow: 0 4px 10px rgba(0,0,0,0.1);
        }

        header h1 {
            margin: 0;
            font-size: 2.5rem;
            text-shadow: 1px 1px 3px rgba(0,0,0,0.2);
        }

        .container {
            padding: 50px 20px;
            text-align: center;
        }

        .error-box {
            max-width: 600px;
            margin: auto;
            background: white;
            padding: 40px;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.1);
        }

        .error-box h2 {
            color: #dc3545;
            font-size: 28px;
            margin-bottom: 20px;
        }

        .error-box p {
            font-size: 16px;
            margin-bottom: 20px;
        }

        .error-details {
            background-color: #f8d7da;
            color: #721c24;
            padding: 15px;
            border-radius: 8px;
            margin-bottom: 30px;
            white-space: pre-wrap;
            word-break: break-word;
        }

        .back-button {
            display: inline-block;
            background-color: #007BFF;
            color: white;
            text-decoration: none;
            padding: 12px 24px;
            border-radius: 5px;
            font-weight: bold;
            transition: background-color 0.3s ease;
        }

        .back-button:hover {
            background-color: #0056b3;
        }

        footer {
            background-color: #f0f0f0;
            padding: 30px 20px;
            text-align: center;
            margin-top: 50px;
            font-size: 15px;
        }

        footer a {
            color: #007BFF;
            text-decoration: none;
        }

        footer a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<header>
    <h1>Oops! Something Went Wrong</h1>
</header>

<div class="container">
    <div class="error-box">
        <h2>We encountered an unexpected error</h2>
        <p>Please try again later or contact support if the issue persists.</p>

        <% if (exception != null) { %>
            <div class="error-details">
                <%= exception.getMessage() %>
            </div>
        <% } %>

        <a class="back-button" href="admin_dashboard.jsp">Back to Dashboard</a>
    </div>
</div>

<footer>
    <p>&copy; 2025 Library Management System</p>
    <p>Need help? <a href="mailto:support@library.com">Contact Support</a></p>
</footer>

</body>
</html>
