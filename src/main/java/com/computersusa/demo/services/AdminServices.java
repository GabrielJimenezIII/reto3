package com.computersusa.demo.services;
import com.computersusa.demo.entities.Admin;
import com.computersusa.demo.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class AdminServices {
    @Autowired
    private AdminRepository repository;

    public static List<Admin> getAll() {return AdminServices.getAll();}


    public Admin saveAdmin(Admin admin) {return AdminServices.save(admin);}



}