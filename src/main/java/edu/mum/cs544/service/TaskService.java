package edu.mum.cs544.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.cs544.dao.TaskDAO;
import edu.mum.cs544.domain.Task;

@Service
public class TaskService implements ITaskService {
	
	@Autowired
    private TaskDAO taskDao;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void addTask(Task task) {
		taskDao.save(task);
	}

	public void deleteTask(int taskId) {
		taskDao.deleteById(taskId);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void updateTask(Task task) {
		taskDao.save(task);

	}

	public Collection<Task> getTasks() {
		
		return taskDao.findAll();
	}

	public Task getTask(int taskId) {
		return taskDao.findById(taskId);
	}

}
