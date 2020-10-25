package com.uqidev.taskdesk.controller;

import com.uqidev.taskdesk.model.Comment;
import com.uqidev.taskdesk.model.User;
import com.uqidev.taskdesk.response.Response;
import com.uqidev.taskdesk.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<?> addComment(@RequestBody Comment comment) {
        commentService.addComment(comment);
        return new ResponseEntity<>(new Response(201, "Comment Create Successfuly"), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Comment> getAllComments() {
        return commentService.getAll();
    }

}
