<%--
  Created by IntelliJ IDEA.
  User: Ania
  Date: 2020-07-07
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edytowanie aut w bazie</title>
</head>
<body>
    <h1>Edytuj auto</h1>
    <form method="post" action="/editCar">
        Marka: <input name="make" value="${car.make}" /><br/>
        Model: <input name="model" value="${car.model}" /><br/>
        Kolor: <input name="color" value="${car.color}" /><br/>
        Rodzaj nadwozia: <input name="carBody" value="${car.carBody}" /><br/>
        Data produkcji: <input name="productionDate" value="${car.productionDate}" /><br/>
        Przebieg startowy: <input name="carMileage" value="${car.carMileage}" /><br/>
        <input type="hidden" name="id" value="${car.id}">
        <input type="submit" value="Zapisz">
    </form>

</body>
</html>
