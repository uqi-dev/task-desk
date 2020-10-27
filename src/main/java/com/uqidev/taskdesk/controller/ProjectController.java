package com.uqidev.taskdesk.controller;

import com.uqidev.taskdesk.model.Project;
import com.uqidev.taskdesk.response.Response;
import com.uqidev.taskdesk.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<?> addProject(@RequestBody Project project) {
        projectService.createProject(project);
        return new ResponseEntity<>(new Response(201, "Project Created Successfully"), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Project> getAllProject() {
        return projectService.getAllProject();
    }

}
