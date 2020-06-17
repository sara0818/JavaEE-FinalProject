package com.controller;

import com.entity.Stu_homework;
import com.jdbc.StudentHomeworkJdbc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class submitHomeworkController {
  @RequestMapping("/submitHomework")
  public static void submitHomework(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    Stu_homework studentHomework = new Stu_homework();
    studentHomework.setStudentID(Integer.parseInt(req.getParameter("studentID")));
    studentHomework.setHomeworkID(Integer.parseInt(req.getParameter("homeworkID")));
    studentHomework.setContent(req.getParameter("content"));
    StudentHomeworkJdbc.submitHomework(studentHomework);
    resp.sendRedirect("/student.jsp");
  }
}
