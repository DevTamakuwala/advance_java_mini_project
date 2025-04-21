<%@ page import="java.util.*, com.library.dao.BookDAO, com.library.bean.IssuedBook" %>
<%@ page session="true" %>
<%@ include file="session_check.jsp" %>

<%
    BookDAO dao = new BookDAO();
    List<IssuedBook> books = dao.getIssuedBooksForStudent(email);
    java.util.Date today = new java.util.Date();
%>
<html>
<head>
    <title>Student Dashboard</title>
</head>
<body>
<h2>Welcome, <%= email %></h2>
<h3>Your Issued Books</h3>
<table border="1">
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
<a href="LogoutServlet">Logout</a>
</body>
</html>
