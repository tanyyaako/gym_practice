package org.example.services.Impl;

import org.example.repositories.ReservationRepository;
import org.example.services.ReservationService;

public class ReservationImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }
}
