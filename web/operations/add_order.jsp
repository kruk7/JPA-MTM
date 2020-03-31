<%--
  Created by IntelliJ IDEA.
  User: Raven
  Date: 2020-02-09
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add order</title>
</head>
<body>
<h3>Add order</h3>
<form action="${pageContext.request.contextPath}/addorder" method="post">
    <input type="number" name="clientId" placeholder="Client ID" />
    <br />
    <input type="text" name="orderDetails" placeholder="Details" />
    <br />
    <input type="submit" value="Add Order" />
</form>
</form>
</body>
</html>
