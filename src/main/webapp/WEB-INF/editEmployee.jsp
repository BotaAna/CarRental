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
    <title>Edycja pracownika</title>
</head>
<body>
    <h1>Edytuj dane pracownika</h1>
    <form method="post" action="/editEmployee">
        Imię: <input name="name" value="${employee.name}" /><br/>
        Nazwisko: <input name="surname" value="${employee.surname}" /><br/>
        Oddział: <input name="department" value="${employee.department}" /><br/>
        Stanowisko: <input name="employeeStatus" value="${employee.employeeStatus}" /><br/>
        <input type="hidden" name="id" value="${employee.id}">
        <input type="submit" value="Zapisz">
    </form>

</body>
</html>
