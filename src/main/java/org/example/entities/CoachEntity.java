package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Coach")
public class CoachEntity {
    private Long id;
    private String name;
    private String surname;
    private String contactNumber;
    private LocalDate startDateOfProfCareer;
    private List<GroupTraining> groupTrainingList;

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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    public LocalDate getStartDateOfProfCareer() {
        return startDateOfProfCareer;
    }

    public void setStartDateOfProfCareer(LocalDate startDateOfProfCareer) {
        this.startDateOfProfCareer = startDateOfProfCareer;
    }

    @Column
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, targetEntity = GroupTraining.class, mappedBy = "coach")
    public List<GroupTraining> getGroupTrainingList() {
        return groupTrainingList;
    }

    public void setGroupTrainingList(List<GroupTraining> groupTrainingList) {
        this.groupTrainingList = groupTrainingList;
    }
}
