<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edytowanie oddziałów</title>
</head>
<body>
<h1>Edytuj oddział</h1>
<form method="post" action="/editDepartment">
    Adres: <input name="depAddress" value="${department.depAddress}" /><br/>
    <input type name="id" value="${department.id}">
    <input type="submit" value="Zapisz">
</form>

</body>
</html>