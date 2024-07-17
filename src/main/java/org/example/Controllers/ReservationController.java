package org.example.Controllers;

import org.example.DTOs.ReservationDTO;
import org.example.repositories.ReservationRepository;
import org.example.services.ReservationService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {
    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("/createReservation/{clientId}/{groupTrainingId}")
    public ReservationDTO reservation(@PathVariable Long clientId, @PathVariable Long groupTrainingId){
        return reservationService.reservation(clientId, groupTrainingId);
    }
}
