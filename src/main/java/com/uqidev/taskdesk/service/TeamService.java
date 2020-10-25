package com.uqidev.taskdesk.service;

import com.uqidev.taskdesk.model.Team;
import com.uqidev.taskdesk.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

    public List<Team> getAllTeam() {
        return teamRepository.findAll();
    }
}
