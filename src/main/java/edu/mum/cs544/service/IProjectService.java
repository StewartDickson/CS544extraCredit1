package edu.mum.cs544.service;

import java.util.Collection;

import edu.mum.cs544.domain.Project;

public interface IProjectService {
	
	public void addProject(Project project);
	public void deleteProject(int projectId);
	public void updateProject(Project project);
	public Collection<Project> getProjects();
	public Project getProject(int projectId);

}
