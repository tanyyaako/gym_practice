package org.example.services.Impl;

import org.example.DTOs.ClientDTO;
import org.example.DTOs.GroupTrainingDTO;
import org.example.DTOs.GymDTO;
import org.example.DTOs.MembershipCardDTO;
import org.example.Exceptions.EntityNotFoundExcep;
import org.example.entities.ClientEntity;
import org.example.entities.GymEntity;
import org.example.entities.MembershipCardEntity;
import org.example.repositories.ClientRepository;
import org.example.repositories.GymRepository;
import org.example.repositories.MembershipCardRepository;
import org.example.services.MembershipCardService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembershipCardImpl implements MembershipCardService {

    private final MembershipCardRepository membershipCardRepository;
    private final ClientRepository clientRepository;
    private final GymRepository gymRepository;
    private final ModelMapper modelMapper;

    public MembershipCardImpl(ClientRepository clientRepository, MembershipCardRepository membershipCardRepository, GymRepository gymRepository, ModelMapper modelMapper) {
        this.clientRepository = clientRepository;
        this.membershipCardRepository = membershipCardRepository;
        this.gymRepository = gymRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public MembershipCardDTO checkCard(ClientDTO clientDTO){
        ClientEntity clientEntity = clientRepository.findByNumber(clientDTO.getContactNumber());
        MembershipCardEntity membershipCardEntity = clientRepository.findCardById(clientEntity.getId());
        MembershipCardDTO membershipCardDTO = modelMapper.map(membershipCardEntity, MembershipCardDTO.class);
        return membershipCardDTO;

    }
    @Override
    public String changeGym(MembershipCardDTO membershipCardDTO){
        MembershipCardEntity membershipCardEntity=membershipCardRepository.findByNumberCard(membershipCardDTO.getNumberCard()).orElseThrow(()-> new EntityNotFoundExcep("Membership card not found"));
        Integer check= membershipCardDTO.getCheck();
        if(check-1000>=0){
            GymEntity gymEntity=gymRepository.findById(membershipCardDTO.getGymId()).orElseThrow(()-> new EntityNotFoundExcep("Gym not found"));
            membershipCardEntity.setGym(gymEntity);
            membershipCardRepository.save(membershipCardEntity);
            return "Списано 1000 рублей";
        }
        return "Недостаточно средств";

    }
}