package com.bdqn.entity;

import java.util.Date;

public class CommentInfo {
	private String commentInfoId;
	private UserInfo userInfo = new UserInfo();
	private BlogInfo blogInfo = new BlogInfo();
	private String commentText;
	private Date commentDate;
	
	public CommentInfo() { }

	public CommentInfo(String commentInfoId, UserInfo userInfo,
			BlogInfo blogInfo, String commentText,
			Date commentDate) {
		this.commentInfoId = commentInfoId;
		this.userInfo = userInfo;
		this.blogInfo = blogInfo;
		this.commentText = commentText;
		this.commentDate = commentDate;
	}

	public String getCommentInfoId() {
		return commentInfoId;
	}

	public void setCommentInfoId(String commentInfoId) {
		this.commentInfoId = commentInfoId;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public BlogInfo getBlogInfo() {
		return blogInfo;
	}

	public void setBlogInfo(BlogInfo blogInfo) {
		this.blogInfo = blogInfo;
	}

	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

}
