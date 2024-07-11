package org.example.entities;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "client")
public class ClientEntity extends BaseEntity {

    private String name;

    private String surname;

    private String mail;

    private String contactNumber;

    private MembershipCardEntity membershipCard;

    private String weight;
    private String height;
    private String fatPercentage;
    private String musclePercentage;

    private Set<Reservation> reservationSet;

    public ClientEntity(String contactNumber, String fatPercentage, String height, String mail, MembershipCardEntity membershipCard, String musclePercentage, String name, Set<Reservation> reservationSet, String surname, String weight) {
        this.contactNumber = contactNumber;
        this.fatPercentage = fatPercentage;
        this.height = height;
        this.mail = mail;
        this.membershipCard = membershipCard;
        this.musclePercentage = musclePercentage;
        this.name = name;
        this.reservationSet = reservationSet;
        this.surname = surname;
        this.weight = weight;
    }

    protected ClientEntity() {}

    @Column(name = "fat_percentage")
    public String getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(String fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    @Column(name = "height")
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Column(name = "muscle_percentage")
    public String getMusclePercentage() {
        return musclePercentage;
    }
    public void setMusclePercentage(String musclePercentage) {
        this.musclePercentage = musclePercentage;
    }


    @Column(name = "weight")
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Column(name = "contact_number")
    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Column(name = "mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @OneToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, targetEntity = MembershipCardEntity.class, mappedBy = "client")
    public MembershipCardEntity getMembershipCard() {
        return membershipCard;
    }

    public void setMembershipCard(MembershipCardEntity membershipCard) {
        this.membershipCard = membershipCard;
    }

    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, targetEntity = Reservation.class, mappedBy = "client")
    public Set<Reservation> getReservationSet() {
        return reservationSet;
    }

    public void setReservationSet(Set<Reservation> reservationSet) {
        this.reservationSet = reservationSet;
    }
}


