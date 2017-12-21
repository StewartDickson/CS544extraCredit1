package edu.mum.cs544.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.cs544.dao.UserDAO;
import edu.mum.cs544.domain.User;

@Service
public class UserService implements IUserService {
	
	@Autowired
    private UserDAO userDao;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void addUser(User user) {
		userDao.save(user);
	}

	public void deleteUser(int userId) {
		userDao.deleteById(userId);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void updateUser(User user) {
		userDao.save(user);

	}

	public Collection<User> getUsers() {
		
		return userDao.findAll();
	}

	public User getUser(int userId) {
		return userDao.findById(userId);
	}

}
