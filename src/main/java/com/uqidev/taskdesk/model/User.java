package com.uqidev.taskdesk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
//@DynamicUpdate
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//@JsonSerialize(using = CustomSerializer.class)
public class User extends Auditable<User>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(unique = true)
    private String userName;
    private String password;
    @Column(unique = true)
    private String email;
    private String empId;
    private String designation;
    private String phoneNumber;
    private String imageUrl;
    private Boolean active;

    // mappedBy = "user",
    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<Organization> organizations;

/*    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JsonManagedReference
    @JoinColumn(name = "user_id")
    private List<Team> teams;*/

}
