<%@ page session="true" %>
<%@ include file="session_check.jsp" %>

<html>
<head>
    <title>Return Book</title>
    <script>
        let dueDate = null;

        function fetchDueDate() {
            const issueId = document.getElementById("issueId").value;
            if (!issueId) return;

            fetch("GetDueDateServlet?issueId=" + issueId)
                .then(response => response.text())
                .then(date => {
                    if (date !== "notfound") {
                        dueDate = new Date(date);
                        document.getElementById("dueDisplay").innerText = "Due Date: " + dueDate.toDateString();
                        calculateFine();
                    } else {
                        document.getElementById("dueDisplay").innerText = "Issue ID not found.";
                        dueDate = null;
                    }
                });
        }

        function calculateFine() {
            if (!dueDate) return;

            const returnDateStr = document.getElementById("returnDate").value;
            if (!returnDateStr) return;

            const returnDate = new Date(returnDateStr);
            const msPerDay = 24 * 60 * 60 * 1000;

            const diffDays = Math.floor((returnDate - dueDate) / msPerDay);
            const fine = diffDays > 0 ? diffDays * 200 : 0;

            document.getElementById("fine").value = fine.toFixed(2);
        }
    </script>
</head>
<body>
<h3>Return Book</h3>
<form action="ReturnBookServlet" method="post">
    Issue ID: <input type="number" name="issueId" id="issueId" required onchange="fetchDueDate()"><br>
    <div id="dueDisplay" style="margin: 5px 0; color: #333;"></div>

    Return Date: <input type="date" name="returnDate" id="returnDate" required onchange="calculateFine()"><br>
    Fine (if any): <input type="number" name="fine" id="fine" step="0.01" value="0"><br>
    <input type="submit" value="Return Book">
</form>

<a href="admin_dashboard.jsp">Back to Dashboard</a>
</body>
</html>
