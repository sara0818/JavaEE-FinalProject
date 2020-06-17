<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>登录</title>
</head>
<body>
<div style="text-align: center;">
  <h2>欢迎来到作业管理系统！</h2>
  <form action="index" method="post">
    请输入您的工号/学号：
    <input type="text" name="id" width="600px">
    <br>
    <br>
    请输入密码：
    <input type="password" name="password" width="600px">
    <br><br>
    请选择您的身份：
    <label><input name="identity" type="radio" value="1" />老师 </label>
    <label><input name="identity" type="radio" value="2" />学生 </label>
    <br><br>
    <a href="register.jsp">还没注册？点击这里</a>
    <%--<button onclick="window.location.href('register.jsp')">还没注册？点击这里</button>--%>
    <input type="submit" value="确定">
  </form>
</div>
</body>
</html>
