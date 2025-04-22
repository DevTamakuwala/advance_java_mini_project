<%@ page session="true" %>
<%@ include file="session_check.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Book</title>
    <style>
        body {
            margin: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: url('images/library_bg.jpeg') no-repeat center center fixed;
            background-size: cover;
        }

        header {
            background-color: #007BFF;
            color: white;
            padding: 20px 50px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            flex-wrap: wrap;
        }

        header h1 {
            margin: 0;
            font-size: 2.5rem;
            text-shadow: 1px 1px 4px rgba(0, 0, 0, 0.5);
        }

        nav a {
            color: white;
            text-decoration: none;
            font-weight: bold;
            margin-left: 20px;
        }

        nav a:hover {
            color: #FFD700;
        }

        .form-container {
            max-width: 500px;
            margin: 80px auto;
            background-color: rgba(255, 255, 255, 0.95);
            padding: 40px;
            border-radius: 12px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.3);
        }

        .form-container h3 {
            margin-top: 0;
            color: #007BFF;
            font-size: 24px;
            text-align: center;
        }

        form {
            display: flex;
            flex-direction: column;
            gap: 15px;
        }

        input[type="text"],
        input[type="number"] {
            padding: 10px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 6px;
            width: 100%;
        }

        input[type="submit"] {
            padding: 12px;
            background-color: #007BFF;
            color: white;
            font-size: 16px;
            border: none;
            border-radius: 6px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        .back-link {
            display: block;
            text-align: center;
            margin-top: 20px;
            text-decoration: none;
            font-weight: bold;
            color: #007BFF;
        }

        .back-link:hover {
            text-decoration: underline;
        }

        footer {
            background-color: #f0f0f0;
            color: #333;
            text-align: center;
            padding: 30px 20px;
            position: relative;
            margin-top: 60px;
        }
    </style>
</head>
<body>

<header>
    <h1>Library Hub - Admin Panel</h1>
    <nav>
        <a href="index.jsp">Home</a>
        <a href="admin_dashboard.jsp">Dashboard</a>
        <a href="LogoutServlet">Logout</a>
    </nav>
</header>

<div class="form-container">
    <h3>Add a New Book</h3>
    <form action="AddBookServlet" method="post">
        <label>Title:</label>
        <input type="text" name="title" required>

        <label>Author:</label>
        <input type="text" name="author" required>

        <label>Total Copies:</label>
        <input type="number" name="totalCopies" min="1" required>

        <input type="submit" value="Add Book">
    </form>

    <a href="admin_dashboard.jsp" class="back-link">← Back to Dashboard</a>
</div>

<footer>
    <p>&copy; 2025 Library Management System. All rights reserved.</p>
    <p>Need help? Email us at <a href="mailto:support@library.com">support@library.com</a></p>
</footer>

</body>
</html>
