<%@ page session="true" %>
<%@ include file="session_check.jsp" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Issue New Book</title>
    <style>
        body {
            margin: 0;
            font-family: 'Roboto', sans-serif;
            background-color: #f4f4f4;
        }

        header {
            background-color: #007BFF;
            color: white;
            padding: 20px 50px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            flex-wrap: wrap;
            position: sticky;
            top: 0;
            z-index: 1000;
        }

        header h1 {
            margin: 0;
            flex: 1 1 100%;
            font-size: 2.5rem;
            text-transform: uppercase;
            letter-spacing: 1px;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
        }

        nav {
            display: flex;
            gap: 20px;
            margin-top: 10px;
        }

        nav a {
            color: white;
            text-decoration: none;
            font-weight: bold;
        }

        nav a:hover {
            color: #ffd700;
        }

        .auth-buttons {
            margin-left: auto;
            display: flex;
            gap: 10px;
            margin-top: 10px;
        }

        .auth-buttons a {
            background-color: white;
            color: #007BFF;
            padding: 8px 16px;
            text-decoration: none;
            border-radius: 5px;
            font-weight: bold;
            border: 1px solid white;
        }

        .auth-buttons a:hover {
            background-color: #0056b3;
            color: white;
        }

        .main-container {
            padding: 40px 20px;
            text-align: center;
        }

        .form-container {
            max-width: 600px;
            margin: auto;
            background: white;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.1);
        }

        form input[type="text"], form input[type="email"], form input[type="number"], form input[type="date"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border-radius: 5px;
            border: 1px solid #ccc;
            font-size: 14px;
        }

        form input[type="submit"] {
            padding: 8px 16px;
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        form input[type="submit"]:hover {
            background-color: #218838;
        }

        footer {
            background-color: #f0f0f0;
            color: #333;
            padding: 40px 20px;
            text-align: center;
            font-size: 16px;
            margin-top: 50px;
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
    <h1>Library Hub - Issue New Book</h1>
    <nav>
        <a href="index.jsp">Home</a>
        <a href="jsp/about.jsp">About Us</a>
        <a href="jsp/search.jsp">Search Books</a>
    </nav>
    <div class="auth-buttons">
        <a href="LogoutServlet">Logout</a>
    </div>
</header>

<div class="main-container">
    <div class="form-container">
        <h3>Issue a Book to Student</h3>
        <form action="IssueBookServlet" method="post">
            Student Email: <input type="email" name="userEmail" required><br>
            Book ID: <input type="number" name="bookId" required><br>
            Issue Date: <input type="date" name="issueDate" required><br>
            Due Date: <input type="date" name="dueDate" required><br>
            <input type="submit" value="Issue Book">
        </form>
        <a href="admin_dashboard.jsp" style="color: #007BFF; font-weight: bold;">Back to Dashboard</a>
    </div>
</div>

<footer>
    <p>&copy; 2025 Library Management System</p>
    <p>Developed with 💙 for book lovers and knowledge seekers</p>
    <p>Contact us at <a href="mailto:support@library.com">support@library.com</a></p>
    <p>Follow us on
        <a href="#">Facebook</a> |
        <a href="#">Twitter</a> |
        <a href="#">Instagram</a>
    </p>
</footer>

</body>
</html>
