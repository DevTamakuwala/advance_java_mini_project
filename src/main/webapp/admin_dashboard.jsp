<%@ page import="java.util.*, com.library.dao.BookDAO, com.library.bean.IssuedBook" %>
<%@ page session="true" %>
<%@ include file="session_check.jsp" %>

<%
    BookDAO dao = new BookDAO();
    List<IssuedBook> books = dao.getAllIssuedBooks();
    java.util.Date today = new java.util.Date();
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard</title>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <style>
        * {
            box-sizing: border-box;
        }

        body {
            margin: 0;
            font-family: 'Roboto', sans-serif;
            background-color: #f3f6fd;
            display: flex;
            min-height: 100vh;
        }

        .sidebar {
            width: 250px;
            background-color: #5e50f9;
            color: white;
            padding-top: 30px;
            flex-shrink: 0;
            position: fixed;
            height: 100%;
        }

        .sidebar h2 {
            text-align: center;
            margin-bottom: 30px;
        }

        .sidebar a {
            display: block;
            padding: 15px 30px;
            color: white;
            text-decoration: none;
            font-weight: bold;
        }

        .sidebar a:hover {
            background-color: #7b68ee;
        }

        .main-content {
            margin-left: 250px;
            flex-grow: 1;
            padding: 20px 40px;
        }

        header {
            background-color: white;
            padding: 20px 40px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            position: sticky;
            top: 0;
            z-index: 1000;
        }

        header h1 {
            margin: 0;
            color: #5e50f9;
            font-size: 28px;
        }

        h2, h3 {
            margin-top: 20px;
            color: #333;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            background: white;
            margin-top: 20px;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 4px 15px rgba(0,0,0,0.05);
        }

        th, td {
            padding: 15px;
            text-align: center;
            border-bottom: 1px solid #eaeaea;
        }

        th {
            background-color: #5e50f9;
            color: white;
            font-weight: 600;
        }

        tr:hover {
            background-color: #f2f2f2;
        }

        footer {
            margin-top: 50px;
            padding: 20px;
            background-color: #e9e9ff;
            text-align: center;
            font-size: 14px;
            color: #333;
            border-top: 1px solid #ccc;
        }

        .nav-links {
            margin-top: 20px;
            text-align: center;
        }

        .nav-links a {
            margin: 0 10px;
            color: #5e50f9;
            text-decoration: none;
            font-weight: bold;
        }

        .nav-links a:hover {
            text-decoration: underline;
        }

        /* Stat Cards Styling */
        .stat-cards {
            display: flex;
            gap: 20px;
            margin-top: 30px;
            flex-wrap: wrap;
        }

        .card {
            flex: 1;
            min-width: 250px;
            padding: 25px;
            border-radius: 15px;
            background: linear-gradient(135deg, #ffffff, #f2f2ff);
            box-shadow: 0 4px 12px rgba(0,0,0,0.05);
            color: #fff;
            transition: transform 0.3s ease;
        }

        .card:hover {
            transform: translateY(-5px);
        }

        .card h3 {
            margin: 0 0 10px;
            font-size: 20px;
            font-weight: 700;
        }

        .card p {
            font-size: 28px;
            margin: 5px 0;
            font-weight: bold;
        }

        .card small {
            font-size: 14px;
        }

        .card.orange {
            background: linear-gradient(135deg, #ff6a00, #ff9472);
        }

        .card.blue {
            background: linear-gradient(135deg, #0072ff, #00c6ff);
        }

        .card.green {
            background: linear-gradient(135deg, #00b09b, #96c93d);
        }
    </style>
</head>
<body>

<div class="sidebar">
    <h2>Admin Panel</h2>
    <a href="admin_dashboard.jsp">Dashboard</a>
    <a href="issue_book.jsp">Issue Book</a>
    <a href="add_book.jsp">Add Book</a>
    <a href="reissue_requests.jsp">Reissue Requests</a>
    <a href="return_book.jsp">Return Book</a>
    <a href="LogoutServlet">Logout</a>
</div>

<div class="main-content">
    <header>
        <h1>Welcome, Admin</h1>
    </header>

    <!-- Stat Cards -->
    <div class="stat-cards">
        <div class="card orange">
            <h3>Weekly Sales</h3>
            <p>$15,000</p>
            <small>Increased by 60%</small>
        </div>
        <div class="card blue">
            <h3>Weekly Orders</h3>
            <p>45,634</p>
            <small>Decreased by 10%</small>
        </div>
        <div class="card green">
            <h3>Visitors Online</h3>
            <p>95,574</p>
            <small>Increased by 5%</small>
        </div>
    </div>

    <h2>All Issued Books</h2>
    <table>
        <tr>
            <th>Book ID</th>
            <th>User Email</th>
            <th>Issue Date</th>
            <th>Due Date</th>
            <th>Fine</th>
            <th>Reissue Requested</th>
            <th>Status</th>
        </tr>
        <%
            for (IssuedBook book : books) {
                java.util.Date dueDate = book.getDueDate();
                java.util.Date returnDate = book.getReturnDate();
                double fine = book.getFine();

                if (returnDate == null && dueDate.before(today)) {
                    long diffInMillies = today.getTime() - dueDate.getTime();
                    long daysOverdue = diffInMillies / (1000 * 60 * 60 * 24);
                    fine = daysOverdue * 200;
                }
        %>
        <tr>
            <td><%= book.getBookId() %></td>
            <td><%= book.getUserEmail() %></td>
            <td><%= book.getIssueDate() %></td>
            <td><%= dueDate %></td>
            <td><%= fine %></td>
            <td><%= book.isReissueRequested() ? "Yes" : "No" %></td>
            <td>
                <% if (returnDate == null && dueDate.before(today)) { %>
                    Overdue
                <% } else { %>
                    OK
                <% } %>
            </td>
        </tr>
        <% } %>
    </table>

    <div class="nav-links">
        <a href="issue_book.jsp">Issue Book</a> |
        <a href="add_book.jsp">Add Book</a> |
        <a href="reissue_requests.jsp">Reissue Requests</a> |
        <a href="return_book.jsp">Return Book</a> |
        <a href="LogoutServlet">Logout</a>
    </div>

    <footer>
        &copy; 2025 Library Management System — Built for smart administration
    </footer>
</div>

</body>
</html>
