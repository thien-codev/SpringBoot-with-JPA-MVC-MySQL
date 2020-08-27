<%-- 
    Document   : orderdetails-page
    Created on : Aug 20, 2020, 8:35:53 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Details</title>
    </head>
    <body>
        <h1>Order details</h1>
        <hr>
        <form:form action="search-order" method="POST">
            <input type="text" name="search" placeholder="Enter name, date..."/>
            <input type="submit" value="Search"/>
        </form:form>
        <hr>
        <table>
            <tr>
                <th>OrderDetailsId</th>  
                <th>OrderId</th>
                <th>OrderDate</th>
                <th>ProductName</th>
                <th>Quantity</th>
            </tr>
            <c:forEach var="item" items="${listOrderDetails}">
            <tr>
                <td>${item.orderDetailsId}</td>
                <td>${item.order.id}</td>
                <td>${item.order.orderDate}</td>
                <td>${item.product.productName}</td>
                <td>${item.quantity}</td>
            </tr>
            </c:forEach>
        </table>
        <hr>
    </body>
</html>
