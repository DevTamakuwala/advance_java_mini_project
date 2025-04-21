<%@ page session="true" %>
<%@ include file="session_check.jsp" %>
<html>
<head><title>Issue New Book</title></head>
<body>
<h3>Issue a Book to Student</h3>
<form action="IssueBookServlet" method="post">
    Student Email: <input type="email" name="userEmail" required><br>
    Book ID: <input type="number" name="bookId" required><br>
    Issue Date: <input type="date" name="issueDate" required><br>
    Due Date: <input type="date" name="dueDate" required><br>
    <input type="submit" value="Issue Book">
</form>
<a href="admin_dashboard.jsp">Back to Dashboard</a>
</body>
</html>
