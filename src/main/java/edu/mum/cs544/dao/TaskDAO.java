package edu.mum.cs544.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs544.domain.Task;

@Repository
public interface TaskDAO extends JpaRepository<Task, String> {

	Task save(Task task);
	
	Task findById(int id);
	
	List<Task> findAll();
	
	void deleteById(int id);
	
}
