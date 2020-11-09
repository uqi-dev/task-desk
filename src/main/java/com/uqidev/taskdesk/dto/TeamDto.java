package com.uqidev.taskdesk.dto;

import com.uqidev.taskdesk.model.Organization;
import com.uqidev.taskdesk.model.TeamMember;

import java.util.Set;

public class TeamDto {
    private Integer id;
    private String name;

    public TeamDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
