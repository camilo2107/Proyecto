<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Player Management</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <h1>Manage Player Data</h1>
    <form action="PlayerServlet" method="post">
        <input type="hidden" name="id" value="${player.id != null ? player.id : ''}">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="${player.name != null ? player.name : ''}" required><br>

        <label for="age">Age:</label>
        <input type="number" id="age" name="age" value="${player.age != null ? player.age : ''}" required><br>

        <label for="position">Position:</label>
        <input type="text" id="position" name="position" value="${player.position != null ? player.position : ''}" required><br>

        <label for="statistics">Statistics:</label>
        <textarea id="statistics" name="statistics">${player.statistics != null ? player.statistics : ''}</textarea><br>

        <input type="submit" value="Save Player">
    </form>

    <h2>Existing Players</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Position</th>
            <th>Statistics</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="player" items="${players}">
            <tr>
                <td>${player.id}</td>
                <td>${player.name}</td>
                <td>${player.age}</td>
                <td>${player.position}</td>
                <td>${player.statistics}</td>
                <td>
                    <a href="PlayerServlet?id=${player.id}">Edit</a>
                    <a href="PlayerServlet?id=${player.id}&action=delete">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>