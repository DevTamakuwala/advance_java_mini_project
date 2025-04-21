<%@ page isErrorPage="true" %>
<html>
<head><title>Error</title></head>
<body>
<h2>Something went wrong</h2>
<p>An unexpected error occurred. Please try again later.</p>
<% if (exception != null) { %>
    <pre><%= exception.getMessage() %></pre>
<% } %>
<a href="admin_dashboard.jsp">Back to Dashboard</a>
</body>
</html>
