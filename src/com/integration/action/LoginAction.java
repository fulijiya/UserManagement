package com.integration.action;

import java.util.Iterator;
import java.util.List;
import com.integration.entity.User;
import com.integration.service.UserService;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport {
  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String usertype;
	private UserService userService;  //定义业务逻辑组件
	public String getUsertype(){
		return usertype;
	}
	public void setUsertype(String usertype){
		this.usertype=usertype;
	}
	
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username=username;
	}
	
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	
	//设置业务逻辑组件
	public void setUserService(UserService userService){
		this.userService=userService;
	}
	
	public String execute(){
	List<User> list=(List<User>) userService.findAll();
		
		User u=new User();
		Iterator<User> it=list.iterator();
		//检查用户信息是否存在数据库中
		while(it.hasNext()){
			u=(User)it.next();
  		if(username.trim().equals(u.getName())&&password.trim().equals(u.getPassword())&&usertype.trim().equals(u.getType()))   
				return "success";
			else
				return "failer";
				//trim()方法：去掉字符串左边和右边的空格
		}
		String page="failer";
		return page;
			
	}

}
