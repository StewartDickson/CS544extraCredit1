package edu.mum.cs544.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProjectTest {
	
	private Project project;
	private Task task;
	
	@Before
	public void setup() {
		project = new Project();
		for(int taskId = 0; taskId < 3; taskId++) {
			task = new Task();
			project.addTask(task);
		}
	}

	@Test
	public void task_set_get_complete() {
		// Assert initial state is INCOMPLETE
		Status status = project.getStatus();
		Assert.assertEquals(Status.INCOMPLETE, status);
				
		// Arrange set all tasks in the project COMPLETE
		for(Task task : project.getTaskList()) {
			task.setStatus(Status.COMPLETE);
		}
		
		// Act
		status = project.getStatus();
		
		// Assert
		Assert.assertEquals(Status.COMPLETE, status);
		
		// Arrange set a random task INCOMPLETE
		int taskId = (int)Math.round(Math.random() * 3);
		project.getTaskList().get(taskId).setStatus(Status.INCOMPLETE);
		// Assert initial state is INCOMPLETE
		status = project.getStatus();
		Assert.assertEquals(Status.INCOMPLETE, status);
	}
}
