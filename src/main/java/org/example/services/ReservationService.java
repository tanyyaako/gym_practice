package org.example.services;

import org.example.DTOs.ReservationDTO;

public interface ReservationService {
    public ReservationDTO reservation(Long clientId, Long groupTrainingId);
}
