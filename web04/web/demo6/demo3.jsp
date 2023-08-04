<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/8/4
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>执行逻辑运算</h3>
<%
    pageContext.setAttribute("n3","30");
    pageContext.setAttribute("n4","40");
%>
${ (n1 <n2 ) && (n3 < n4 )} -- ${ (n1 < n2 ) and (n3 < n4 )} <br/>
${ (n1 < n2) || (n3 < n4 )} -- ${ (n1 < n2) or (n3 < n4)}<br/>
${ !(n1 < n2)} --${ not (n1 < n2)}<br/>
<h3>执行三元运算</h3>
${ n1 < n2 ? "n1小于n2" : "n1不小于n2" }
<h3>空运算符</h3>
${ empty user}
</body>
</html>
