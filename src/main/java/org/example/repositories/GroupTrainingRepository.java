package org.example.repositories;

import org.example.entities.GroupTraining;
import org.example.entities.GymEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface GroupTrainingRepository extends JpaRepository<GroupTraining, Long> {
    @Query(value = "select gr from GroupTraining gr " +
            "where gr.type =: type ")
    List<GroupTraining> findByType(@Param(value = "type")
                                   String type);



}
