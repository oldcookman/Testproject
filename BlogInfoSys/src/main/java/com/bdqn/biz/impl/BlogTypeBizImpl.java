package com.bdqn.biz.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.biz.BlogTypeBiz;
import com.bdqn.dao.BlogTypeDao;
import com.bdqn.entity.BlogType;

@Service
public class BlogTypeBizImpl implements BlogTypeBiz {
	
	@Resource
	private BlogTypeDao blogTypeDao;
	
	@Override
	public List<Map<String, Object>> getBlogTypeByuserId(String userId) {
		// TODO Auto-generated method stub
		return blogTypeDao.getBlogTypeByuserId(userId);
	}

	@Override
	public List<BlogType> getBlogTypeAllByUserId(String userId) {
		// TODO Auto-generated method stub
		return blogTypeDao.getBlogTypeAllByUserId(userId);
	}

	@Override
	public Integer addBlogType(BlogType blogType) {
		// TODO Auto-generated method stub
		return blogTypeDao.addBlogType(blogType);
	}

	 

}
