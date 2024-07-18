package org.example.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.example.Exceptions.EntityNotFoundExcep;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Repository
public abstract class GeneralRepository <Entity, T> {

    @PersistenceContext
    protected EntityManager entityManager;
    @Transactional
    public void save(Entity entity) {
        entityManager.persist(entity);
    }

    @Transactional
    public Entity findById (Class<Entity> entityClass, Long id) {
        String jpql = "SELECT e FROM " + entityClass.getSimpleName() + " e WHERE e.id = :id";
        List<Entity> result =  entityManager.createQuery(jpql, entityClass)
                .setParameter("id", id)
                .getResultList();
        if (result.isEmpty()) {
            throw new EntityNotFoundExcep("id не найден");
        } else {
            return result.get(0);
        }
    }
}