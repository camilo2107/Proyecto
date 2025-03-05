<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Match Management</title>
</head>
<body>
    <h1>Match Statistics</h1>
    <form action="match" method="post">
        <label for="date">Match Date:</label>
        <input type="date" id="date" name="date" required><br>

        <label for="teams">Teams:</label>
        <input type="text" id="teams" name="teams" required><br>

        <label for="score">Score:</label>
        <input type="text" id="score" name="score" required><br>

        <label for="statistics">Statistics:</label>
        <textarea id="statistics" name="statistics" rows="4" cols="50" required></textarea><br>

        <input type="submit" value="Submit Match">
    </form>

    <h2>Previous Matches</h2>
    <table border="1">
        <tr>
            <th>Date</th>
            <th>Teams</th>
            <th>Score</th>
            <th>Statistics</th>
        </tr>
        <!-- Previous match records will be populated here -->
        <%
            // Example of how to retrieve and display match data
            List<Match> matches = (List<Match>) request.getAttribute("matches");
            if (matches != null) {
                for (Match match : matches) {
        %>
        <tr>
            <td><%= match.getDate() %></td>
            <td><%= match.getTeams() %></td>
            <td><%= match.getScore() %></td>
            <td><%= match.getStatistics() %></td>
        </tr>
        <%
                }
            }
        %>
    </table>
</body>
</html>