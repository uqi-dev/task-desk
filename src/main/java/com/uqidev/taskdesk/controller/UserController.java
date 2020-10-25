package com.uqidev.taskdesk.controller;

import com.uqidev.taskdesk.model.User;
import com.uqidev.taskdesk.response.Response;
import com.uqidev.taskdesk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<?> addUser(@RequestBody User user) {
        userService.createUser(user);
        return new ResponseEntity<>(new Response(201, "User Create Successfuly"), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

}
