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
    <title>Title</title>
</head>
<body>
  <h1>Home</h1>
  <span>${userLoginInfo}</span>
  <p>
      <a href="${pageContext.request.contextPath}/user/logout">logout</a>
  </p>
</body>
</html>
