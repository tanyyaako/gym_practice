package org.example.repositories;

import org.example.entities.ClientEntity;
import org.example.entities.MembershipCardEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClientRepository extends GeneralRepository<ClientEntity,Long> {

    @Query(value="select c from ClientEntity c " +
            "where c.contactNumber=:contactNumber ")
    ClientEntity findByNumber(@Param("contactNumber") String contactNumber);

    @Query(value="select c.membershipCard from ClientEntity c " +
            "where c.id=:id ")
    MembershipCardEntity findCardById(@Param("id") Long id);


}