package edu.mum.cs544.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.cs544.dao.ProjectDAO;
import edu.mum.cs544.domain.Project;

@Service
public class ProjectService implements IProjectService {
	
	@Autowired
    private ProjectDAO projectDao;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void addProject(Project project) {
		projectDao.save(project);
	}

	public void deleteProject(int projectId) {
		projectDao.deleteById(projectId);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void updateProject(Project project) {
		projectDao.save(project);

	}

	public Collection<Project> getProjects() {
		
		return projectDao.findAll();
	}

	public Project getProject(int projectId) {
		return projectDao.findById(projectId);
	}

}
