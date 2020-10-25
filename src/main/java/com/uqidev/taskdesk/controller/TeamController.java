package com.uqidev.taskdesk.controller;

import com.uqidev.taskdesk.model.Team;
import com.uqidev.taskdesk.model.User;
import com.uqidev.taskdesk.response.Response;
import com.uqidev.taskdesk.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<?> createTeam(@RequestBody Team team) {
        teamService.createTeam(team);
        return new ResponseEntity<>(new Response(201, "Team Create Successfuly"), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Team> getAllUser() {
        return teamService.getAllTeam();
    }

}
