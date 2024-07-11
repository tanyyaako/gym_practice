package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "admin")
public class AdminEntity extends BaseEntity {

    private String name;
    private String surname;
    private String contactNumber;
    private LocalDate dateOfEmployment;
    private GymEntity gym;

    public AdminEntity(String contactNumber, LocalDate dateOfEmployment, GymEntity gym, String name, String surname) {
        this.contactNumber = contactNumber;
        this.dateOfEmployment = dateOfEmployment;
        this.gym = gym;
        this.name = name;
        this.surname = surname;
    }

    protected AdminEntity() {}

    @Column(name = "contact_number")
    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Column(name = "date_of_employment")
    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
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

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, targetEntity = GymEntity.class)
    @JoinColumn
    public GymEntity getGym() {
        return gym;
    }

    public void setGym(GymEntity gym) {
        this.gym = gym;
    }
}
