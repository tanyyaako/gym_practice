package org.example.repositories.Impl;

import org.example.entities.GroupTraining;
import org.example.entities.GymEntity;
import org.example.repositories.GeneralRepository;
import org.example.repositories.GroupTrainingRepository;
import org.example.repositories.GymRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class GymRepositoryImpl extends GeneralRepository<GymEntity,Long> implements GymRepository {
    @Override
    public GymEntity findById(Long id) {
        return super.findById(GymEntity.class, id);
    }
}
