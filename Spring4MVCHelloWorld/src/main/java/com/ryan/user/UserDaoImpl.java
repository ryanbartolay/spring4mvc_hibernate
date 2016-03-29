package com.ryan.user;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.ryan.model.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	
	private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	
	public void create(User p) {
		getHibernateTemplate().save(p);
		logger.info("Person saved successfully, User Details="+p);
	}

	public void update(User p) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	public List<User> retrieveUsers() {
		List<User> userList = (List<User>) getHibernateTemplate().find("from User");
		for(User p : userList){
			logger.info("User List::"+p);
		}
		return userList;
	}

	public User retrieveUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}
}
