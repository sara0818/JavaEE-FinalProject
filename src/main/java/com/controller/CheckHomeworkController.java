package com.controller;

import com.entity.Homework;
import com.jdbc.StudentHomeworkJdbc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CheckHomeworkController {
  @RequestMapping("/checkHomework")
  public String checkHomework(Model model){
    List<Homework> list = null;

    list = StudentHomeworkJdbc.checkHomework();

    model.addAttribute(list);

    return "success";
  }
}
