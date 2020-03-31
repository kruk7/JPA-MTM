<%--
  Created by IntelliJ IDEA.
  User: Raven
  Date: 2020-02-09
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get product</title>
</head>
<body>
<h3>Get product</h3>
<form action="${pageContext.request.contextPath}/getproduct" method="post">
    <input type="number" name="productId" placeholder="Product ID" />
    <input type="submit" value="Get Product" />
</form>
</body>
</html>
