package org.example.repositories;

import org.example.entities.CoachEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoachRepository extends JpaRepository<CoachEntity,Long> {
}
