<%--
  Created by IntelliJ IDEA.
  User: 30586
  Date: 2023/11/10
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    username: <input type="text" name="username">
    password: <input type="text" name="password">
    <input type="submit" value="submit">
</form>
</body>
</html>
