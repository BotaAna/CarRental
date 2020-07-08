<%--
  Created by IntelliJ IDEA.
  User: Ania
  Date: 2020-07-08
  Time: 00:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodawanie pracownika do bazy</title>
</head>
<body>
    <h1>Dodaj auto</h1>
    <form method="post" action="/addEmployee">
        Imię: <input name="name" /><br/>
        Nazwisko: <input name="surname" /><br/>
        Oddział: <input name="department" /><br/>
        Stanowisko: <input name="employeeStatus" /><br/>
        <input type="submit" value="Zapisz">
    </form>
</body>
</html>
