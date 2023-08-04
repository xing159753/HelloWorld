<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/8/4
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>JSTL的foreach标签的使用</h1>
<h3>遍历数组</h3>
<%
    String[] arrs = {"aa","bb","cc"};
    pageContext.setAttribute("arrs",arrs);
%>
<c:forEach var="s" items="${ arrs }">
    ${ s }
</c:forEach>
<h3>遍历List集合</h3>
<%
    List<String> list = new ArrayList<String>();
    list.add("11");
    list.add("22");
    list.add("33");
    pageContext.setAttribute("list",list);
%>
<c:forEach var="s" items="${ list }">
    ${ s }
</c:forEach>
<h3>遍历Map集合</h3>
<%
    Map<String,Integer> map = new HashMap<String,Integer>();
    map.put("aaa",111);
    map.put("bbb",222);
    map.put("ccc",333);
    pageContext.setAttribute("map",map);
%>
<c:forEach var = "entry" items="${ map }">
    ${ entry.key}-${ entry.value}
</c:forEach>
<h3>遍历从1到10</h3>
<c:forEach var="i" begin="1" end="10" step="1">
    ${ i }
</c:forEach>
<h3>遍历100到200 每次加2 到第三个数的时候 将该数字变成蓝色</h3>
<c:forEach var="i" begin="100" end="200" step="2" varStatus="status">
    <c:if test="${ status.count % 3 == 0}">
        <font color="blue">${i}</font>
    </c:if>
    <c:if test="${status.count  % 3 != 0}">
        ${i}
    </c:if>
</c:forEach>
</body>
</html>
