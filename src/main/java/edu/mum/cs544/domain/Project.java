package edu.mum.cs544.domain;

import java.util.LinkedList;
import java.util.List;

public class Project {
	
	private String description;
	
	private String location;
	
	private TimeFrame timeFrame;
	
	private List<Task> taskList = new LinkedList<Task>();

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public TimeFrame getTimeFrame() {
		return timeFrame;
	}

	public void setTimeFrame(TimeFrame timeFrame) {
		this.timeFrame = timeFrame;
	}

	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}
	
	public void addTask(Task task) {
		this.taskList.add(task);
	}
	
	public Status getStatus() {
		Status retStat = Status.INCOMPLETE;
		for(Task task : this.taskList) {
			if(task.getStatus() != Status.COMPLETE) {
				return Status.INCOMPLETE;
			}
		}
		return Status.COMPLETE;
	}

}
