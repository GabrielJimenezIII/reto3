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

    public List<Admin> getAdmins() {
        return repository.findAll();
    }
}