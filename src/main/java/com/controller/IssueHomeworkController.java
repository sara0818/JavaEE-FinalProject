package com.controller;

import com.entity.Homework;
import com.jdbc.StudentHomeworkJdbc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class IssueHomeworkController {
  @RequestMapping("/issueHomework")
  public static void issueHomework(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    Homework hw = new Homework();
    hw.setTeacherID(Integer.parseInt(req.getParameter("id")));
    hw.setTitle(req.getParameter("title"));
    hw.setContent(req.getParameter("content"));
    StudentHomeworkJdbc.issueHomework(hw);
    resp.sendRedirect("/teacher.jsp");
  }

}
