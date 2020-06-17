package com.controller;

import com.entity.Student;
import com.entity.Teacher;
import com.jdbc.StudentHomeworkJdbc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class LoginController {
  @RequestMapping("/index")
  public void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    int id = Integer.parseInt(req.getParameter("id"));
    String password = req.getParameter("password");
    if(req.getParameter("identity").equals("1")){
      List<Teacher> list = null;
      list = StudentHomeworkJdbc.selectTeacher();
      int flag=0;
      for(Teacher t:list){
        if(id==t.getTeacherID() && password.equals(t.getPassword())){
          flag=1;
          resp.sendRedirect("/teacher.jsp");
          break;
        }
      }
      if(flag==0){
        resp.sendRedirect("/unsuccess.jsp");
      }

    }else if(req.getParameter("identity").equals("2")){
      List<Student> list = null;
      list = StudentHomeworkJdbc.selectStudent();
      int flag=0;
      for(Student s:list){
        if(id==s.getStudentID() && password.equals(s.getPassword())){
          flag=1;
          resp.sendRedirect("/student.jsp");
          break;
        }
      }
      if(flag==0){
        resp.sendRedirect("/unsuccess.jsp");
      }
    }
  }
}
