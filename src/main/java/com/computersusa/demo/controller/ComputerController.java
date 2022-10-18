package com.computersusa.demo.controller;
import com.computersusa.demo.entities.Computer;
import com.computersusa.demo.services.ComputerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
@SpringBootApplication
@ConditionalOnClass
@RestController
@RequestMapping("/api/Computer")
@CrossOrigin(origins = "*")


public class ComputerController {

    @Autowired
    private ComputerServices computerServices;

    @GetMapping("/all")
    public List<Computer> getComputer() {
        return computerServices.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Computer> getComputer(@PathVariable("id") int computerId) {
        return computerServices.getComputer(computerId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Computer save(@RequestBody Computer computer) {
        return computerServices.save(computer);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Computer update(@RequestBody Computer computer) {
        return computerServices.update(computer);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int computerId) {
        return computerServices.deleteComputer(computerId);
    }
}
