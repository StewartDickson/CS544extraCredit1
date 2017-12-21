package edu.mum.cs544.controller;

import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.mum.cs544.domain.Project;
import edu.mum.cs544.service.IProjectService;

@Controller
public class ProjectController {
	
	@Autowired
	private IProjectService projectService;
	
	@Autowired
    private Project project;
	
	@Autowired
	private Collection<Project> projects;
	
	@GetMapping(value = "/listProjects")
	public ModelAndView listProjects(ModelAndView model) {
		projects = projectService.getProjects();
		model.addObject(projects);
		model.setViewName("projectList");
		return model;
	}

	@GetMapping(value = "/projectDetails")
	public ModelAndView showProjectDetails(ModelAndView model) {
        model.addObject(project);
        model.setViewName("projectDetails");
        return model;
	}
	
	@GetMapping(value = "/addProject")
	public ModelAndView addProject(ModelAndView model) {
		model.addObject(project);
		model.setViewName("addProject");
		return model;
	}
	
	@PostMapping(value = "/addProject")
	public String saveProject(Project project, BindingResult result) {
		projectService.addProject(project);
		return "projectDetails";
	}
	
	@GetMapping(value="/projectDetails/{id}")
	public String getProject(@PathVariable int id, ModelAndView model) {
		project = projectService.getProject(id);
		model.addObject(project);
		return "projectDetails";
	}
	
	@PostMapping(value="/update/{id}")
	public String update(Project project, @PathVariable int id) {
		project = projectService.getProject(id);
		projectService.updateProject(project);
		return "projectDetails";
	}
	
	@RequestMapping(value="/deleteProject/{id}", method=RequestMethod.POST)
	public String delete(@PathVariable int id) {
		projectService.deleteProject(id);
		return "";
	}
}
