package com.integration.action;

import com.integration.entity.User;
import com.integration.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

    private UserService userService;
    public void setUserService(UserService userService) {
    	this.userService = userService;
    }
    
    private User user;

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public String execute(){
	User u=new User();
	//�����յ��Ĳ������õ�User��ʵ��u��
	u.setName(user.getName());
	u.setPassword(user.getPassword());
	u.setType(user.getType());
	userService.saveUser(u);
	return SUCCESS;
	
}
	

}
