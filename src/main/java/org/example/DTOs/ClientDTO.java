package org.example.DTOs;

import org.example.entities.BaseEntity;
import org.example.entities.MembershipCardEntity;
import org.example.entities.Reservation;

import java.time.LocalDateTime;
import java.util.Set;

public class ClientDTO {

    private Long id;
    private String name;
    private String surname;
    private String mail;
    private String contactNumber;
    private String gender;
    private String fatPercentage;
    private Integer yearOfBirth;
    private Set<Reservation> reservationSet;
    private Long membershipCardNumberCard;
    private LocalDateTime membershipCardDateOfCreation;
    private Integer membershipCardType;

    public ClientDTO(String contactNumber, String fatPercentage, String gender, Long id, String mail, LocalDateTime membershipCardDateOfCreation, Long membershipCardNumberCard, Integer membershipCardType, String name, Set<Reservation> reservationSet, String surname, Integer yearOfBirth) {
        this.contactNumber = contactNumber;
        this.fatPercentage = fatPercentage;
        this.gender = gender;
        this.id = id;
        this.mail = mail;
        this.membershipCardDateOfCreation = membershipCardDateOfCreation;
        this.membershipCardNumberCard = membershipCardNumberCard;
        this.membershipCardType = membershipCardType;
        this.name = name;
        this.reservationSet = reservationSet;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }
    public ClientDTO() {}

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(String fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDateTime getMembershipCardDateOfCreation() {
        return membershipCardDateOfCreation;
    }

    public void setMembershipCardDateOfCreation(LocalDateTime membershipCardDateOfCreation) {
        this.membershipCardDateOfCreation = membershipCardDateOfCreation;
    }

    public Long getMembershipCardNumberCard() {
        return membershipCardNumberCard;
    }

    public void setMembershipCardNumberCard(Long membershipCardNumberCard) {
        this.membershipCardNumberCard = membershipCardNumberCard;
    }

    public Integer getMembershipCardType() {
        return membershipCardType;
    }

    public void setMembershipCardType(Integer membershipCardType) {
        this.membershipCardType = membershipCardType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Reservation> getReservationSet() {
        return reservationSet;
    }

    public void setReservationSet(Set<Reservation> reservationSet) {
        this.reservationSet = reservationSet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
