package com.bdqn.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class UserInfo {
	private String userId;
	private String userName;
	private String userPwd;
	private Integer userAge;
	private String userSex;
	private String userImg;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JSONField(format="yyyy-MM-dd")
	private Date userDate;

	public UserInfo() { }
	
	public UserInfo(String userId, String userName, String userPwd,
			Integer userAge, String userSex, String userImg, Date userDate) {
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userAge = userAge;
		this.userSex = userSex;
		this.userImg = userImg;
		this.userDate = userDate;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName
				+ ", userPwd=" + userPwd + ", userAge=" + userAge
				+ ", userSex=" + userSex + ", userImg=" + userImg
				+ ", userDate=" + userDate + "]";
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserImg() {
		return userImg;
	}
	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}
	public Date getUserDate() {
		return userDate;
	}
	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}
}
