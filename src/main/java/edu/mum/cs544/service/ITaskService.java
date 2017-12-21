package edu.mum.cs544.service;

import java.util.Collection;

import edu.mum.cs544.domain.Task;

public interface ITaskService {
	
	public void addTask(Task task);
	public void deleteTask(int taskId);
	public void updateTask(Task task);
	public Collection<Task> getTasks();
	public Task getTask(int taskId);

}
