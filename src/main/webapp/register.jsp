<%--
  Created by IntelliJ IDEA.
  User: 11795
  Date: 2020/6/17
  Time: 8:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<div style="text-align: center;">
  <form action="register" method="post">
    请输入您的工号/学号：
    <input type="text" name="id" width="600px">
    <br>
    <br>
    请设置密码：
    <input type="password" name="password" width="600px">
    <br>
    <br>
    请输入您的电话：
    <input type="text" name="phone" width="600px">
    <br>
    <br>
    请输入您的邮箱：
    <input type="text" name="email" width="600px">
    <br>
    <br>
    请选择您的身份：
    <label><input name="identity" type="radio" value="1" />老师 </label>
    <label><input name="identity" type="radio" value="2" />学生 </label>
    <br><br>
    <a href="index.jsp">返回</a>
    <%--<button onclick="window.location.href('index.jsp')">返回</button>--%>
    <input type="submit" value="确定">
  </form>
</div>
</body>
</html>
