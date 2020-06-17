package com.entity;

import java.util.Date;

public class Homework {

  private int homeworkID;

  private int teacherID;

  private String title;

  private String content;

  private Date createTime;

  public int getHomeworkID() {
    return homeworkID;
  }

  public void setHomeworkID(int homeworkID) {
    this.homeworkID = homeworkID;
  }

  public int getTeacherID() {
    return teacherID;
  }

  public void setTeacherID(int teacherID) {
    this.teacherID = teacherID;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}
