package edu.mum.cs544.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaskTest {
	
	private Task task;
	
	@Before
	public void setup() {
		task = new Task();
	}

	@Test
	public void task_set_get_complete() {
		// Arrange
		task.setStatus(Status.COMPLETE);
		
		// Act
		Status status = task.getStatus();
		
		// Assert
		Assert.assertEquals(Status.COMPLETE, status);
	}
}
