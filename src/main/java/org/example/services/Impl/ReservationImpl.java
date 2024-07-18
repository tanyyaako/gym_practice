package org.example.services.Impl;

import org.example.DTOs.ReservationDTO;
import org.example.entities.ClientEntity;
import org.example.entities.GroupTraining;
import org.example.entities.Reservation;
import org.example.repositories.ClientRepository;
import org.example.repositories.GroupTrainingRepository;
import org.example.repositories.ReservationRepository;
import org.example.services.ReservationService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReservationImpl implements ReservationService {

    private final ReservationRepository reservationRepository;
    private final ClientRepository clientRepository;
    private final GroupTrainingRepository groupTrainingRepository;
    private final ModelMapper modelMapper;

    public ReservationImpl(ClientRepository clientRepository, ReservationRepository reservationRepository, GroupTrainingRepository groupTrainingRepository, ModelMapper modelMapper) {
        this.clientRepository = clientRepository;
        this.reservationRepository = reservationRepository;
        this.groupTrainingRepository = groupTrainingRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ReservationDTO reservation(Long clientId, Long groupTrainingId) {
        ClientEntity client = clientRepository.findById(clientId);
        GroupTraining group = groupTrainingRepository.findById(groupTrainingId);
        Reservation reservation=new Reservation();
        if(group.getNumberOfSeats()-group.getReservationSet().stream().count()>=1){
            reservation.setClient(client);
            reservation.setGroupTraining(group);
            reservation.setDateTime(LocalDateTime.now());
            reservationRepository.save(reservation);
            return (ReservationDTO)modelMapper.map(reservation, ReservationDTO.class);
        }
        ReservationDTO reservationDTO=new ReservationDTO();
        reservationDTO.setInformation("Не хватает мест");
        return reservationDTO;
    }
}
