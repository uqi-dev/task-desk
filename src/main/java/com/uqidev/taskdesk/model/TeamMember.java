package com.uqidev.taskdesk.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class TeamMember extends Auditable<TeamMember>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String userName;
    private String email;
    private String password;
    private Boolean isOwner;
    private Boolean isAdmin;


}
