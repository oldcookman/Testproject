package com.bdqn.entity;

import java.util.Date;

public class BlogType {
	private String blogTypeId;
	private String blogTypeName;
	private UserInfo userInfo = new UserInfo();
	private Date blogTypeDate;
	
	public BlogType() { }
	
	public BlogType(String blogTypeId, String blogTypeName, UserInfo userInfo,
			Date blogTypeDate) {
		this.blogTypeId = blogTypeId;
		this.blogTypeName = blogTypeName;
		this.userInfo = userInfo;
		this.blogTypeDate = blogTypeDate;
	}

	@Override
	public String toString() {
		return "BlogType [blogTypeId=" + blogTypeId + ", blogTypeName="
				+ blogTypeName + ", userInfo=" + userInfo + ", blogTypeDate="
				+ blogTypeDate + "]";
	}

	public String getBlogTypeId() {
		return blogTypeId;
	}
	public void setBlogTypeId(String blogTypeId) {
		this.blogTypeId = blogTypeId;
	}
	public String getBlogTypeName() {
		return blogTypeName;
	}
	public void setBlogTypeName(String blogTypeName) {
		this.blogTypeName = blogTypeName;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public Date getBlogTypeDate() {
		return blogTypeDate;
	}
	public void setBlogTypeDate(Date blogTypeDate) {
		this.blogTypeDate = blogTypeDate;
	}
	
}
