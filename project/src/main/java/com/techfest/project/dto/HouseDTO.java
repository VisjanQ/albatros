package com.techfest.project.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class HouseDTO {

    private String houseTitle;


    private String houseAddress;

    private String houseCountry;

    private String houseCity;

    private double houseRent;

    private MultipartFile file;

    private Long id;

    public HouseDTO( ) {

    }
}
