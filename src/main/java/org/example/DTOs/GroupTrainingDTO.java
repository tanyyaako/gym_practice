package org.example.DTOs;

import org.example.entities.CoachEntity;
import org.example.entities.GymEntity;
import org.example.entities.Reservation;

import java.time.LocalDateTime;
import java.util.Set;

public class GroupTrainingDTO {
    private String name;
    private LocalDateTime dataTime;
    private String type;
    private Integer numberOfSeats;
    private CoachEntity coach;
    private GymEntity gym;
    private Set<Reservation> reservationSet;


    public GroupTrainingDTO(CoachEntity coach, LocalDateTime dataTime, GymEntity gym, String name, Integer numberOfSeats, Set<Reservation> reservationSet, String type) {
        this.coach = coach;
        this.dataTime = dataTime;
        this.gym = gym;
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        this.reservationSet = reservationSet;
        this.type = type;
    }
    public GroupTrainingDTO() {}

    public CoachEntity getCoach() {
        return coach;
    }

    public void setCoach(CoachEntity coach) {
        this.coach = coach;
    }

    public LocalDateTime getDataTime() {
        return dataTime;
    }

    public void setDataTime(LocalDateTime dataTime) {
        this.dataTime = dataTime;
    }

    public GymEntity getGym() {
        return gym;
    }

    public void setGym(GymEntity gym) {
        this.gym = gym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Set<Reservation> getReservationSet() {
        return reservationSet;
    }

    public void setReservationSet(Set<Reservation> reservationSet) {
        this.reservationSet = reservationSet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
