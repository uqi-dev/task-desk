package com.uqidev.taskdesk.dto;

import java.util.Set;

public interface TeamInterface {
    String getId();
    String getName();
    OrganizationInterface getOrganization();
    Set<TeamMemberInterface> getTeamMembers();

    // Organization Dto
//    interface OrganizationDTO{
//        String getPhone();
//    }

    // Team Members Dto
//    interface TeamMemberDTO{
//        String getEmail();
//    }
//    Set<TeamMember> getTeamMembers();
//    @Value("#{target.id}")
// Integer getId();
//    Set<TeamMember> getTeamMembers();
//    Organization getOrganization();
//    Set<TeamMember> getTeamMembers();
}
