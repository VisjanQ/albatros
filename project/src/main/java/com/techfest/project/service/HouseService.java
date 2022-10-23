package com.techfest.project.service;

import com.techfest.project.dto.HouseDTO;
import com.techfest.project.entity.Houses;
import com.techfest.project.repository.HouseRepository;
import org.springframework.data.domain.Sort;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

public class HouseService {
    private  HouseRepository courseRepository;


    public HouseService(HouseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public HouseService() {

    }

    public String registerCourse(HouseDTO courseDto){
        Houses houses = new Houses();
        String imgName = StringUtils.cleanPath(courseDto.getFile().getOriginalFilename());
        if (imgName.contains("..")){
            throw new IllegalStateException("File is invalid");
        }
        try {
            houses.setHousePhoto(Base64.getEncoder().encodeToString(courseDto.getFile().getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        houses.setHouseTitle(courseDto.getHouseTitle());
        houses.setHouseAddress(courseDto.getHouseAddress());
        houses.setHouseCity(courseDto.getHouseCity());
        houses.setHouseCountry(courseDto.getHouseCountry());
        houses.setHouseRent(courseDto.getHouseRent());
        courseRepository.save(houses);
        return "SUCCESS!";
    }


    public List<Houses> getAll() {
        return courseRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }


}
