<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/8/4
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>JSTL的if标签的使用</h1>
<c:set var="i" value="5" scope="page"></c:set>
<c:if test="${ i >= 10 }">
    <font color="red">i大于等于10</font>
</c:if>
<c:if var="flag" test="${ i < 10 }" scope="page">
    <font color="blue">i小于10</font>
</c:if>
<c:if test="${flag}">
    flag为true
</c:if>
</body>
</html>
