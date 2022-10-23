package com.techfest.project.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;
@Getter
@Setter
@EqualsAndHashCode
public class CourseDTO {

    private MultipartFile file;
    private  String courseName;
    private  String courseDescription;
    private  String courseLength;
    private  Double price;
    private String contactNumber;
    private Long id;
    public CourseDTO() {

    }



}
