package com.uqidev.taskdesk.dto;

import com.uqidev.taskdesk.model.TeamMember;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class TeamTeamMemberDto {
    private String userName;
    private Set<TeamMember> teamMembers;
}
