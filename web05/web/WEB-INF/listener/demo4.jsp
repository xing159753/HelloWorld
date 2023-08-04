<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/8/4
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Bean2 bean2 = new Bean2();
    bean2.setName("bean2");

    session.setAttribute("bean2", bean2);
%>
</body>
</html>
