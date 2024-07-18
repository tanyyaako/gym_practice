package org.example.DTOs;

import jakarta.persistence.*;
import org.example.entities.ClientEntity;
import org.example.entities.GymEntity;
import org.example.entities.Reservation;

import java.time.LocalDateTime;
import java.util.Set;

public class MembershipCardDTO {
    private Long numberCard;
    private Integer type;
    private Long clientId;
    private String clientName;
    private String clientSurname;
    private String clientContactNumber;
    private String gymAddress;
    private Long gymId;
    private String information;
    private Integer check;

    public MembershipCardDTO(Integer check, String clientContactNumber, Long clientId, String clientName, String clientSurname, String gymAddress, Long gymId, String information, Long numberCard, Integer type) {
        this.check = check;
        this.clientContactNumber = clientContactNumber;
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.gymAddress = gymAddress;
        this.gymId = gymId;
        this.information = information;
        this.numberCard = numberCard;
        this.type = type;
    }

    public MembershipCardDTO() {
    }

    public String getClientContactNumber() {
        return clientContactNumber;
    }

    public void setClientContactNumber(String clientContactNumber) {
        this.clientContactNumber = clientContactNumber;
    }



    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }



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


    public String getGymAddress() {
        return gymAddress;
    }

    public void setGymAddress(String gymAddress) {
        this.gymAddress = gymAddress;
    }


    public Long getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(Long numberCard) {
        this.numberCard = numberCard;
    }


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getGymId() {
        return gymId;
    }

    public void setGymId(Long gymId) {
        this.gymId = gymId;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Integer getCheck() {
        return check;
    }

    public void setCheck(Integer check) {
        this.check = check;
    }
}
