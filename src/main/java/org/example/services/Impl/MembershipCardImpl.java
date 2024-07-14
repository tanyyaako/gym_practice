package org.example.services.Impl;

import org.example.DTOs.ClientDTO;
import org.example.DTOs.GymDTO;
import org.example.DTOs.MembershipCardDTO;
import org.example.entities.ClientEntity;
import org.example.entities.GymEntity;
import org.example.entities.MembershipCardEntity;
import org.example.repositories.ClientRepository;
import org.example.repositories.GymRepository;
import org.example.repositories.MembershipCardRepository;
import org.example.services.MembershipCardService;
import org.springframework.stereotype.Service;

@Service
public class MembershipCardImpl implements MembershipCardService {

    private final MembershipCardRepository membershipCardRepository;
    private final ClientRepository clientRepository;
    private final GymRepository gymRepository;

    public MembershipCardImpl(ClientRepository clientRepository, GymRepository gymRepository, MembershipCardRepository membershipCardRepository) {
        this.clientRepository = clientRepository;
        this.gymRepository = gymRepository;
        this.membershipCardRepository = membershipCardRepository;
    }

    @Override
    public Integer CheckCard(ClientDTO clientDTO, GymDTO gymDTO){
        ClientEntity clientEntity = clientRepository.findByNumber(clientDTO.getContactNumber());
        MembershipCardEntity membershipCardEntity = clientRepository.findCardById(clientDTO.getId());
        Integer TypeOfCard = membershipCardEntity.getType();
        if(TypeOfCard == 1){
            if(membershipCardEntity.getGym().getId()!=gymDTO.getId()){
                GymEntity gymEntity=gymRepository.findById(gymDTO.getId());
                membershipCardEntity.setGym(gymEntity);
            }
        }
        return TypeOfCard;

    }




}
