<%@ page import="com.itheima.listener.bean.Bean1" %><%--
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
    Bean1 bean1 = new Bean1();
    bean1.setName("张三");
    session.setAttribute("bean1", bean1);

    session.removeAttribute("bean1");
%>
</body>
</html>
