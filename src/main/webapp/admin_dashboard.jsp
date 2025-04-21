<%@ page import="java.util.*, com.library.dao.BookDAO, com.library.bean.IssuedBook" %>
<%@ page session="true" %>
<%@ include file="session_check.jsp" %>

<%
    BookDAO dao = new BookDAO();
    List<IssuedBook> books = dao.getAllIssuedBooks();
    java.util.Date today = new java.util.Date();
%>
<html>
<head>
    <title>Admin Dashboard</title>
</head>
<body>
<h2>Welcome Admin</h2>
<h3>All Issued Books</h3>
<table border="1">
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

        // Calculate fine if not returned and overdue
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

<br>
<a href="issue_book.jsp">Issue Book</a> |
<a href="add_book.jsp">Add Book</a> |
<a href="reissue_requests.jsp">Reissue Requests</a> |
<a href="return_book.jsp">Return Book</a> |
<a href="LogoutServlet">Logout</a>
</body>
</html>
