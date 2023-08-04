<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/8/4
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>JSP的动作标签：转发</h1>
<jsp:forward page="/demo4/demo2.jsp">
    <jsp:param value="aaa" name="name"/>
</jsp:forward>
</body>
</html>
