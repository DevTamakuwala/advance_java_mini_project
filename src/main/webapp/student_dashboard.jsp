<%@ include file="session_check.jsp" %>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ page session="true" %>

<%
    String userEmail = (String) session.getAttribute("userEmail");
    if (userEmail == null) {
        response.sendRedirect("Login.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Student Dashboard</title>
</head>
<body>
    <h2>Hi, <%= userEmail %> (Student)</h2>
    <form action="logout.jsp" method="post">
        <input type="submit" value="Logout" />
    </form>
</body>
</html>
