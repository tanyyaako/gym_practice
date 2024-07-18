package org.example.repositories;

import org.example.entities.ClientEntity;
import org.example.entities.MembershipCardEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ClientRepository {

    ClientEntity findByNumber(String contactNumber);
    MembershipCardEntity findCardById(Long id);
    ClientEntity findById(Long id);
}
