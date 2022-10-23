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
@Entity(name = "trainingCenterTable")
public class TrainingCenter {

    @Id
    @SequenceGenerator(
            name = "id_training_sequence",
            sequenceName = "id_training_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "id_training_sequence"
    )
    @Column(unique = true)
    private Long id;


    private String centerName;


    private String centerAddress;

    private String centerCountry;

    private String centerCity;

    private double coursePrice;

    private String courseDuration;

    private String photo;
}
