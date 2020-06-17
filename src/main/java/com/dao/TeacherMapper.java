package com.dao;

import com.entity.Teacher;

import java.util.List;

public interface TeacherMapper {
  void addTeacher(Teacher teacher);
  List<Teacher> selectTeacher();
}
