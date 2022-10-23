package com.techfest.project.controller;

import com.techfest.project.dto.HouseDTO;
import com.techfest.project.entity.Houses;
import com.techfest.project.repository.HouseRepository;
import com.techfest.project.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class HouseController {

    @Autowired
    private final HouseService houseService;
    private final HouseRepository houseRepository;

    public HouseController(HouseService houseService, HouseRepository houseRepository) {
        this.houseService = houseService;
        this.houseRepository = houseRepository;
    }

    @ModelAttribute("house")
    public HouseDTO courseDto(){return new HouseDTO();}

    @GetMapping("/houses")
    public String getCourses(Model model){
        List<Houses> houses = houseService.getAll();
        model.addAttribute("house",houses);
        return "index";
    }

    @GetMapping("/houses/add")
    public String addCourse(){
        return "addHouse";
    }

    @PostMapping(value = "/houses/add", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces =MediaType.IMAGE_PNG_VALUE)
    public String addHouse(
            HouseDTO houseDTO

    ){
        houseService.registerCourse(houseDTO);
        return "redirect";
    }
}
