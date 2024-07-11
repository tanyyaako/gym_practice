package org.example.repositories;

import org.example.entities.GroupTraining;
import org.example.entities.GymEntity;
import org.example.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
    @Query("select COUNT(r.client) from Reservation r " +
            "where r.groupTraining =: groupTraining ")
    Integer countByGroupTraining(
            @Param(value = "groupTraining") GroupTraining groupTraining);

}
