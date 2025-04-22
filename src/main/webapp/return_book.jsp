<%@ page session="true" %>
<%@ include file="session_check.jsp" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Return Book</title>
    <script>
        let dueDate = null;

        function fetchDueDate() {
            const issueId = document.getElementById("issueId").value;
            if (!issueId) return;

            fetch("GetDueDateServlet?issueId=" + issueId)
                .then(response => response.text())
                .then(date => {
                    if (date !== "notfound") {
                        dueDate = new Date(date);
                        document.getElementById("dueDisplay").innerText = "Due Date: " + dueDate.toDateString();
                        calculateFine();
                    } else {
                        document.getElementById("dueDisplay").innerText = "Issue ID not found.";
                        dueDate = null;
                    }
                });
        }

        function calculateFine() {
            if (!dueDate) return;

            const returnDateStr = document.getElementById("returnDate").value;
            if (!returnDateStr) return;

            const returnDate = new Date(returnDateStr);
            const msPerDay = 24 * 60 * 60 * 1000;

            const diffDays = Math.floor((returnDate - dueDate) / msPerDay);
            const fine = diffDays > 0 ? diffDays * 200 : 0;

            document.getElementById("fine").value = fine.toFixed(2);
        }
    </script>
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

        form input[type="text"], form input[type="number"], form input[type="date"], form input[type="email"] {
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
    <h1>Library Hub - Return Book</h1>
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
        <h3>Return Book</h3>
        <form action="ReturnBookServlet" method="post">
            Issue ID: <input type="number" name="issueId" id="issueId" required onchange="fetchDueDate()"><br>
            <div id="dueDisplay" style="margin: 5px 0; color: #333;"></div>

            Return Date: <input type="date" name="returnDate" id="returnDate" required onchange="calculateFine()"><br>
            Fine (if any): <input type="number" name="fine" id="fine" step="0.01" value="0"><br>
            <input type="submit" value="Return Book">
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
