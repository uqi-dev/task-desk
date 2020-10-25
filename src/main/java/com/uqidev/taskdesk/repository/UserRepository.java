package com.uqidev.taskdesk.repository;

import com.uqidev.taskdesk.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {


}
