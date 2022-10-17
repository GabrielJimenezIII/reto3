package com.computersusa.demo.repository.crud;

import com.computersusa.demo.entities.Computer;
import org.springframework.data.repository.CrudRepository;



public interface ComputerCrudRepository extends CrudRepository<Computer, Integer>{

}