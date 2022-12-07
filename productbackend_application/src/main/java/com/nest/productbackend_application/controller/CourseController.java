package com.nest.productbackend_application.controller;


import com.nest.productbackend_application.dao.ProductDao;
import com.nest.productbackend_application.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private ProductDao dao;

    @CrossOrigin(origins = "*")
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
        dao.save(p);
        return "product successfully added";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Product> ViewAll(){
        return (List<Product>) dao.findAll();
    }
}
