<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Payment Management</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <h1>Manage Payment Records</h1>
    <form action="PaymentServlet" method="post">
        <label for="playerId">Player ID:</label>
        <input type="text" id="playerId" name="playerId" required><br><br>

        <label for="amount">Amount:</label>
        <input type="number" id="amount" name="amount" required><br><br>

        <label for="date">Date:</label>
        <input type="date" id="date" name="date" required><br><br>

        <label for="status">Status:</label>
        <select id="status" name="status">
            <option value="Pending">Pending</option>
            <option value="Completed">Completed</option>
            <option value="Failed">Failed</option>
        </select><br><br>

        <input type="submit" value="Submit Payment">
    </form>

    <h2>Payment History</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Player ID</th>
            <th>Amount</th>
            <th>Date</th>
            <th>Status</th>
        </tr>
        <!-- Payment records will be populated here -->
        <%
            // Example of how to retrieve and display payment records
            List<Payment> payments = (List<Payment>) request.getAttribute("paymentList");
            if (payments != null) {
                for (Payment payment : payments) {
        %>
        <tr>
            <td><%= payment.getId() %></td>
            <td><%= payment.getPlayerId() %></td>
            <td><%= payment.getAmount() %></td>
            <td><%= payment.getDate() %></td>
            <td><%= payment.getStatus() %></td>
        </tr>
        <%
                }
            }
        %>
    </table>
</body>
</html>