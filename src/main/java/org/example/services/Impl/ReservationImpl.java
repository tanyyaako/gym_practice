package org.example.services.Impl;

import org.example.entities.ClientEntity;
import org.example.entities.GroupTraining;
import org.example.entities.Reservation;
import org.example.repositories.ClientRepository;
import org.example.repositories.GroupTrainingRepository;
import org.example.repositories.ReservationRepository;
import org.example.services.ReservationService;

public class ReservationImpl implements ReservationService {

    private final ReservationRepository reservationRepository;
    private final ClientRepository clientRepository;
    private final GroupTrainingRepository groupTrainingRepository;

    public ReservationImpl(ClientRepository clientRepository, ReservationRepository reservationRepository, GroupTrainingRepository groupTrainingRepository) {
        this.clientRepository = clientRepository;
        this.reservationRepository = reservationRepository;
        this.groupTrainingRepository = groupTrainingRepository;
    }


    public void Reservation(Long clientId, Long groupTrainingId) {
        ClientEntity client = clientRepository.findById(clientId);
        GroupTraining group = groupTrainingRepository.findById(groupTrainingId);
        Reservation reservation=new Reservation();
        if(group.getNumberOfSeats()-group.getReservationSet().stream().count()>=1){
            reservation.setClient(client);
            reservation.setGroupTraining(group);
            reservationRepository.save(reservation);
        }
    }
}
