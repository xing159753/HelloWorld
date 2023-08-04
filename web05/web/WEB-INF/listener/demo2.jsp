<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/8/4
  Time: 21:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.setAttribute("name", "aaa"); // 添加属性

    session.setAttribute("name", "bbb"); // 属性替换

    session.removeAttribute("name"); // 属性移除
%>
</body>
</html>
