package org.example.repositories.Impl;

import org.example.entities.MembershipCardEntity;
import org.example.repositories.GeneralRepository;
import org.example.repositories.MembershipCardRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class MembershipCardRepImpl extends GeneralRepository<MembershipCardEntity,Long> implements MembershipCardRepository {
    @Override
    public MembershipCardEntity findByNumberCard(Long numberCard) {
        String jpql = "SELECT m FROM MembershipCardEntity m WHERE m.numberCard = :numberCard";
        return entityManager.createQuery(jpql, MembershipCardEntity.class)
                .setParameter("numberCard", numberCard)
                .getSingleResult();
    }

    @Override
    public MembershipCardEntity findById(Long id) {
        return super.findById(MembershipCardEntity.class, id);
    }
    @Override
    public void save(MembershipCardEntity membershipCardEntity) {
        entityManager.persist(membershipCardEntity);
    }
}
