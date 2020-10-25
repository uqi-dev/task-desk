package com.uqidev.taskdesk.repository;

import com.uqidev.taskdesk.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
