package com.bdqn.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class BlogInfo {
	private String blogInfoId;
	private String blogTitle;
	private String blogText;
	private BlogType blogType = new BlogType();
	private int blogClickCount;
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm")
	private Date blogDate;
	
	public BlogInfo() { }

	public BlogInfo(String blogInfoId, String blogTitle, String blogText,
			BlogType blogType, int blogClickCount, Date blogDate) {
		this.blogInfoId = blogInfoId;
		this.blogTitle = blogTitle;
		this.blogText = blogText;
		this.blogType = blogType;
		this.blogClickCount = blogClickCount;
		this.blogDate = blogDate;
	}

	public String getBlogInfoId() {
		return blogInfoId;
	}

	public void setBlogInfoId(String blogInfoId) {
		this.blogInfoId = blogInfoId;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBlogText() {
		return blogText;
	}

	public void setBlogText(String blogText) {
		this.blogText = blogText;
	}

	public BlogType getBlogType() {
		return blogType;
	}

	public void setBlogType(BlogType blogType) {
		this.blogType = blogType;
	}

	public int getBlogClickCount() {
		return blogClickCount;
	}

	public void setBlogClickCount(int blogClickCount) {
		this.blogClickCount = blogClickCount;
	}

	public Date getBlogDate() {
		return blogDate;
	}

	public void setBlogDate(Date blogDate) {
		this.blogDate = blogDate;
	}

	
}
