package com.uqidev.taskdesk.service;

import com.uqidev.taskdesk.model.Comment;
import com.uqidev.taskdesk.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;


    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public List<Comment> getAll() {
        return commentRepository.findAll();
    }
}
