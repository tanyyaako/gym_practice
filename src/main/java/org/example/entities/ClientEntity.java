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
    private String gender;

    private String contactNumber;

    private MembershipCardEntity membershipCard;

    private String weight;
    private String height;
    private Long fatPercentage;
    private Integer yearOfBirth;


    private Set<Reservation> reservationSet;

    public ClientEntity(String contactNumber, Long fatPercentage, String gender, String height, String mail, MembershipCardEntity membershipCard, String name, Set<Reservation> reservationSet, String surname, String weight, Integer yearOfBirth) {
        this.contactNumber = contactNumber;
        this.fatPercentage = fatPercentage;
        this.gender = gender;
        this.height = height;
        this.mail = mail;
        this.membershipCard = membershipCard;
        this.name = name;
        this.reservationSet = reservationSet;
        this.surname = surname;
        this.weight = weight;
        this.yearOfBirth = yearOfBirth;
    }

    protected ClientEntity() {}

    @Column(name = "fat_percentage")
    public Long getFatPercentage() {
        return fatPercentage;
    }


    public void setFatPercentage(Long fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    @Column(name = "year_of_birth")
    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name = "height")
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
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


