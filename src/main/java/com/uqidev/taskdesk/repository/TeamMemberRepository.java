package com.uqidev.taskdesk.repository;

import com.uqidev.taskdesk.model.TeamMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamMemberRepository extends JpaRepository<TeamMember, Integer> {

}
