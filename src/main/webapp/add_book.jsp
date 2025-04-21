<%@ page session="true" %>
<%@ include file="session_check.jsp" %>
<html>
<head><title>Add Book</title></head>
<body>
<h3>Add a New Book</h3>
<form action="AddBookServlet" method="post">
    Title: <input type="text" name="title"><br>
    Author: <input type="text" name="author"><br>
    Total Copies: <input type="number" name="totalCopies"><br>
    <input type="submit" value="Add Book">
</form>
<a href="admin_dashboard.jsp">Back to Dashboard</a>
</body>
</html>
