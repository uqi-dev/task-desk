package com.uqidev.taskdesk.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class Organization extends Auditable<Organization>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String name;
    private String email;
    private String phone;
    private String businessType;
    private String descreption;
    private String logo;
    private String address;


    @ManyToOne
    private User user;

    /*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
//    @JoinColumn(name = "organization_id")
    private List<Team> teams;*/


}
