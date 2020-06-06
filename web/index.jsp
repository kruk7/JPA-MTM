<%--
  Created by IntelliJ IDEA.
  User: Raven
  Date: 2020-02-04
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JPA Many to Many Example</title>
</head>
<body>

<h2>If you want to ADD new objects</h2>
<button onclick="window.location.href = 'operations/add_client.jsp';">Client</button>
<br>
<button onclick="window.location.href = 'operations/add_order.jsp';">Order</button>
<br>
<button onclick="window.location.href = 'operations/add_product.jsp';">Product</button>
<br>
<button onclick="window.location.href = 'operations/add_product_to_order.jsp';">Product to Order</button>


<h2>If you want to GET exist objects</h2>
<button onclick="window.location.href = 'operations/get_client.jsp';">Client</button>
<br>
<button onclick="window.location.href = 'operations/get_order.jsp';">Order</button>
<br>
<button onclick="window.location.href = 'operations/get_product.jsp';">Product</button>
<br>

</body>
</html>
