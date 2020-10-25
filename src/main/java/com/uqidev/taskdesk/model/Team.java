package com.uqidev.taskdesk.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class Team extends Auditable<Team>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Organization organization;

    /*@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "team_teamMember", joinColumns = {@JoinColumn(name = "team_id", referencedColumnName = "id")},
            inverseJoinColumns = {
                    @JoinColumn(name = "teamMember_id", referencedColumnName = "id")})*/
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<TeamMember> teamMember;

}
