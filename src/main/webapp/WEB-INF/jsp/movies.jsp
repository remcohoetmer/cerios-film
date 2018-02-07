<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="utf-8"/>
    <title>Home</title>
</head>
<body>
<h2 >${app.title}</h2>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Link</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="movie" items="${movies}">
    <tr>
        <td>${movie.id}</td>
        <td>${movie.name}</td>
        <td><a href="/movie/${movie.id}">Go to Movie</a></td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>