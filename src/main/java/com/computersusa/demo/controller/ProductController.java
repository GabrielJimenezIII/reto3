package com.computersusa.demo.controller;
import com.computersusa.demo.entities.Product;
import com.computersusa.demo.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/Product")

public class ProductController {

    @Autowired
    private ProductServices productServices;
    @GetMapping("/all")
    public List<Product> getAll(){
        return productServices.getAll();
    }
    @PostMapping("/save")
    public Product save(@RequestBody Product p){
        return productServices.save(p);
    }


}
