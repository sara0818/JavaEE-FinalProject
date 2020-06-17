package com.controller;

import com.entity.Student;
import com.entity.Teacher;
import com.jdbc.StudentHomeworkJdbc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class RegisterController {
  @RequestMapping("/register")
  public void register(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    if(req.getParameter("identity").equals("1")){
      Teacher teacher = new Teacher();
      teacher.setTeacherID(Integer.parseInt(req.getParameter("id")));
      teacher.setPassword(req.getParameter("password"));
      teacher.setPhone(req.getParameter("phone"));
      teacher.setEmail(req.getParameter("email"));
      StudentHomeworkJdbc.addTeacher(teacher);
      resp.sendRedirect("/index.jsp");
    }else if(req.getParameter("identity").equals("2")){
      Student student = new Student();
      student.setStudentID(Integer.parseInt(req.getParameter("id")));
      student.setPassword(req.getParameter("password"));
      student.setPhone(req.getParameter("phone"));
      student.setEmail(req.getParameter("email"));
      StudentHomeworkJdbc.addStudent(student);
      resp.sendRedirect("/index.jsp");
    }
  }

}
