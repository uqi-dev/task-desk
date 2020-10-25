package com.uqidev.taskdesk.controller;

import com.uqidev.taskdesk.model.Organization;
import com.uqidev.taskdesk.model.User;
import com.uqidev.taskdesk.response.Response;
import com.uqidev.taskdesk.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/org")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<?> add(@RequestBody Organization organization) {
        organizationService.add(organization);
        return new ResponseEntity<>(new Response(201, "Organization Create Successfuly"), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Organization> getAll() {
        return organizationService.getAll();
    }

}
