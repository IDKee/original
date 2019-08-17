package org.test.system.entity;


import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("sys_roles")
public class Roles {

  private Integer id;
  private String role;
  private String description;
  private Integer pid;
  private Integer available;
  private Integer inserter;
  private Date insertTime;
  private Integer updater;
  private Date updateTime;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Integer getPid() {
    return pid;
  }

  public void setPid(Integer pid) {
    this.pid = pid;
  }


  public Integer getAvailable() {
    return available;
  }

  public void setAvailable(Integer available) {
    this.available = available;
  }


  public Integer getInserter() {
    return inserter;
  }

  public void setInserter(Integer inserter) {
    this.inserter = inserter;
  }


  public Date getInsertTime() {
    return insertTime;
  }

  public void setInsertTime(Date insertTime) {
    this.insertTime = insertTime;
  }


  public Integer getUpdater() {
    return updater;
  }

  public void setUpdater(Integer updater) {
    this.updater = updater;
  }


  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

}
