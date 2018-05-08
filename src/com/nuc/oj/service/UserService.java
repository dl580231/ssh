package com.nuc.oj.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.nuc.oj.dao.UserDao;
import com.nuc.oj.entity.User;

@Component("userService")
public class UserService {
	@Resource(name="userDao")
	UserDao userDao;
	public void add() {
		User u=new User();
		u.setAge(21);
		userDao.add(u);
	}
}
