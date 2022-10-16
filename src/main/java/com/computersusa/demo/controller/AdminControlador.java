package com.computersusa.demo.controller;
import com.computersusa.demo.entities.Admin;
import com.computersusa.demo.services.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/Admin")
@CrossOrigin(origins = "*")

public class AdminControlador {
    @Autowired
    private AdminServices service;
    @GetMapping("/all")
    public List<Admin> getAdmins() {
        return service.getAdmins();
    }
    @PostMapping("/save")
    public ResponseEntity saveAdmin(@RequestBody Admin admin) {
        service.saveAdmin(admin);
        return ResponseEntity.status(201).build();
    }
}
