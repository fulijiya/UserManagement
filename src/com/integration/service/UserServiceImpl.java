package com.integration.service;

import java.util.List;

import com.integration.dao.UserDAO;
import com.integration.entity.User;

public class UserServiceImpl implements UserService{

	private UserDAO userDAO;
	
	//�ṩUserDAO�����ע��ͨ��
	public void setUserDAO(UserDAO userDAO){
		this.userDAO=userDAO;
	}
	
	//����û�
	public void saveUser(User user) {
		if(userDAO.findById(user.getId())==null)
			userDAO.save(user);
		
	}

   //���û��������û�
	public User getUser(String name) {
		
		return userDAO.getUser(name);
	}

	//ɾ���û�
	public void deleteUser(int id) {
		if(userDAO.findById(id)!=null)
			userDAO.delete(id);
		
	}

	//�����û�
	public void updateUser(User user) {
		if(userDAO.findById(user.getId())!=null)
			userDAO.update(user);
		
	}

	//��id�����û�
	public User findUserById(int id) {
		return userDAO.findById(id);
	}

	//����ȫ���û�
	public List<User> findAll() {
		
		return userDAO.findAll();
	}

}
