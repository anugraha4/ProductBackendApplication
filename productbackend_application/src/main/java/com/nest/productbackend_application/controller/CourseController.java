package com.nest.productbackend_application.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @PostMapping("/")
    public String AddProduct(){
        return "product successfully added";
    }
}
