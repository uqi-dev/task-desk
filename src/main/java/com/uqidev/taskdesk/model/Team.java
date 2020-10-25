package com.uqidev.taskdesk.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Team extends Auditable<Team>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToOne
    @JsonBackReference
    private Organization organization;





    /*@ManyToOne
    @JsonBackReference
    private User user;*/


    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Organization organization;*/

    /*@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "team_teamMember", joinColumns = {@JoinColumn(name = "team_id", referencedColumnName = "id")},
            inverseJoinColumns = {
                    @JoinColumn(name = "teamMember_id", referencedColumnName = "id")})*/
    /*@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<TeamMember> teamMember;*/

}
