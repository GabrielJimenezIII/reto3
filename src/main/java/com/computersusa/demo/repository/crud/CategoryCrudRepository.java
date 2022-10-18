package com.computersusa.demo.repository.crud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import com.computersusa.demo.entities.Category;
@SpringBootApplication
@EnableJpaRepositories
public interface CategoryCrudRepository extends CrudRepository<Category, Integer>{


}
