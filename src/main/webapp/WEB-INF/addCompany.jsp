
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodawanie firmy</title>
</head>
<body>
    <h1>Dodaj firmę</h1>
    <form method="post" action="/addCompany">
        Nazwa firmy: <input name="companyName" /><br/>
        Domena firmy: <input name="companyDomain" /><br/>
        Siedziba firmy: <input name="companyContactAddress" /><br/>
        Właściciel firmy: <input name="companyOwner"><br/>
    <input type="submit" value="Zapisz">
    </form>
</body>
</html>
