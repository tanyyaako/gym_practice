package org.example.DTOs;

import org.example.entities.ClientEntity;
import org.example.entities.GroupTraining;

import java.time.LocalDateTime;

public class ReservationDTO {
    private String clientName;
    private String clientSurname;
    private String groupTrainingName;
    private LocalDateTime dateTime;
    private String information;

    public ReservationDTO(String clientName, String clientSurname, LocalDateTime dateTime, String groupTrainingName, String information) {
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.dateTime = dateTime;
        this.groupTrainingName = groupTrainingName;
        this.information = information;
    }
    public ReservationDTO() {}

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getGroupTrainingName() {
        return groupTrainingName;
    }

    public void setGroupTrainingName(String groupTrainingName) {
        this.groupTrainingName = groupTrainingName;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
