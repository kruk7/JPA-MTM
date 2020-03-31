<%--
  Created by IntelliJ IDEA.
  User: Raven
  Date: 2020-02-09
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add client</title>
</head>
<body>
<h3>Add client</h3>
<form action="${pageContext.request.contextPath}/addclient" method="post">
    <input type="text" name="firstName" placeholder="Client first name" />
    <br />
    <input type="text" name="lastName" placeholder="Client last name" />
    <br />
    <input type="text" name="address" placeholder="Address" />
    <br />
    <input type="submit" value="Add Client" />
</form>
</body>
</html>
