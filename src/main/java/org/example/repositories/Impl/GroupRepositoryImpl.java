package org.example.repositories.Impl;

import org.example.entities.ClientEntity;
import org.example.entities.GroupTraining;
import org.example.repositories.ClientRepository;
import org.example.repositories.GeneralRepository;
import org.example.repositories.GroupTrainingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class GroupRepositoryImpl extends GeneralRepository<GroupTraining,Long> implements GroupTrainingRepository {

    @Override
    public List<GroupTraining> findByFieldInCollection(List<String> collection) {
        return entityManager.createQuery(
                        "SELECT g FROM GroupTraining g WHERE g.type IN :collection", GroupTraining.class)
                .setParameter("collection", collection)
                .getResultList();
    }

    @Override
    public GroupTraining findById(Long id) {
        return super.findById(GroupTraining.class, id);
    }
}
