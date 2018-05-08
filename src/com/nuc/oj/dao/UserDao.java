package com.nuc.oj.dao;
import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.nuc.oj.entity.User;



@Component("userDao")
public class UserDao{

	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;

	public void add(User u) {
		sessionFactory.getCurrentSession().save(u);
	}
	public void reduce(User u) {
		sessionFactory.getCurrentSession().update(u);
	}
	
	
}
