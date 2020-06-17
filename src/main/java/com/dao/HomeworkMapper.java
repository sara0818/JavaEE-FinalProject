package com.dao;

import com.entity.Homework;

import java.util.List;

public interface HomeworkMapper {
  void issueHomework(Homework hw);
  List<Homework> checkHomework();
}
