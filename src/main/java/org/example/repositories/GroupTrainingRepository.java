package org.example.repositories;

import org.example.entities.GroupTraining;
import org.example.entities.GymEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface GroupTrainingRepository extends GeneralRepository<GroupTraining,Long> {
    @Query("SELECT g FROM GroupTraining g WHERE g.type IN :collection")
    List<GroupTraining> findByFieldInCollection(@Param("collection") List<String> collection);
}
