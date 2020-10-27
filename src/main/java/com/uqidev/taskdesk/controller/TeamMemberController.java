package com.uqidev.taskdesk.controller;

import com.uqidev.taskdesk.model.TeamMember;
import com.uqidev.taskdesk.model.User;
import com.uqidev.taskdesk.response.Response;
import com.uqidev.taskdesk.service.TeamMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/teamMember")
public class TeamMemberController {

    @Autowired
    private TeamMemberService teamMemberService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<?> addTeamMember(@RequestBody TeamMember teamMember) {
        teamMemberService.addTeamMember(teamMember);
        return new ResponseEntity<>(new Response(201, "Team Member Added Successfully"), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<TeamMember> getAllTeamMember() {
        return teamMemberService.getAll();
    }

}
