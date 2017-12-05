package edu.mum.cs544.domain;

import java.util.List;

enum Status { COMPLETE, INCOMPLETE }

public class Task {
	
	private TimeFrame timeFrame;
	
	private Status status;
	
	private List<Resource> resources;

	public TimeFrame getTimeFrame() {
		return timeFrame;
	}

	public void setTimeFrame(TimeFrame timeFrame) {
		this.timeFrame = timeFrame;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	
}
