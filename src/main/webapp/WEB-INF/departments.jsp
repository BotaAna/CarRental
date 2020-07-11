<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ania
  Date: 2020-07-11
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Oddziały wypożyczalni samochodów</title>
</head>
<body>

<h1>Lista oddziałów</h1>

<a href="/addDepartment">Dodaj oddział</a>
<table>
    <tr>

        <th>ID</th>
        <th>Adres oddziału</th>
        <th></th>
        <th></th>
    </tr>

    <c:forEach var="department" items="${departmentsList}">
        <tr>
            <td>${department.id}</td>
            <td>${department.depAddress}</td>
            <td><a href="/deleteDepartment?id=${department.id}">Usuń</a></td>
            <td><a href="/editDepartment?id=${department.id}">Edytuj</a></td>
        </tr>
    </c:forEach>
</table>
<hr/>
<br>


</body>
</html>
