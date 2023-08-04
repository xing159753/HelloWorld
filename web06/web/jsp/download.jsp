<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/8/4
  Time: 22:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>文件下载：超链接的方式</h1>
<h3><a href="${ pageContext.request.contextPath }/download/1.jpg">1.jpg</a></h3>
<h3><a href="${ pageContext.request.contextPath }/download/aa.zip">aa.zip</a></h3>

<h1>文件下载：手动编码的方式</h1>
<h3><a href="${ pageContext.request.contextPath }/DownloadServlet?filename=1.jpg">1.jpg</a></h3>
<h3><a href="${ pageContext.request.contextPath }/DownloadServlet?filename=aa.zip">aa.zip</a></h3>
<h3><a href="${ pageContext.request.contextPath }/DownloadServlet?filename=美女.jpg">美女.jpg</a></h3>
</body>
</html>
