package com.bdqn.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdqn.biz.BlogTypeBiz;
import com.bdqn.entity.BlogInfo;
import com.bdqn.entity.BlogType;
import com.bdqn.entity.UserInfo;
import com.bdqn.util.Tool;
import com.bdqn.util.Val;

@Controller
@RequestMapping("/blogType")
public class BlogTypeController {
	
	@Resource
	private BlogTypeBiz blogTypeBiz;
	
	@RequestMapping("/gotoAdd")
	public String gotoAdd(HttpSession session,Model model) {
		UserInfo userInfo = (UserInfo) session.getAttribute(Val.USER_SESSION_KEY);
		List<BlogType> blogTypes = blogTypeBiz.getBlogTypeAllByUserId(userInfo.getUserId());
		model.addAttribute("blogTypes", blogTypes);
		model.addAttribute("bi", new BlogInfo());
		return "addBlogInfo";
	}
	
	@RequestMapping("/addBlogType")
	@ResponseBody
	public BlogType addBlogtype(BlogType bt,HttpSession session) {
		
	   UserInfo userInfo = (UserInfo) session.getAttribute(Val.USER_SESSION_KEY);
		bt.setBlogTypeDate(new Date());
		bt.setBlogTypeId(Tool.create_UUId());
		bt.setUserInfo(userInfo);
		blogTypeBiz.addBlogType(bt);
		
		return bt;
	}
}
