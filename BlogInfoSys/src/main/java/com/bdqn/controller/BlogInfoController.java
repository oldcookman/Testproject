package com.bdqn.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bdqn.biz.BlogInfoBiz;
import com.bdqn.biz.BlogTypeBiz;
import com.bdqn.entity.BlogInfo;
import com.bdqn.util.Tool;

@Controller
@RequestMapping("/BlogInfo")
public class BlogInfoController {
	
	@Resource
	private BlogInfoBiz blogInfoBiz;
	@Resource
	private BlogTypeBiz blogTypeBiz;
	
	@RequestMapping("/showBlogInfos")
	public String getAllBlogInfosToShow(Model model) {
		model.addAttribute("BIList", blogInfoBiz.getTop50ClickCount());
		return "index";
	}
	
	@RequestMapping("/DetailWithBlogInfo")
	public String gotoDetail(String blogInfoId,Model model) {
		//获得用户对象
		BlogInfo blogInfo = blogInfoBiz.getDetailByBlogInfoId(blogInfoId);
		model.addAttribute("bgInfo",blogInfo);
		//通过数据库联系拿到数据
		String userId = blogInfo.getBlogType().getUserInfo().getUserId(); 
		//获得当前博客主的博客信息
		model.addAttribute("bgType", blogTypeBiz.getBlogTypeByuserId(userId));
		
		return "detailWithBlogInfo";
	}
	
	@RequestMapping("/add")
	public String addBlogInfo(BlogInfo bi) {
		bi.setBlogClickCount(0);
		bi.setBlogDate(new Date());
		bi.setBlogInfoId(Tool.create_UUId());
		blogInfoBiz.addBlogInfo(bi);
		return "redirect:../userInfo/main.action";
	}
}
