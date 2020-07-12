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
    <title>Edytowanie oddziałów w bazie</title>
</head>
<body>
<h1>Edytuj oddział</h1>
<form method="post" action="/editDepartment">
    Adres: <input name="depAddress" value="${department.depAddress}" /><br/>
    <input type = "hidden" name="id" value="${department.id}"/>
    <input type="submit" value="Zapisz">
</form>

</body>
</html>
