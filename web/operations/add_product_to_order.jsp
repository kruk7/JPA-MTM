<%--
  Created by IntelliJ IDEA.
  User: Raven
  Date: 2020-02-09
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add product to order</title>
</head>
<body>
<h3>Add product to order</h3>
<form action="${pageContext.request.contextPath}/add-product-order" method="post">
    <input type="number" name="orderId" placeholder="Order ID" />
    <br />
    <input type="number" name="productId" placeholder="Product ID" />
    <br />
    <input type="submit" value="Add Product" />
</form>
</body>
</html>
