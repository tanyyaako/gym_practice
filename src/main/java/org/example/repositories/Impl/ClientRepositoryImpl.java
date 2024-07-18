package org.example.repositories.Impl;

import org.example.entities.ClientEntity;
import org.example.entities.MembershipCardEntity;
import org.example.repositories.ClientRepository;
import org.example.repositories.GeneralRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ClientRepositoryImpl extends GeneralRepository<ClientEntity,Long> implements ClientRepository {

    @Override
    public ClientEntity findByNumber(String contactNumber) {
        return entityManager.createQuery(
                        "SELECT c FROM ClientEntity c WHERE c.contactNumber = :contactNumber", ClientEntity.class)
                .setParameter("contactNumber", contactNumber)
                .getSingleResult();
    }

    @Override
    public MembershipCardEntity findCardById(Long id) {
        return entityManager.createQuery(
                        "SELECT c.membershipCard FROM ClientEntity c WHERE c.id = :id", MembershipCardEntity.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public ClientEntity findById(Long id) {
        return super.findById(ClientEntity.class, id);
    }
}
