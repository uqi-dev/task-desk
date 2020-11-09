package com.uqidev.taskdesk.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
//@EntityListeners(AuditingEntityListener.class)
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

    @ManyToMany(mappedBy = "teamMembers",fetch = FetchType.EAGER)
    private Set<Team> teams;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "teamMember_task",
            joinColumns = {@JoinColumn(name = "teamMember_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "task_id", referencedColumnName = "id")}
             )
    private Set<Task> tasks;

}
