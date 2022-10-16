package com.computersusa.demo.services;

import com.computersusa.demo.entities.Product;
import com.computersusa.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;



@Service
public class ProductServices {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public Optional<Product> getProduct(int productId) {
        return productRepository.getProduct(productId);
    }

    public Product save(Product product) {
        if (product.getId() == null) {
            return productRepository.save(product);
        } else {
            Optional<Product> e = productRepository.getProduct(product.getId());
            if (e.isPresent()) {
                return productRepository.save(product);
            } else {
                return product;
            }
        }
    }

    public Product update(Product product) {
        if (product.getId() != null) {
            Optional<Product> e = productRepository.getProduct(product.getId());
            if (!e.isPresent()) {
                if (product.getName() != null) {
                    e.get().setName(product.getName());
                }
                if (product.getBrand() != null) {
                    e.get().setBrand(product.getBrand());
                }
                if (product.getYear() != null) {
                    e.get().setYear(product.getYear());
                }
                if (product.getDescription() != null) {
                    e.get().setDescription(product.getDescription());
                }
                if (product.getCategory() != null) {
                    e.get().setCategory(product.getCategory());
                }
                productRepository.save(e.get());
                return e.get();
            } else {
                return product;
            }
        } else {
            return product;
        }
    }

    public boolean deleteProduct(int productId) {
        Boolean d = getProduct(productId).map(product -> {
            productRepository.delete(product);
            return true;
        }).orElse(false);
        return d;
    }
}
