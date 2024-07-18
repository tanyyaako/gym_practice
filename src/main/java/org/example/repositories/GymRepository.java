package org.example.repositories;

import org.example.entities.GroupTraining;
import org.example.entities.GymEntity;

import java.util.Optional;

public interface GymRepository  {
    GymEntity findById(Long id);

}
