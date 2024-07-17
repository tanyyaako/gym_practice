package org.example.Controllers;

import org.example.DTOs.ClientDTO;
import org.example.DTOs.GroupTrainingDTO;
import org.example.entities.GroupTraining;
import org.example.services.GroupTrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GroupTrainingController {

    private final GroupTrainingService groupTrainingService;

    public GroupTrainingController(GroupTrainingService groupTrainingService) {
        this.groupTrainingService = groupTrainingService;
    }

    @GetMapping("/groupTrainings/{id}")
    List<GroupTrainingDTO> getAllGroupTrainings(@PathVariable Long id) {
        return groupTrainingService.recommendedTraining(id);
    }


}
