package com.computersusa.demo.controller;



import com.computersusa.demo.entities.Library;
import com.computersusa.demo.services.LibraryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/Library")

public class LibraryController {

    @Autowired
    private LibraryServices libraryServices;

    @GetMapping("/all")
    public List<Library> getAll(){
        return libraryServices.getAll();
    }

    @PostMapping("/save")
    public Library save(@RequestBody Library p){
        return libraryServices.save(p);
    }


}
