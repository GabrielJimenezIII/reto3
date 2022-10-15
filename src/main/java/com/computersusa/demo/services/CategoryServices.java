package com.computersusa.demo.services;
import com.computersusa.demo.entities.Category;
import com.computersusa.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoryServices {
    @Autowired
    private CategoryRepository categoryServices;

    public List<Category> getAll(){return categoryServices.getAll();  }
    public Optional<Category> getCategoryId (Integer id){return categoryServices.getCategoryId(id);  }
    public Category save(Category category){
        if (category.getId()==null){ return categoryServices.save(category);
        } else{
            Optional<Category> category1 = categoryServices.getCategoryId(category.getId());
            if (category1.isPresent()){
                return categoryServices.save(category);
            }else{
                return category;
            }
        }
    }

}
