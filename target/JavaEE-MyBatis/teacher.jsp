<%--
  Created by IntelliJ IDEA.
  User: 11795
  Date: 2020/6/17
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>教师端</title>
</head>
<body>
<div style="text-align: center">
  <h2>欢迎来到教师端！</h2>
  <button style="height: 30px;width: 120px;" onclick="window.location.href('issueHomework.jsp')">发布作业</button>
  <br><br>
  <button style="height: 30px;width: 120px;" onclick="window.location.href('checkHomework.jsp')">查看已发布作业</button>
  <br><br>
  <a href="index.jsp">返回</a>
</div>
</body>
</html>
