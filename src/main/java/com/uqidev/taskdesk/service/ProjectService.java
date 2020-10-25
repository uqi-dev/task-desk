package com.uqidev.taskdesk.service;

import com.uqidev.taskdesk.model.Project;
import com.uqidev.taskdesk.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;


    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    public List<Project> getAllProject() {
        return projectRepository.findAll();
    }
}
