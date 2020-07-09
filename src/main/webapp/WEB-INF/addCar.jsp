<%--
  Created by IntelliJ IDEA.
  User: Ania
  Date: 2020-07-07
  Time: 01:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodawanie aut do bazy</title>
</head>
<body>
    <h1>Dodaj auto</h1>
    <form method="post" action="/addCar">
        Marka: <input name="make" /><br/>
        Model: <input name="model" /><br/>
        Kolor: <input name="color" /><br/>
        Rodzaj nadwozia: <input name="carBody" /><br/>
        Data produkcji: <input name="productionDate" /><br/>
        Przebieg startowy: <input name="carMileage" /><br/>
        Status: <input name="carStatus" /><br/>
        <input type="submit" value="Zapisz">
    </form>
</body>
</html>
