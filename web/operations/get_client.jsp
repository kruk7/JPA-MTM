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
    <title>Get client</title>
</head>
<body>
<h3>Get client</h3>
<form action="${pageContext.request.contextPath}/getclient" method="post">
    <input type="text" name="clientId" placeholder="Client ID" />
    <input type="submit" value="Get Client"/>
</form>

</body>
</html>
