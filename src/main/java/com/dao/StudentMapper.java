package com.dao;

import com.entity.Student;

import java.util.List;

public interface StudentMapper {
  void addStudent(Student student);
  List<Student> selectStudent();
}
