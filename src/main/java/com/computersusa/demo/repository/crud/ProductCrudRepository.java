package com.computersusa.demo.repository.crud;

import com.computersusa.demo.entities.Product;
import org.springframework.data.repository.CrudRepository;



public interface ProductCrudRepository extends CrudRepository<Product, Integer>{

}