package edu.mum.cs544.domain;

enum Type { SKILL, ASSET }

public class Resource {

	private Type type;
	
	private String description;

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
