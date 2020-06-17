package com.jdbc;

import com.dao.HomeworkMapper;
import com.dao.Stu_homeworkMapper;
import com.dao.StudentMapper;
import com.dao.TeacherMapper;
import com.entity.Homework;
import com.entity.Stu_homework;
import com.entity.Student;
import com.entity.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class StudentHomeworkJdbc {

  public static void addTeacher(Teacher teacher){
    SqlSessionFactory sqlSessionFactory = DBTools.getSqlSessionFactory();
    //2.创建SqlSession
    SqlSession session = sqlSessionFactory.openSession();

    TeacherMapper teacherMapper = session.getMapper(TeacherMapper.class);

    teacherMapper.addTeacher(teacher);

    session.commit();
  }

  public static void addStudent(Student student){
    SqlSessionFactory sqlSessionFactory = DBTools.getSqlSessionFactory();
    //2.创建SqlSession
    SqlSession session = sqlSessionFactory.openSession();

    StudentMapper studentMapper = session.getMapper(StudentMapper.class);

    studentMapper.addStudent(student);

    session.commit();
  }

  public static List<Teacher> selectTeacher(){
    List<Teacher> list;

    SqlSessionFactory sqlSessionFactory = DBTools.getSqlSessionFactory();
    //2.创建SqlSession
    SqlSession session = sqlSessionFactory.openSession();

    TeacherMapper teacherMapper = session.getMapper(TeacherMapper.class);

    list = teacherMapper.selectTeacher();

    session.commit();

    for(Teacher sh:list){
      System.out.println(sh.getPassword());
    }

    return list;
  }

  public static List<Student> selectStudent(){
    List<Student> list;

    SqlSessionFactory sqlSessionFactory = DBTools.getSqlSessionFactory();
    //2.创建SqlSession
    SqlSession session = sqlSessionFactory.openSession();

    StudentMapper studentMapper = session.getMapper(StudentMapper.class);

    list = studentMapper.selectStudent();

    session.commit();

    for(Student s :list){
      System.out.println(s.getPassword());
    }

    return list;
  }

  public static void issueHomework(Homework hw){
    SqlSessionFactory sqlSessionFactory = DBTools.getSqlSessionFactory();
    //2.创建SqlSession
    SqlSession session = sqlSessionFactory.openSession();

    HomeworkMapper homeworkMapper = session.getMapper(HomeworkMapper.class);

    homeworkMapper.issueHomework(hw);

    session.commit();
  }

  public static List<Homework> checkHomework(){
    List<Homework> list;

    SqlSessionFactory sqlSessionFactory = DBTools.getSqlSessionFactory();
    //2.创建SqlSession
    SqlSession session = sqlSessionFactory.openSession();

    HomeworkMapper HomeworkMapper = session.getMapper(HomeworkMapper.class);

    list = HomeworkMapper.checkHomework();

    session.commit();

    return list;
  }

  public static void submitHomework(Stu_homework studentHomework){
    SqlSessionFactory sqlSessionFactory = DBTools.getSqlSessionFactory();
    //2.创建SqlSession
    SqlSession session = sqlSessionFactory.openSession();

    Stu_homeworkMapper studentHomeworkMapper = session.getMapper(Stu_homeworkMapper.class);

    studentHomeworkMapper.submitHomework(studentHomework);

    session.commit();
  }

  public static void resubmitHomework(Stu_homework studentHomework){
    SqlSessionFactory sqlSessionFactory = DBTools.getSqlSessionFactory();
    //2.创建SqlSession
    SqlSession session = sqlSessionFactory.openSession();

    Stu_homeworkMapper studentHomeworkMapper = session.getMapper(Stu_homeworkMapper.class);

    studentHomeworkMapper.resubmitHomework(studentHomework);

    session.commit();
  }
}
