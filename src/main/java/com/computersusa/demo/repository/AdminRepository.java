package com.computersusa.demo.repository;
import com.computersusa.demo.entities.Category;
import com.computersusa.demo.repository.crud.AdminCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AdminRepository {
    @Autowired
    private AdminCrudRepository adminCrudRepository;

    public List<Category> getAll(){return (List<Category>) adminCrudRepository.findAll(); }
    public Optional<Category> getCategoryId(int id){return adminCrudRepository.findById(id);  }
    public Category save(Category c){return adminCrudRepository.save(c);  }
    public void delete (Category c){ adminCrudRepository.delete(c);
    }
}
