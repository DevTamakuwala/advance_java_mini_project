<%@ page import="java.util.*, com.library.dao.BookDAO, com.library.bean.IssuedBook" %>
<%@ page session="true" %>
<%@ include file="session_check.jsp" %>

<%
    BookDAO dao = new BookDAO();
    List<IssuedBook> books = dao.getIssuedBooksForStudent(email);
    java.util.Date today = new java.util.Date();
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student Dashboard</title>
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

        .table-container {
            max-width: 1000px;
            margin: auto;
            background: white;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.1);
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        table, th, td {
            border: 1px solid #ddd;
        }

        th {
            background-color: #007BFF;
            color: white;
            padding: 12px;
            font-size: 16px;
        }

        td {
            padding: 10px;
            font-size: 14px;
        }

        form input[type="submit"] {
            padding: 6px 12px;
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        form input[type="submit"]:hover {
            background-color: #218838;
        }

        .logout-link {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #dc3545;
            color: white;
            text-decoration: none;
            border-radius: 5px;
            font-weight: bold;
        }

        .logout-link:hover {
            background-color: #c82333;
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
    <h1>Library Hub - Student Dashboard</h1>
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
    <h2>Welcome, <%= email %></h2>
    <div class="table-container">
        <h3>Your Issued Books</h3>
        <table>
            <tr>
                <th>Book ID</th>
                <th>Issue Date</th>
                <th>Due Date</th>
                <th>Fine</th>
                <th>Reissue</th>
            </tr>
            <%
                for (IssuedBook book : books) {
            %>
            <tr>
                <td><%= book.getBookId() %></td>
                <td><%= book.getIssueDate() %></td>
                <td><%= book.getDueDate() %></td>
                <td><%= book.getFine() %></td>
                <td>
                    <% if (!book.isReissueRequested() && book.getReturnDate() == null && book.getDueDate().before(today)) { %>
                    <form action="ReissueRequestServlet" method="post">
                        <input type="hidden" name="issueId" value="<%= book.getIssueId() %>">
                        <input type="submit" value="Request Reissue">
                    </form>
                    <% } else if (book.isReissueRequested()) { %>
                        Pending
                    <% } else { %>
                        N/A
                    <% } %>
                </td>
            </tr>
            <% } %>
        </table>
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
