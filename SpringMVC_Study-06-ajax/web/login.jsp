<%--
  Created by IntelliJ IDEA.
  User: 30586
  Date: 2023/11/10
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.7.1.js"></script>
    <script>
      function a1() {
        $.post({
          url: "${pageContext.request.contextPath}/a3",
          data: {"name": $("#name").val()},
          success: function (data) {
            console.log(data);
            if (data.toString() === 'ok')
              $("#userInfo").css("color", "green");
            else
              $("#userInfo").css("color", "red");
            $("#userInfo").html(data);
          }
        })
      }

      function a2() {
        $.post({
          url: "${pageContext.request.contextPath}/a3",
          data: {"pwd": $("#pwd").val()},
          success: function (data) {
            console.log(data);
            if (data.toString() === 'ok')
              $("#pwdInfo").css("color", "green");
            else
              $("#pwdInfo").css("color", "red");
            $("#pwdInfo").html(data);
          }
        })
      }
    </script>
</head>
<body>
<p>
    username : <input type="text" id="name" onblur="a1()">
    <span id="userInfo"></span>
</p>
<p>
    password : <input type="text" id="pwd" onblur="a2()">
    <span id="pwdInfo"></span>
</p>

</body>
</html>
