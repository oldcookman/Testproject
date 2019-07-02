package com.bdqn.biz;

import java.util.List;
import java.util.Map;

import com.bdqn.entity.BlogType;

public interface BlogTypeBiz {
	/**
	 * 通过userId查询出当前的用户博客数据
	 * @param userId
	 * @return
	 */
	List<Map<String,Object>> getBlogTypeByuserId(String userId);
	
	/**
	 * 通过userId查询出用户当前的博客类型
	 * @param userId
	 * @return
	 */
	List<BlogType> getBlogTypeAllByUserId(String userId);
	/**
	 * 添加博客类型
	 * @param blogType
	 * @return
	 */
	Integer addBlogType(BlogType blogType);
}
