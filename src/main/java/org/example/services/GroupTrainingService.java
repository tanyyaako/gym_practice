package org.example.services;

import org.example.DTOs.ClientDTO;
import org.example.DTOs.GroupTrainingDTO;
import org.example.entities.GroupTraining;

import java.util.List;
import java.util.Set;

public interface GroupTrainingService {
    public List<GroupTrainingDTO> recommendedTraining(Long id);
}
