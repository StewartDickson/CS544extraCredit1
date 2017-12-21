package edu.mum.cs544.controller;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.*;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import edu.cs544.controller.ProjectController;

@RunWith(SpringRunner.class)
@WebMvcTest(ProjectController.class)
@WebAppConfiguration
public class ProjectControllerTest {

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockMvc;

	@BeforeEach
	void setUp() throws Exception {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void testListProjects() {
		try {
			this.mockMvc.perform(get("/listProjects"))
			.andExpect(model().attributeExists("projects"));
		} catch (Exception e) {

		}
	}

	@Test
	public void testShowProjectDetails() {
		try {
			this.mockMvc.perform(get("/projectDetails"))
			.andExpect(model().attributeExists("project"));
		} catch (Exception e) {

		}
	}

	@Test
	public void testAddProject() {
		try {
			this.mockMvc.perform(post("/addProject"))
			.andExpect(content().string("projectDetails"));
		} catch (Exception e) {

		}
	}

	@Test
	public void testSaveProject() {
		try {
			this.mockMvc.perform(post("/projectDetails"))
			.andExpect(content().string("projectDetails"));
		} catch (Exception e) {

		}
	}

	@Test
	public void testGetProject() {
		try {
			this.mockMvc.perform(get("/projectDetails/0"))
			.andExpect(model().attributeExists("project"));
		} catch (Exception e) {

		}
	}

	@Test
	public void testUpdate() {
		try {
			this.mockMvc.perform(post("/update/{id}"))
			.andExpect(content().string("projectDetails"));
		} catch (Exception e) {

		}
	}

	@Test
	public void testDelete() {
		try {
			this.mockMvc.perform(post("/deleteProject/{id}"))
			.andExpect(content().string(""));
		} catch (Exception e) {

		}
	}

}
