package org.example.services.Impl;

import org.example.DTOs.GroupTrainingDTO;
import org.example.entities.ClientEntity;
import org.example.entities.GroupTraining;
import org.example.repositories.ClientRepository;
import org.example.repositories.GroupTrainingRepository;
import org.example.services.GroupTrainingService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

@Service
public class GroupTrainingImpl implements GroupTrainingService {

    private final ClientRepository clientRepository;
    private final GroupTrainingRepository groupTrainingRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public GroupTrainingImpl(ClientRepository clientRepository, GroupTrainingRepository groupTrainingRepository, ModelMapper modelMapper) {
        this.clientRepository = clientRepository;
        this.groupTrainingRepository = groupTrainingRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<GroupTrainingDTO> recommendedTraining(Long id) {
        ClientEntity clientEntity = clientRepository.findById(id);
        Long fatPercentage = clientEntity.getFatPercentage();
        String gender = clientEntity.getGender();
        Integer yearBirth = clientEntity.getYearOfBirth();
        Integer age= Year.now().getValue()-yearBirth;
        List<String> trainings = new ArrayList<>();
        if(age<=30){
            if(gender.equals("М")){
                if(fatPercentage>=4 && fatPercentage<20) {
                    trainings.add("Силовая");
                    trainings.add("Стретчинг");
                    trainings.add("Йога");
                }
                if(fatPercentage>=20 && fatPercentage<60) {
                    trainings.add("Кардио");
                    trainings.add("Йога");
                }
            }
            if(gender.equals("Ж")){
                if(fatPercentage>=4 && fatPercentage<25) {
                    trainings.add("Силовая");
                    trainings.add("Стретчинг");
                    trainings.add("Йога");
                }
                if(fatPercentage>=25 && fatPercentage<60) {
                    trainings.add("Кардио");
                    trainings.add("Йога");
                }
            }
        }
        if(age>30){
            if(gender.equals("М")){
                if(fatPercentage>=4 && fatPercentage<24) {
                    trainings.add("Силовая");
                    trainings.add("Стретчинг");
                    trainings.add("Йога");
                }
                if(fatPercentage>=24 && fatPercentage<60) {
                    trainings.add("Кардио");
                    trainings.add("Йога");
                }
            }
            if(gender.equals("Ж")){
                if(fatPercentage>=4 && fatPercentage<30) {
                    trainings.add("Силовая");
                    trainings.add("Стретчинг");
                    trainings.add("Йога");
                }
                if(fatPercentage>=30 && fatPercentage<60) {
                    trainings.add("Кардио");
                    trainings.add("Йога");
                }
            }
        }
        List<GroupTraining> groupTraining = groupTrainingRepository.findByFieldInCollection(trainings);
        List<GroupTrainingDTO> groupTrainingDTOs = groupTraining.stream()
                .map(groupTrainings -> modelMapper.map(groupTrainings, GroupTrainingDTO.class))
                .toList();
        return groupTrainingDTOs;

    }
}
