<%@ page import="java.util.List, java.util.ArrayList, com.library.dao.BookDAO, com.library.bean.IssuedBook" %>
<%@ page session="true" %>
<%@ include file="session_check.jsp" %>

<%

    BookDAO dao = new BookDAO();
    List<IssuedBook> reissueRequests = new ArrayList<>();
    for (IssuedBook b : dao.getAllIssuedBooks()) {
        if (b.isReissueRequested()) {
            reissueRequests.add(b);
        }
    }
%>
<html>
<head><title>Reissue Requests</title></head>
<body>
<h3>Pending Reissue Requests</h3>
<table border="1">
    <tr>
        <th>Book ID</th>
        <th>User Email</th>
        <th>Due Date</th>
        <th>New Due Date</th>
        <th>Action</th>
    </tr>
<%
    for (IssuedBook b : reissueRequests) {
%>
    <tr>
        <td><%= b.getBookId() %></td>
        <td><%= b.getUserEmail() %></td>
        <td><%= b.getDueDate() %></td>
        <td>
            <form action="ReissueApprovalServlet" method="post">
                <input type="hidden" name="issueId" value="<%= b.getIssueId() %>">
                <input type="date" name="newDueDate" required>
                <input type="submit" value="Approve">
            </form>
        </td>
    </tr>
<% } %>
</table>
<a href="admin_dashboard.jsp">Back to Dashboard</a>
</body>
</html>
