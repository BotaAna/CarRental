<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dane firmy</title>
</head>
<body>

<h1>Dane firmy</h1>

<a href="/addCompany">Dodaj firmę</a>
<table>
    <tr>

        <th>Nazwa firmy</th>
        <th>Domena firmy</th>
        <th>Siedziba firmy</th>
        <th>Właściciel firmy</th>
        <th>Oddziały</th>
        <th></th>
        <th></th>
        <th></th>
    </tr>

    <c:forEach var="comapany" items="${companiesList}">
        <tr>
            <td>${comapany.companyName}</td>
            <td>${comapany.companyDomain}</td>
            <td>${comapany.companyContactAddress}</td>
            <td>${comapany.companyOwner}</td>

        </tr>
    </c:forEach>
</table>
<hr/>
<br>


</body>
</html>
