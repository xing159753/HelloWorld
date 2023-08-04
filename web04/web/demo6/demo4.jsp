<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/8/4
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>EL获取web开发常用对象</h1>
${ param.name} <!-- 相当于 request.getParameter("name") -->
${ paramValues.hobby[0]}${ paramValues.hobby[1]}<!-- 相当于 request.getParameterValues("hobby") -->
${ header["User-Agent"]}
${ initParam.username}
<br/>
${ pageContext.request.contextPath}
${ pageContext.request.remoteAddr }
</body>
</html>
