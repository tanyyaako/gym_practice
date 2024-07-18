package org.example.repositories;

import org.example.entities.MembershipCardEntity;

import java.util.Optional;

public interface MembershipCardRepository {
    MembershipCardEntity findByNumberCard(Long numberCard);
    MembershipCardEntity findById(Long id);
    void save(MembershipCardEntity membershipCardEntity);


}
