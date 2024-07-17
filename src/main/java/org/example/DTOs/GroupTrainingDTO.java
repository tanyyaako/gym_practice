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
    private String gymAddress;
    private String gymContactNumber;


    public GroupTrainingDTO(LocalDateTime dataTime, String gymAddress, String gymContactNumber, String name, Integer numberOfSeats, String type) {
        this.dataTime = dataTime;
        this.gymAddress = gymAddress;
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        this.type = type;
    }
    public GroupTrainingDTO() {}

    public LocalDateTime getDataTime() {
        return dataTime;
    }

    public void setDataTime(LocalDateTime dataTime) {
        this.dataTime = dataTime;
    }

    public String getGymAddress() {
        return gymAddress;
    }

    public void setGymAddress(String gymAddress) {
        this.gymAddress = gymAddress;
    }

    public String getGymContactNumber() {
        return gymContactNumber;
    }

    public void setGymContactNumber(String gymContactNumber) {
        this.gymContactNumber = gymContactNumber;
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


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
