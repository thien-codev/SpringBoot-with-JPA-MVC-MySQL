<%-- 
    Document   : home-page
    Created on : Aug 20, 2020, 8:35:19 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of orders</title>
    </head>
    <body>
        <h1>List Of Orders</h1>
        <hr>
        <form:form action="search-order" method="POST">
            <input type="text" name="search" placeholder="Enter name, date..."/>
            <input type="submit" value="Search"/>
        </form:form>
        <hr>
        <table>
            <tr>
                <th>OrderId</th>
                <th>OrderDate</th>
                <th>CustomerName</th>
                <th>ViewDetails</th>
            </tr>
            <c:forEach var="item" items="${listOrders}">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.orderDate}</td>
                    <td>${item.customerName}</td>
                    <td><a href="order-details?orderId=${item.id}">View details</a></td>
                </tr>
            </c:forEach>
        </table>
        <hr>
    </body>
</html>
