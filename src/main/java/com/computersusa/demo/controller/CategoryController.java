package com.computersusa.demo.controller;
import com.computersusa.demo.entities.Category;
import com.computersusa.demo.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;




@RestController
@RequestMapping("/api/Category")

public class CategoryController {

    @Autowired
    private CategoryServices categoryServices;
    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/all")
    public List<Category> getAll(){
        return categoryServices.getAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/save")
    public Category save(@RequestBody Category a) {
        return categoryServices.save(a);
    }
}