package com.uqidev.taskdesk.service;

import com.uqidev.taskdesk.model.Organization;
import com.uqidev.taskdesk.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    public Organization add(Organization organization) {
        return organizationRepository.save(organization);
    }

    public List<Organization> getAll() {
        return organizationRepository.findAll();
    }


}
