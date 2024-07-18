package org.example.repositories;

import org.example.entities.ClientEntity;
import org.example.entities.GroupTraining;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface GroupTrainingRepository  {
    List<GroupTraining> findByFieldInCollection(List<String> collection);
    GroupTraining findById(Long id);

}
