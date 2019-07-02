package com.bdqn.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.bdqn.util.*;

@WebListener
public class InitListener implements ServletContextListener {

	//容器启动的时候，可以用来做初始化操作
	@Override
	public void contextInitialized(ServletContextEvent evt) {
	 
		// TODO Auto-generated method stub
				ServletContext application = evt.getServletContext();
				Val.CONTEXT_PATH = application.getContextPath();
				//Val.CONTEXT_PATH = application.getRealPath("/");
				evt.getServletContext().setAttribute("rt", Val.CONTEXT_PATH);
				System.out.println("========contextPath========="+Val.CONTEXT_PATH);
				System.out.println("========rootPath========="+Val.CONTEXT_PATH);
	}
	//容器关闭的时候，可以用来做资源释放
	@Override
	public void contextDestroyed(ServletContextEvent evt) {
		
	}

}
