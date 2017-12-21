package edu.mum.cs544.service;

import java.util.Collection;

import edu.mum.cs544.domain.User;

public interface IUserService {
	
	public void addUser(User user);
	public void deleteUser(int userId);
	public void updateUser(User user);
	public Collection<User> getUsers();
	public User getUser(int userId);

}
