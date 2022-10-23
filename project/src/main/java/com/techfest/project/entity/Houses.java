package com.techfest.project.entity;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode

@Entity(name = "houses")
public class Houses {

    @Id
    @SequenceGenerator(
            name = "id_house_sequence",
            sequenceName = "id_house_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "id_house_sequence"
    )
    @Column(unique = true)
    private Long id;


    private String houseTitle;


    private String houseAddress;

    private String houseCountry;

    private String houseCity;

    private double houseRent;

    private String housePhoto;

    public Houses( ) {

    }

    public Houses(Long id, String houseTitle, String houseAddress, String houseCountry, String houseCity, double houseRent, String housePhoto) {
        this.id = id;
        this.houseTitle = houseTitle;
        this.houseAddress = houseAddress;
        this.houseCountry = houseCountry;
        this.houseCity = houseCity;
        this.houseRent = houseRent;
        this.housePhoto = housePhoto;
    }
}
