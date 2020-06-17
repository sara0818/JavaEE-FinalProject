<%@ page import="com.jdbc.StudentHomeworkJdbc" %>
<%@ page import="com.entity.Homework" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 11795
  Date: 2020/6/17
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看已发布的作业</title>
</head>
<body>
<h1 style="text-align: center;font-size: 30px">查看已发布的作业</h1>
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
<a href="teacher.jsp">返回</a>
</div>
</body>
</html>
