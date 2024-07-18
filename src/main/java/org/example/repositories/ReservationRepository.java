package org.example.repositories;

import org.example.entities.MembershipCardEntity;
import org.example.entities.Reservation;

import java.util.Optional;

public interface ReservationRepository  {
    Reservation findById(Long id);
    void save(Reservation reservation);

}
