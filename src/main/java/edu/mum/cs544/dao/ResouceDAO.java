package edu.mum.cs544.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs544.domain.Resource;

@Repository
public interface ResouceDAO extends JpaRepository<Resource, String> {

	Resource save(Resource resource);
	
	Resource findById(int id);
	
	List<Resource> findAll();
	
	void deleteById(int id);
	
}
