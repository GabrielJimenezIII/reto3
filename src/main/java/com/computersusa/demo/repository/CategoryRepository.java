package com.computersusa.demo.repository;
import com.computersusa.demo.entities.Category;
import com.computersusa.demo.repository.crud.CategoryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import com.computersusa.demo.entities.Category;
import com.computersusa.demo.repository.crud.CategoryCrudRepository;

@Repository
public class CategoryRepository {
    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public List<Category> getAll(){return (List<Category>) categoryCrudRepository.findAll(); }
    public Optional<Category> getCategoryId(int id){return categoryCrudRepository.findById(id);  }
    public Category save(Category c){return categoryCrudRepository.save(c);  }
    public void delete (Category c){ categoryCrudRepository.delete(c);
    }
}
