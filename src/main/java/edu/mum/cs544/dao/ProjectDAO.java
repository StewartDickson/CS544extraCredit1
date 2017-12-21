package edu.mum.cs544.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs544.domain.Project;

@Repository
public interface ProjectDAO extends JpaRepository<Project,String> {

	Project save(Project project);
	
	Project findById(int id);
	
	List<Project> findAll();
	
	void deleteById(int id);

}
