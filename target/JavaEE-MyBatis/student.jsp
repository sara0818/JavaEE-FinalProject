<%@ page import="com.entity.Homework" %>
<%@ page import="com.jdbc.StudentHomeworkJdbc" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 11795
  Date: 2020/6/17
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>提交作业</title>
</head>
<body>
<h1>欢迎来到学生端！</h1>
<h2 style="text-align: center;font-size: 30px">查看已发布的作业</h2>
<div style="text-align: center;">
  <table align="center" width="960" border="1"
         bgcolor="black" cellpadding="1" cellspacing="1">
    <tr align="center" bgcolor="#7fffd4" height="50">
      <td>homeworkID</td>
      <td>teacherID</td>
      <td>title</td>
      <td>content</td>
      <td>createTime</td>
    </tr>
    <%
      List<Homework> list = StudentHomeworkJdbc.checkHomework();
      if(null == list || list.size() <= 0){
//out.print("None data.");
      }else {
        for (Homework hw : list){
    %>
    <tr align="center" bgcolor="white" height="30">
      <td><%=hw.getHomeworkID()%></td>
      <td><%=hw.getTeacherID()%></td>
      <td><%=hw.getTitle()%></td>
      <td><%=hw.getContent()%></td>
      <td><%=hw.getCreateTime()%></td>
    </tr>
    <%
        }
      }
    %>
  </table>
  <br><br><br>
  <form action="submitHomework" method="post">
    请输入学号：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="text" name="studentID" width="600px">
    <br>
    <br>
    请输入作业序号：
    <input type="text" name="homeworkID" width="600px">
    <br>
    <br>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <textarea cols="18" rows="15" name="content">作业内容</textarea>
    <br><br>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit" value="提交"></input>
    &nbsp;&nbsp;&nbsp;
    <a href="resubmitHomework.jsp">重新提交</a>
    <a href="student.jsp">返回</a>
    &nbsp;&nbsp;&nbsp;
  </form>
</div>
</body>
</html>
