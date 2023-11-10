<%--
  Created by IntelliJ IDEA.
  User: 30586
  Date: 2023/11/10
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test2</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.7.1.js"></script>
    <script>
      $(function () {
        $("#btn").click(function () {
          $.post("${pageContext.request.contextPath}/a2", function (data) {
            var html="";
            for(let i=0;i<data.length;i++){
                html+="<tr>" +
                    "<td>" + data[i].name + "</td>" +
                    "<td>" + data[i].age + "</td>" +
                    "<td>" + data[i].sex + "</td>" +
                "</tr>"
            }
            $("#content").html(html)
          })
        })
      })
    </script>
</head>

<body>
<input type="button" value="load data" id="btn">
<table>
    <tr>
        <td>name</td>
        <td>age</td>
        <td>sex</td>
    </tr>
    <tbody id="content" >

    </tbody>
</table>

</body>
</html>
