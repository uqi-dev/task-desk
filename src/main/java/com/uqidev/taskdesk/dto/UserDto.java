package com.uqidev.taskdesk.dto;

import com.uqidev.taskdesk.model.Organization;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private Integer id;
    private String name;
    private String userName;
    private String password;
    private String email;
    private String empId;
    private String designation;
    private String phoneNumber;
    private String imageUrl;
    private Boolean active;
    private List<Organization> organizations;
}
