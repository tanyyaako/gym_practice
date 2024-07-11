package org.example.repositories;

import org.example.entities.GymEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymRepository extends JpaRepository<GymEntity,Long> {
}
