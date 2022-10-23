package com.techfest.project.dto;

import org.springframework.web.multipart.MultipartFile;

public class JobsDTO {


    private Long id;


    private String jobName;


    private String jobAddress;

    private String jobCountry;

    private String jobCity;

    private double jobSalary;

    private MultipartFile jobFile;

    private Long jobId;

    public JobsDTO() {


     }
}
