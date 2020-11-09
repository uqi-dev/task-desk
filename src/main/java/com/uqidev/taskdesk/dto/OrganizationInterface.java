package com.uqidev.taskdesk.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

public interface OrganizationDto {
     Integer getId();
     String getName();
     String getEmail();
     String getPhone();
     String getBusinessType();
     String getDescription();
     String getLogo();
     String getAddress();

}
