<%
    String email = (String) session.getAttribute("userEmail");
    if (email == null) {
        response.sendRedirect("index.jsp");
    }
%>
