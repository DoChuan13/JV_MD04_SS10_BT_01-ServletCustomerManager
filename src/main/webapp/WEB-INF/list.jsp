<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Customer Manager</title>
</head>
<body>
<h1><%= "Customer Manager List!" %>
</h1>
<br/>
<table class="table">
    <tr>
        <th>Name</th>
        <th>Date of Birth</th>
        <th>Address</th>
        <th>Picture</th>
    </tr>
    <c:forEach items='${requestScope["customerList"]}' var="ctm">
        <tr>
            <td>${ctm.getName()}</td>
            <td>${ctm.getDateOfBirth()}</td>
            <td>${ctm.getAddress()}</td>
            <td>${ctm.getAddress()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>