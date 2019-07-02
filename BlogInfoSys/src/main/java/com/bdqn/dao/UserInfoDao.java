package com.bdqn.dao;

import com.bdqn.entity.UserInfo;

public interface UserInfoDao {
	
	/**
	 * 通过userInfo信息判断是否登录
	 * @param userInfo
	 * @return
	 */
	UserInfo getUserInfoByUser(UserInfo userInfo);
	
	/**
	 * 添加用户信息
	 * @param uInfo
	 * @return
	 */
	Integer addUserInfo(UserInfo uInfo);
}
