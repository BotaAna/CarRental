<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ania
  Date: 2020-07-08
  Time: 00:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista wszystkich pracowników</title>
</head>
<body>
<h1>Lista pracowników</h1>

<a href="/addEmployee">Dodaj pracownika</a>
<table>
    <tr>
        <th>Imię</th>
        <th>Nazwisko</th>
        <th>Oddział</th>
        <th>Stanowisko</th>
        <th></th>
        <th></th>
        <th></th>
    </tr>

    <c:forEach var="employee" items="${employeesList}">
        <tr>
            <td>${employee.name}</td>
            <td>${employee.surname}</td>
            <td>${employee.department}</td>
            <td>${employee.employeeStatus}</td>
            <td><a href="/deleteEmployee?id=${employee.id}">Usuń</a></td>
            <td><a href="/editEmployee?id=${employee.id}">Edytuj</a></td>
        </tr>
    </c:forEach>
</table>
<hr/>
<br>

</body>
</html>
