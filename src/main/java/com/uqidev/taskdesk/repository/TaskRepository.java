package com.uqidev.taskdesk.repository;

import com.uqidev.taskdesk.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
