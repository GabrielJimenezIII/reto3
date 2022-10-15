package com.computersusa.demo.entities;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import nonapi.io.github.classgraph.json.Id;

import javax.persistence.*;

@Entity
@Table(name="Library")
public class Library implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String target;
    private String description;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("product")
    private Category category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}