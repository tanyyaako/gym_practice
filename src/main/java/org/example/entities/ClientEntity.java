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

    private Set<Reservation> reservationSet;

    public ClientEntity(String contactNumber, String mail, MembershipCardEntity membershipCard, String name, Set<Reservation> reservationSet, String surname) {
        this.contactNumber = contactNumber;
        this.mail = mail;
        this.membershipCard = membershipCard;
        this.name = name;
        this.reservationSet = reservationSet;
        this.surname = surname;
    }

    protected ClientEntity() {}

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

    public void setReservationList(Set<Reservation> reservationSet) {
        this.reservationSet = reservationSet;
    }
}


