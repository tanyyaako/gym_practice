package org.example.repositories;

import org.example.entities.GroupTraining;
import org.example.entities.GymEntity;
import org.example.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

public interface ReservationRepository extends GeneralRepository<Reservation,Long> {

}
