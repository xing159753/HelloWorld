<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/8/4
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>JSP的四个作用范围</h1>
<%
    // page范围(pageContext)
    // pageContext.setAttribute("name", "张三");
    // request范围
    // request.setAttribute("name", "李四");
    // pageContext.setAttribute("name", "李四", PageContext.REQUEST_SCOPE);
    // session范围
    // session.setAttribute("name", "王五");
    pageContext.setAttribute("name", "王五", PageContext.SESSION_SCOPE);
    // application范围
    // application.setAttribute("name", "赵六");
    pageContext.setAttribute("name", "赵六", PageContext.APPLICATION_SCOPE);
%>
<h1>当前页面获取值</h1>
<%= pageContext.getAttribute("name") %><br/>
<%= request.getAttribute("name") %>-<%= pageContext.getAttribute("name",PageContext.REQUEST_SCOPE) %><br/>
<%= session.getAttribute("name") %>-<%= pageContext.getAttribute("name",PageContext.SESSION_SCOPE) %><br/>
<%= application.getAttribute("name") %>-<%= pageContext.getAttribute("name",PageContext.APPLICATION_SCOPE) %><br/>

<%
    // 转发到demo2.jsp
    // request.getRequestDispatcher("/demo3/demo2.jsp").forward(request, response);
%>
<h1>findAttribute方法</h1>
<%= pageContext.findAttribute("name") %><br/>
<a href="/web04/demo3/demo2.jsp">跳转</a>
</body>
</html>
