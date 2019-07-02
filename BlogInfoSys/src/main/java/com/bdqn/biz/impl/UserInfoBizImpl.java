package com.bdqn.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.biz.UserInfoBiz;
import com.bdqn.dao.UserInfoDao;
import com.bdqn.entity.UserInfo;

@Service
public class UserInfoBizImpl implements UserInfoBiz {

	@Resource
	private UserInfoDao userInfodao;
	
	@Override
	public UserInfo login(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return userInfodao.getUserInfoByUser(userInfo);
	}

	@Override
	public Integer addUserInfo(UserInfo uInfo) {
		// TODO Auto-generated method stub
		return userInfodao.addUserInfo(uInfo);
	}

	 

}
