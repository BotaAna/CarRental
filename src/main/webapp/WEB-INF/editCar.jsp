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
<%--        Rodzaj nadwozia: <input name="carBody" value="${car.carBody}" /><br/>--%>
        Rodzaj nadwozia: <select name="carBody">
                            <option value="sedan">Sedan</option>
                            <option value="suv">Suv</option>
                            <option value="wagon">Kombi</option>
                            <option value="cabriolet">Cabriolet</option>
                            </select><br/>
        Data produkcji: <input name="productionDate" value="${car.productionDate}" /><br/>
        Przebieg startowy: <input name="carMileage" value="${car.carMileage}" /><br/>
<%--        Oddział: <input name="availableInDep" value="${car.availableInDep}" /><br/>--%>

        Oddział:
        <select name="availableInDep">
            <c:forEach items="${departmentsList}" var="department">
                <option value="${department.depAddress}">${department.depAddress}</option>
            </c:forEach>
        </select> </br>
        <input type name="id" value="${car.id}">
        <input type="submit" value="Zapisz">
    </form>

</body>
</html>
