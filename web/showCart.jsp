<%--
  Created by IntelliJ IDEA.
  User: Макс
  Date: 16.07.2019
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
    <%@ page import="com.study.Cart" %>
    <% com.study.Cart cart = (Cart)session.getAttribute("cart"); %>
    <p> Наименование: <%= cart.getName() %> </p>
    <p> Количество: <%= cart.getQuanity() %> </p>
</body>
</html>
