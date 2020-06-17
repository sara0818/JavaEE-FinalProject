package com.dao;

import com.entity.Stu_homework;

public interface Stu_homeworkMapper {
  void submitHomework(Stu_homework studentHomework);
  void resubmitHomework(Stu_homework studentHomework);
}
