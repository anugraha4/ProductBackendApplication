package com.nest.productbackend_application.controller;


import com.nest.productbackend_application.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @PostMapping(path="/",consumes = "application/json",produces = "application/json")
    public String AddProduct(@RequestBody Product p){
        System.out.println(p.getPdcode());
        System.out.println(p.getPdname().toString());
        System.out.println(p.getManfdate().toString());
        System.out.println(p.getExpdate().toString());
        System.out.println(p.getBrand().toString());
        System.out.println(p.getPrice().toString());
        System.out.println(p.getSelname().toString());
        System.out.println(p.getDistname().toString());
        return "product successfully added";
    }

    @GetMapping("/view")
    public String ViewAll(){
        return "view all products";
    }
}
