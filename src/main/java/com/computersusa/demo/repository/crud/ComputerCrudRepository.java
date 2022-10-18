package com.computersusa.demo.repository.crud;

import com.computersusa.demo.entities.Computer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@SpringBootApplication



public interface ComputerCrudRepository extends CrudRepository<Computer, Integer>{

}