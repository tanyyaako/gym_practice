package org.example.repositories.Impl;

import org.example.entities.Reservation;
import org.example.repositories.GeneralRepository;
import org.example.repositories.ReservationRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ReservationRepImpl extends GeneralRepository<Reservation,Long> implements ReservationRepository {
    @Override
    public void save(Reservation reservation) {
        entityManager.persist(reservation);
    }
    @Override
    public Reservation findById(Long id) {
        return super.findById(Reservation.class, id);
    }



}
