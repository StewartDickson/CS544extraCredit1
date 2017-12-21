package edu.mum.cs544.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mum.cs544.domain.User;

public interface UserDAO extends JpaRepository<User, String> {

	User save(User user);
	
	User findById(int id);
	
	List<User> findAll();
	
	void deleteById(int id);
	
}
