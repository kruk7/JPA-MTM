<%--
  Created by IntelliJ IDEA.
  User: Raven
  Date: 2020-02-09
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get order</title>
</head>
<body>
<h3>Get order</h3>
<form action="${pageContext.request.contextPath}/getorder" method="post">
    <input type="number" name="orderId" placeholder="Order ID" />
    <input type="submit" value="Get Order" />
</form>
</body>
</html>
