package org.example.DTOs;

import jakarta.persistence.*;
import org.example.entities.ClientEntity;
import org.example.entities.GymEntity;
import org.example.entities.Reservation;

import java.time.LocalDateTime;
import java.util.Set;

public class MembershipCardDTO {
    private Long numberCard;

    private LocalDateTime dateOfCreation;

    private Integer type;

    private Long clientId;
    private String clientName;
    private String clientSurname;
    private String clientMail;
    private String clientContactNumber;
    private String clientGender;
    private String clientFatPercentage;
    private Integer clientYearOfBirth;
    private Set<Reservation> reservationSet;

    private String gymAddress;
    private String gymContactNumber;
    private Long gymId;
    private String information;
    private Integer check;

    public MembershipCardDTO(Integer check, String clientContactNumber, String clientFatPercentage, String clientGender,Long clientId, String clientMail,String clientName, String clientSurname, Integer clientYearOfBirth, LocalDateTime dateOfCreation, String gymAddress, String gymContactNumber, Long gymId, String information, Long numberCard, Set<Reservation> reservationSet, Integer type) {
        this.check = check;
        this.clientContactNumber = clientContactNumber;
        this.clientFatPercentage = clientFatPercentage;
        this.clientGender = clientGender;
        this.clientId = clientId;
        this.clientMail = clientMail;
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientYearOfBirth = clientYearOfBirth;
        this.dateOfCreation = dateOfCreation;
        this.gymAddress = gymAddress;
        this.gymContactNumber = gymContactNumber;
        this.gymId = gymId;
        this.information = information;
        this.numberCard = numberCard;
        this.reservationSet = reservationSet;
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

    public String getClientFatPercentage() {
        return clientFatPercentage;
    }

    public void setClientFatPercentage(String clientFatPercentage) {
        this.clientFatPercentage = clientFatPercentage;
    }

    public String getClientGender() {
        return clientGender;
    }

    public void setClientGender(String clientGender) {
        this.clientGender = clientGender;
    }


    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getClientMail() {
        return clientMail;
    }

    public void setClientMail(String clientMail) {
        this.clientMail = clientMail;
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


    public Integer getClientYearOfBirth() {
        return clientYearOfBirth;
    }

    public void setClientYearOfBirth(Integer clientYearOfBirth) {
        this.clientYearOfBirth = clientYearOfBirth;
    }

    public LocalDateTime getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDateTime dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getGymAddress() {
        return gymAddress;
    }

    public void setGymAddress(String gymAddress) {
        this.gymAddress = gymAddress;
    }

    public String getGymContactNumber() {
        return gymContactNumber;
    }

    public void setGymContactNumber(String gymContactNumber) {
        this.gymContactNumber = gymContactNumber;
    }

    public Long getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(Long numberCard) {
        this.numberCard = numberCard;
    }

    public Set<Reservation> getReservationSet() {
        return reservationSet;
    }

    public void setReservationSet(Set<Reservation> reservationSet) {
        this.reservationSet = reservationSet;
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
