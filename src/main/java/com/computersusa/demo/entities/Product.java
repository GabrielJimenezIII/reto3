package com.computersusa.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name;
    private String brand;
    private Integer year;
    private String description;

    @ManyToOne
    @JoinColumn(name = "productId")
    @JsonIgnoreProperties("product")
    private Category category;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "product")
    @JsonIgnoreProperties({"product","client"})
    private List<Message> messages;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "product")
    @JsonIgnoreProperties({"product","messages"})
    public List<Reservation> reservations;

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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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

    public void setCategory (Category category){
        this.category = category;
    }

    public List<Message> getMessages(){
        return messages;
    }

    public void setMessages(List<Message> messages){
        this.messages = messages;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

}
