package com.chaos.app.person.entity;

import java.util.Date;

public class Person {
    private Integer personId;

    private Integer userId;

    private Integer areaId;

    private Integer personCategoryId;

    private String personName;

    private String personDesc;

    private String personAddr;

    private String phone;

    private String personImg;

    private Integer priority;

    private Date createTime;

    private Date updateTime;

    private Integer recordStatus;

    private String advice;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getPersonCategoryId() {
        return personCategoryId;
    }

    public void setPersonCategoryId(Integer personCategoryId) {
        this.personCategoryId = personCategoryId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public String getPersonDesc() {
        return personDesc;
    }

    public void setPersonDesc(String personDesc) {
        this.personDesc = personDesc == null ? null : personDesc.trim();
    }

    public String getPersonAddr() {
        return personAddr;
    }

    public void setPersonAddr(String personAddr) {
        this.personAddr = personAddr == null ? null : personAddr.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPersonImg() {
        return personImg;
    }

    public void setPersonImg(String personImg) {
        this.personImg = personImg == null ? null : personImg.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

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

    public Integer getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice == null ? null : advice.trim();
    }

    @Override
    public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append("Person [personId=").append(personId).append(", userId=").append(userId)
          .append(", areaId=").append(areaId).append(", personCategoryId=").append(personCategoryId)
          .append(", personName=").append(personName).append(", personDesc=").append(personDesc)
          .append(", personAddr=").append(personAddr).append(", phone=").append(phone)
          .append(", personImg=").append(personImg).append(", priority=").append(priority)
          .append(", createTime=").append(createTime).append(", updateTime=").append(updateTime)
          .append(", recordStatus=").append(recordStatus).append(", advice=").append(advice)
          .append("]");
      return builder.toString();
    }
    
}