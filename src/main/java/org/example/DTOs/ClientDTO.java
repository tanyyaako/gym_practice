package org.example.DTOs;

import org.example.entities.BaseEntity;
import org.example.entities.MembershipCardEntity;
import org.example.entities.Reservation;

import java.util.Set;

public class ClientDTO {

    private Long id;
    private String name;

    private String surname;

    private String mail;

    private String contactNumber;
    private String gender;

    private MembershipCardEntity membershipCard;

    private String weight;
    private String height;
    private String fatPercentage;
    private String musclePercentage;
    private Integer yearOfBirth;

    private Set<Reservation> reservationSet;

    public ClientDTO(String contactNumber, String fatPercentage,Integer yearOfBirth,String gender, String height, Long id, String mail, MembershipCardEntity membershipCard, String musclePercentage, String name, Set<Reservation> reservationSet, String surname, String weight) {
        this.contactNumber = contactNumber;
        this.fatPercentage = fatPercentage;
        this.height = height;
        this.id = id;
        this.mail = mail;
        this.membershipCard = membershipCard;
        this.musclePercentage = musclePercentage;
        this.name = name;
        this.reservationSet = reservationSet;
        this.surname = surname;
        this.weight = weight;
        this.gender=gender;
        this.yearOfBirth=yearOfBirth;
    }

    private ClientDTO() {
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
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

    public String getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(String fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMusclePercentage() {
        return musclePercentage;
    }
    public void setMusclePercentage(String musclePercentage) {
        this.musclePercentage = musclePercentage;
    }


    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public MembershipCardEntity getMembershipCard() {
        return membershipCard;
    }

    public void setMembershipCard(MembershipCardEntity membershipCard) {
        this.membershipCard = membershipCard;
    }

    public Set<Reservation> getReservationSet() {
        return reservationSet;
    }

    public void setReservationSet(Set<Reservation> reservationSet) {
        this.reservationSet = reservationSet;
    }

}
