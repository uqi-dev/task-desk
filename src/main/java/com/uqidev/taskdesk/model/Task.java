package com.uqidev.taskdesk.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
//@EntityListeners(AuditingEntityListener.class)
public class Task extends Auditable<Task>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private Double estimatedTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @ManyToMany(mappedBy = "tasks",fetch = FetchType.LAZY)
    private Set<TeamMember> teamMembers;

    // todo: add relation with: Project table (Many to One)
    // todo: add relation with: User table : createdByUser
    // todo: add files field

}
