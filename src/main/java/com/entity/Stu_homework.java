package com.entity;

import java.util.Date;

public class Stu_homework {

  private int studentID;

  private int homeworkID;

  private String content;

  private Date createTime;

  private Date updateTime;

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public int getStudentID() {
    return studentID;
  }

  public void setStudentID(int studentID) {
    this.studentID = studentID;
  }

  public int getHomeworkID() {
    return homeworkID;
  }

  public void setHomeworkID(int homeworkID) {
    this.homeworkID = homeworkID;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
