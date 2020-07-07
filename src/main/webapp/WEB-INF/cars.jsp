<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ania
  Date: 2020-07-07
  Time: 01:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Auta w bazie</title>
</head>
<body>

<h1>Lista aut</h1>

<a href="/addCar">Dodaj auto</a>
<table>
    <tr>
        <th>Marka</th>
        <th>Model</th>
        <th>Kolor</th>
        <th>Rodzaj nadwozia</th>
        <th>Data produkcji</th>
        <th>Przebieg startowy</th>
        <th></th>
        <th></th>
        <th></th>
    </tr>

    <c:forEach var="car" items="${carsList}">
        <tr>
            <td>${car.make}</td>
            <td>${car.model}</td>
            <td>${car.color}</td>
            <td>${car.carBody}</td>
            <td>${car.productionDate}</td>
            <td>${car.carMileage}</td>
        </tr>
    </c:forEach>
</table>
<hr/>
<br>


</body>
</html>
