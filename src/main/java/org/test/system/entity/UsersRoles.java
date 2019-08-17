package org.test.system.entity;


import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("sys_users_roles")
public class UsersRoles {

  private Integer id;
  private Integer userId;
  private Integer roleId;
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


  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
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
