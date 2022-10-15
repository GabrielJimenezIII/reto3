package com.computersusa.demo.repository.crud;
import com.computersusa.demo.entities.Product;
import com.computersusa.demo.entities.Reservation;
import org.springframework.data.repository.CrudRepository;


public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {

}
