package org.example.services.Impl;

import org.example.DTOs.ClientDTO;
import org.example.entities.ClientEntity;
import org.example.entities.GroupTraining;
import org.example.repositories.ClientRepository;
import org.example.repositories.GroupTrainingRepository;
import org.example.services.GroupTrainingService;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class GroupTrainingImpl implements GroupTrainingService {

    private final ClientRepository clientRepository;
    private final GroupTrainingRepository groupTrainingRepository;

    public GroupTrainingImpl(ClientRepository clientRepository, GroupTrainingRepository groupTrainingRepository) {
        this.clientRepository = clientRepository;
        this.groupTrainingRepository = groupTrainingRepository;
    }

    List<GroupTraining> recommendedTraining(ClientDTO clientDTO){
        ClientEntity clientEntity = clientRepository.findById(clientDTO.getId());
        Long fatPercentage=clientEntity.getFatPercentage();
        String gender=clientEntity.getGender();
        Integer yearBirth=clientEntity.getYearOfBirth();
        Integer age= Year.now().getValue()-yearBirth;
        List<String> trainings= new ArrayList<>();
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
        List<GroupTraining> groupTraining=groupTrainingRepository.findByFieldInCollection(trainings);
        return groupTraining;
    }
}
