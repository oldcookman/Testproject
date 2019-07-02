package com.bdqn.dao;

import org.junit.Test;

import com.bdqn.biz.BlogInfoBiz;
import com.bdqn.util.SpringTool;

public class BlogInfoDaoTest {

	@Test
	public void testGetTop50ClickCount() {
		BlogInfoDao blogInfodao = SpringTool.getBean(BlogInfoDao.class);
		//int count =  blogInfodao.getTop50ClickCount().size();
		/*BlogInfoBiz blogInfoBiz1 = SpringTool.getBean(BlogInfoBiz.class);
		BlogInfoBiz blogInfoBiz2 = SpringTool.getBean(BlogInfoBiz.class);*/
		//System.out.println(blogInfoBiz1==blogInfoBiz2);
		//System.out.println(count);
	}
	@Test
	public  void name() {
		System.out.println("===============");
	}

}
