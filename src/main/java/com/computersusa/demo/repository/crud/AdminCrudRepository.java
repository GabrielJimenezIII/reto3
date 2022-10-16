package com.computersusa.demo.repository.crud;

import com.computersusa.demo.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface AdminCrudRepository extends CrudRepository<Category, Integer> {
}
