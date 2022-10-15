package com.computersusa.demo.controller;
import com.computersusa.demo.entities.Reservation;
import com.computersusa.demo.services.ReservationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Reservation")

public class ReservationController {

    @Autowired
    private ReservationServices reservationServices;

    @GetMapping("/all")
    public List<Reservation> getAll(){return reservationServices.getAll(); }
    @GetMapping("/{id}")
    public Optional<Reservation> getReservation(int id){return reservationServices.getReservationId(id);  }
    @PostMapping("/save")

    public Reservation save(@RequestBody Reservation reservation){
        return reservationServices.save(reservation);
    }

}
