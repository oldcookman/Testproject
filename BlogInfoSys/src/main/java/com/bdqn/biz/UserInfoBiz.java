package com.bdqn.biz;

import com.bdqn.entity.UserInfo;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.User;

public interface UserInfoBiz {
	
	/**
	 * 通过userInfo信息判断是否登录
	 * @param userInfo
	 * @return
	 */
	UserInfo login(UserInfo userInfo);
	
	/**
	 * 添加用户信息
	 * @param uInfo
	 * @return
	 */
	Integer addUserInfo(UserInfo uInfo);

}
