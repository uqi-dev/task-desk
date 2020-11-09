package com.uqidev.taskdesk.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Column;

public interface OrganizationInterface {
     Integer getId();
     String getName();
     String getEmail();
     String getPhone();
     String getBusinessType();
     String getDescription();
     String getLogo();
     String getAddress();
}
