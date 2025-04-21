<%
    // Only declare email here once
    String email = (String) session.getAttribute("userEmail");

    // Check if the session email is null or user is not logged in
    if (email == null) {
        // Redirect only if the user is not logged in
        response.sendRedirect("Login.jsp");
        return;  // Prevent further execution, so nothing else is loaded on the page
    }
%>
