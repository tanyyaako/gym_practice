package org.example.entities;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Client")
public class ClientEntity {
    private Long id;

    private String name;

    private String surname;

    private String mail;

    private String contactNumber;

    private MembershipCardEntity membershipCard;

    private List<Reservation> reservationList;

    @Column
    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
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
    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }
}


