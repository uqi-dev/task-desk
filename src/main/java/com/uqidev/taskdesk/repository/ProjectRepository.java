package com.uqidev.taskdesk.repository;

import com.uqidev.taskdesk.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
