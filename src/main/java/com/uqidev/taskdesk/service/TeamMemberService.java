package com.uqidev.taskdesk.service;

import com.uqidev.taskdesk.model.TeamMember;
import com.uqidev.taskdesk.model.User;
import com.uqidev.taskdesk.repository.TeamMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamMemberService {

    @Autowired
    private TeamMemberRepository teamMemberRepository;


    public TeamMember addTeamMember(TeamMember teamMember) {
        return teamMemberRepository.save(teamMember);
    }

    public List<TeamMember> getAll() {
        return teamMemberRepository.findAll();
    }
}
