package org.example.repositories;

import org.example.entities.ClientEntity;
import org.example.entities.GymEntity;
import org.example.entities.MembershipCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface MembershipCardRepository extends GeneralRepository<MembershipCardEntity,Long> {
    Optional<MembershipCardEntity> findByNumberCard(Long numberCard);


}