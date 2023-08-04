<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/8/4
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>您已经登录成功！欢迎:${ existUser.username }</h1>
<a href="${ pageContext.request.contextPath }/jsp/sub.jsp">提交数据</a>
</body>
</html>
