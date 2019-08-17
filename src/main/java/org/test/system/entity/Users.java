package org.test.system.entity;


import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("sys_users")
public class Users {

  private Integer id;
  private String username;
  private String password;
  private String salt;
  private String roleId;
  private Integer locked;
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


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }


  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }


  public Integer getLocked() {
    return locked;
  }

  public void setLocked(Integer locked) {
    this.locked = locked;
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
