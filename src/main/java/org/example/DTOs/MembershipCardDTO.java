package org.example.DTOs;

import jakarta.persistence.*;
import org.example.entities.ClientEntity;
import org.example.entities.GymEntity;

import java.time.LocalDateTime;

public class MembershipCardDTO {
    private Long numberCard;

    private LocalDateTime dateOfCreation;

    private Integer type;

    private ClientEntity client;

    private GymEntity gym;

    public MembershipCardDTO(ClientEntity client, LocalDateTime dateOfCreation, GymEntity gym, Long numberCard, Integer type) {
        this.client = client;
        this.dateOfCreation = dateOfCreation;
        this.gym = gym;
        this.numberCard = numberCard;
        this.type = type;
    }

    private MembershipCardDTO() {}

    public LocalDateTime getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDateTime dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
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

    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public GymEntity getGym() {
        return gym;
    }

    public void setGym(GymEntity gym) {
        this.gym = gym;
    }
}
