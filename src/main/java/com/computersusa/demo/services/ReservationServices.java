package com.computersusa.demo.services;


import com.computersusa.demo.entities.Reservation;
import com.computersusa.demo.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class  ReservationServices {
    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAll(){
        return reservationRepository.getAll();
    }
    public Optional<Reservation> getReservationId(Integer id){
        return reservationRepository.getReservationId(id);
    }
    public Reservation save (Reservation reservation){
        if (reservation.getIdReservation()==null){
            return reservationRepository.save(reservation);
        } else {
            Optional<Reservation> reservation1 = reservationRepository.getReservationId(reservation.getIdReservation());
            if (reservation1.isPresent()){
                return reservationRepository.save(reservation);
            } else {
                return reservation;
            }
        }
    }
}
