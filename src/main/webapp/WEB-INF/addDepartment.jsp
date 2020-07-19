<%--
  Created by IntelliJ IDEA.
  User: Ania
  Date: 2020-07-11
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodawanie oddziałów do bazy</title>
</head>
<body>
<h1>Dodaj oddział</h1>
<form method="post" action="/addDepartment">
    Adres: <input name="depAddress" /><br/>
    <input type="submit" value="Zapisz">
</form>
</body>
</html>
