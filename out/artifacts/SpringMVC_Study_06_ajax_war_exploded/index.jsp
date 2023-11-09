<%--
  Created by IntelliJ IDEA.
  User: 30586
  Date: 2023/11/6
  Time: 22:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.7.1.js"></script>
    <script>function a() {
      $.post({
        url:"${pageContext.request.contextPath}/a",
        data:{name: $("#username").val()},
        success: function (data) {
          alert(data);
        }
      })
    }</script>
</head>
<body>
username: <input type="text" id="username" onblur="a()">
</body>
</html>
