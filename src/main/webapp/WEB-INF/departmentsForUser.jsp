<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Oddziały firmy</title>
</head>
<body>

<h1>Oddziały firmy</h1>

<table>
    <tr>

        <th>Adres oddziału</th>


    </tr>

    <c:forEach var="department" items="${departmentsList}">
        <tr>
            <td><a href="/carsByDepartmentForUser?department=${department.depAddress}">${department.depAddress}</a></td>
        </tr>
    </c:forEach>
</table>
<hr/>
<br>


</body>
</html>