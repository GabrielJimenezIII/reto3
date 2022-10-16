package com.computersusa.demo.controller;
import com.computersusa.demo.entities.Product;
import com.computersusa.demo.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Product")
@CrossOrigin(origins = "*")


public class ProductController {

    @Autowired
    private ProductServices productServices;

    @GetMapping("/all")
    public List<Product> getProduct() {
        return productServices.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable("id") int productId) {
        return productServices.getProduct(productId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Product save(@RequestBody Product product) {
        return productServices.save(product);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Product update(@RequestBody Product product) {
        return productServices.update(product);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int productId) {
        return productServices.deleteProduct(productId);
    }
}
