package com.integration.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.integration.entity.User;
import com.integration.service.UserService;
import com.opensymphony.xwork2.ActionSupport;


public class UserQueryAction extends ActionSupport {

 
   private UserService userService;     //业务逻辑组件
	
   //设置业务逻辑组件
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String execute(){
		List<User> userlist=userService.findAll();    //获取当前所有用户
		
		//将获取的用户放在request范围内
		ServletActionContext.getRequest().setAttribute("userlist", userlist);
		return SUCCESS;
	}

}
