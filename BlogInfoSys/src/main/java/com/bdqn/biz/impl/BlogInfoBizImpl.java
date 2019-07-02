package com.bdqn.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.bdqn.biz.BlogInfoBiz;
import com.bdqn.dao.BlogInfoDao;
import com.bdqn.entity.BlogInfo;

@Service
public class BlogInfoBizImpl implements BlogInfoBiz{

	public  BlogInfoBizImpl() {
		// TODO Auto-generated constructor stub
		System.err.println("========来到Biz了======");
	}
	
	@Resource
	private BlogInfoDao blogInfoDao;
	
	@Override
	public List<BlogInfo> getTop50ClickCount() {
		// TODO Auto-generated method stub
		return blogInfoDao.getTop50ClickCount();
	}

	@Override
	public BlogInfo getDetailByBlogInfoId(String blogInfoId) {
		// TODO Auto-generated method stub
		return blogInfoDao.getDetailByBlogInfoId(blogInfoId);
	}

	@Override
	public List<BlogInfo> getBlogInfobyUserId(String userId) {
		// TODO Auto-generated method stub
		return blogInfoDao.getBlogInfobyUserId(userId);
	}

	@Override
	public Integer addBlogInfo(BlogInfo blogInfo) {
		// TODO Auto-generated method stub
		return blogInfoDao.addBlogInfo(blogInfo);
	}	
	
	
}
