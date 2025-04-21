<%@ include file="session_check.jsp" %>
<%
    String userType = (String) session.getAttribute("userType");

    if (userType == null || !userType.equals("admin")) {
        // If user is logged in but not an admin, redirect them back to the previous page
        String referer = request.getHeader("Referer");
        if (referer != null) {
            response.sendRedirect(referer);
        } else {
            response.sendRedirect("student_dashboard.jsp");  // fallback if referer is missing
        }
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Admin Dashboard</title>
</head>
<body>
    <h2>Welcome to Admin Dashboard</h2>
    <p>You are logged in as: <%= session.getAttribute("userEmail") %></p>
    <a href="LogoutServlet">Logout</a>
</body>
</html>
