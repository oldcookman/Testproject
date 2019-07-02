package com.bdqn.dao;

import java.util.List;

import com.bdqn.entity.BlogInfo;

public interface BlogInfoDao {
	/**
	 * 查询点击率前50的值
	 * @return
	 */
	List<BlogInfo> getTop50ClickCount();
	
	/**
	 * 通过Id查询出详细信息
	 * @param blogInfoId
	 * @return
	 */
	BlogInfo getDetailByBlogInfoId(String blogInfoId);
	
	/**
	 * 查询当前博主的博客信息
	 * @param userId
	 * @return
	 */
	List<BlogInfo> getBlogInfobyUserId(String userId);
	
	/**
	 *添加博文信息
	 * @param blogInfo
	 * @return
	 */
	Integer addBlogInfo(BlogInfo blogInfo);
}
