package com.uqidev.taskdesk.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

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

    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private Set<Project> projects;

    /*@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "project_teamMember", joinColumns = {@JoinColumn(name = "team_member_id", referencedColumnName = "id")},
            inverseJoinColumns = {
                    @JoinColumn(name = "teamMember_id", referencedColumnName = "id")})
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Project> projects;*/

}
