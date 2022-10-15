package com.computersusa.demo.controller;
import com.computersusa.demo.entities.Client;
import com.computersusa.demo.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/Client")


public class ClientController {

    @Autowired
    private ClientServices clientServices;

    @GetMapping("/all")
    public List<Client> getAll() {return clientServices.getAll();  }
    @PostMapping("/save")
    public Client save(@RequestBody Client c) { return clientServices.save(c);
    }
}
