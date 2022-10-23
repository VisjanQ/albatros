package com.techfest.project.entity;




import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity(name = "jobs")
public class Jobs {

    @Id
    @SequenceGenerator(
            name = "id_jobs_sequence",
            sequenceName = "id_jobs_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "id_jobs_sequence"
    )
    @Column(unique = true)
    private Long id;


    private String jobName;


    private String jobAddress;

    private String jobCountry;

    private String jobCity;

    private double jobSalary;

    private String jobPhoto;


}
