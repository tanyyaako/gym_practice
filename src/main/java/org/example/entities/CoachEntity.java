package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "coach")
public class CoachEntity extends BaseEntity {
    private String name;
    private String surname;
    private String contactNumber;
    private LocalDate startDateOfProfCareer;
    private Set<GroupTraining> groupTrainingSet;

    public CoachEntity(String contactNumber, Set<GroupTraining> groupTrainingSet, String name, LocalDate startDateOfProfCareer, String surname) {
        this.contactNumber = contactNumber;
        this.groupTrainingSet = groupTrainingSet;
        this.name = name;
        this.startDateOfProfCareer = startDateOfProfCareer;
        this.surname = surname;
    }
    protected CoachEntity() {}

    @Column(name = "contact_number")
    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "start_date_of_prof_career")
    public LocalDate getStartDateOfProfCareer() {
        return startDateOfProfCareer;
    }

    public void setStartDateOfProfCareer(LocalDate startDateOfProfCareer) {
        this.startDateOfProfCareer = startDateOfProfCareer;
    }

    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, targetEntity = GroupTraining.class, mappedBy = "coach")
    public Set<GroupTraining> getGroupTrainingSet() {
        return groupTrainingSet;
    }

    public void setGroupTrainingSet(Set<GroupTraining> groupTrainingSet) {
        this.groupTrainingSet = groupTrainingSet;
    }
}
