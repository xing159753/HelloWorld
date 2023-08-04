<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/8/4
  Time: 4:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<body>
<h1>登录成功的页面！</h1>
<%
    Integer count = 0;
    // 判断，如果ServletContext中有值，获取并显示：
    if(this.getServletContext().getAttribute("count")!=null){
        count = (Integer)this.getServletContext().getAttribute("count");
    }
%>
<h3>登录成功的总人数：<%= count %></h3>
</body>
</html>
