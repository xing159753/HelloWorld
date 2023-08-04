<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/8/4
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>demo2.jsp</h1>
<% System.out.println("demo2.jsp执行了..."); %>
<jsp:forward page="/filter/demo3.jsp"></jsp:forward>
</body>
</html>
