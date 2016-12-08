package com.integration.dao;

import java.util.List;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.integration.entity.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO{
	
	


	//����û�
	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

	//���û��������û�
	public User getUser(String name) {
		String hsql="from User u where u.name='"+name+"'";
		User result=(User)((Query) this.getHibernateTemplate().find(hsql)).uniqueResult();
		return result;
		
	}

	//ɾ���û�
	public void delete(int id) {
		this.getHibernateTemplate().delete(findById(id));
	}

	//�����û�
	public void update(User user) {
		this.getHibernateTemplate().update(user);
		
	}

	//��id�����û�
	public User findById(int id) {
		User user=(User)this.getHibernateTemplate().get(User.class,id);
		return user;
	}

	//����ȫ���û�
	public List<User> findAll() {
		String queryString="from User";
		List<User> list=this.getHibernateTemplate().find(queryString);
		return list;
	}

}
