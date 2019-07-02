package com.bdqn.controller;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.apache.tomcat.util.descriptor.web.LoginConfig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.bdqn.biz.BlogInfoBiz;
import com.bdqn.biz.BlogTypeBiz;
import com.bdqn.biz.UserInfoBiz;
import com.bdqn.entity.UserInfo;
import com.bdqn.util.Tool;
import com.bdqn.util.Val;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

	@Resource
	private UserInfoBiz userInfoBiz;
	@Resource
	private BlogInfoBiz blogInfobiz;

	
	@RequestMapping("/gotoAdd")
	public String gotoAdd() {
		return "register";
	}
	@RequestMapping("/addUserInfo")
	public String addUserInfo(UserInfo uInfo,MultipartFile header,HttpServletRequest request) throws IllegalStateException, IOException {
		//文件上传
		//获得原始文件的名称
		String oldFileName = header.getOriginalFilename();
		//获得文件的后缀名
		String extension = FilenameUtils.getExtension(oldFileName);
		//修改文件的名称
		String newFileName = Tool.create_UUId()+"."+extension;
		//获得根路径
		 
		//String rootPath = request.getServletPath().getRealPath("/");
		//request.getServletPath().;
		String rootPath = request.getServletContext().getRealPath("/");
		String relativePath = "/upload/userImg/"+newFileName;
		String fullPath = rootPath+relativePath;
		System.out.println(fullPath);
		header.transferTo(new File(fullPath));
		//保存到数据库
		uInfo.setUserId(Tool.create_UUId());
		uInfo.setUserDate(new Date());
		uInfo.setUserImg(relativePath);
		userInfoBiz.addUserInfo(uInfo);
		return "login";
	    
	}
	@RequestMapping("/gotoLogin")
	public String gotoLogin() {
		return "login";
	}
	@RequestMapping("/login")
	public String validateLogin(UserInfo ui,HttpSession session) {
		UserInfo uInfo = userInfoBiz.login(ui);
		if (uInfo!=null) {
			session.setAttribute(Val.USER_SESSION_KEY, uInfo);
			return "redirect:main.action";
		}else {
			return "login";
		}
	}
	@RequestMapping("/main")
	public String goToMain(HttpSession session,Model model) {
		UserInfo uInfo = (UserInfo) session.getAttribute(Val.USER_SESSION_KEY); 
		System.out.println("uInfo"+uInfo);
		model.addAttribute("BIList",  blogInfobiz.getBlogInfobyUserId(uInfo.getUserId()));
		return "myMain";
	}
	
	
	
}
