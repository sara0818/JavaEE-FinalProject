<%--
  Created by IntelliJ IDEA.
  User: 11795
  Date: 2020/6/17
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发布作业</title>
</head>
<body>
<div style="text-align: center;">
  <form action="issueHomework" method="post">
    工号：
    <input type="text" name="id" width="600px">
    <br>
    <br>
    标题：
    <input type="text" name="title" width="600px">
    <br>
    <br>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <textarea cols="18" rows="15" name="content">作业内容</textarea>
    <br><br>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="index.jsp">返回</a>
    &nbsp;&nbsp;&nbsp;
    <input type="submit" value="提交">
  </form>
</div>
</body>
</html>
