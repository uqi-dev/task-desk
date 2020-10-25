package com.uqidev.taskdesk.repository;

import com.uqidev.taskdesk.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Integer> {

}
