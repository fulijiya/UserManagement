package com.integration.dao;

import java.util.List;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.integration.entity.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO{
	
	


	//添加用户
	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

	//按用户名查找用户
	public User getUser(String name) {
		String hsql="from User u where u.name='"+name+"'";
		User result=(User)((Query) this.getHibernateTemplate().find(hsql)).uniqueResult();
		return result;
		
	}

	//删除用户
	public void delete(int id) {
		this.getHibernateTemplate().delete(findById(id));
	}

	//更新用户
	public void update(User user) {
		this.getHibernateTemplate().update(user);
		
	}

	//按id查找用户
	public User findById(int id) {
		User user=(User)this.getHibernateTemplate().get(User.class,id);
		return user;
	}

	//查找全部用户
	public List<User> findAll() {
		String queryString="from User";
		List<User> list=this.getHibernateTemplate().find(queryString);
		return list;
	}

}
