package com.uqidev.taskdesk.controller;

import com.uqidev.taskdesk.model.Task;
import com.uqidev.taskdesk.response.Response;
import com.uqidev.taskdesk.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<?> addTask(@RequestBody Task task) {
        taskService.createTask(task);
        return new ResponseEntity<>(new Response(201, "User Create Successfuly"), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Task> getAllTask() {
        return taskService.findAll();
    }

}
