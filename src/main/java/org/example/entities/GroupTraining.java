package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "group_training")
public class GroupTraining extends BaseEntity {

    private String name;
    private LocalDateTime dataTime;
    private String type;
    private Integer numberOfSeats;
    private CoachEntity coach;
    private GymEntity gym;
    private Set<Reservation> reservationSet;

    public GroupTraining(CoachEntity coach, LocalDateTime dataTime, GymEntity gym, String name, Integer numberOfSeats, Set<Reservation> reservationSet, String type) {
        this.coach = coach;
        this.dataTime = dataTime;
        this.gym = gym;
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        this.reservationSet = reservationSet;
        this.type = type;
    }
    protected GroupTraining() {}

    @Column(name = "data_time")
    public LocalDateTime getDataTime() {
        return dataTime;
    }

    public void setDataTime(LocalDateTime dataTime) {
        this.dataTime = dataTime;
    }


    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, targetEntity = CoachEntity.class)
    @JoinColumn(name = "coach_id")
    public CoachEntity getCoach() {
        return coach;
    }

    public void setCoach(CoachEntity coach) {
        this.coach = coach;
    }

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, targetEntity = GymEntity.class)
    @JoinColumn(name = "gym_id")
    public GymEntity getGym() {
        return gym;
    }

    public void setGym(GymEntity gym) {
        this.gym = gym;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "number_of_seats")
    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, targetEntity = Reservation.class, mappedBy = "groupTraining")
    public Set<Reservation> getReservationSet() {
        return reservationSet;
    }

    public void setReservationSet(Set<Reservation> reservationSet) {
        this.reservationSet = reservationSet;
    }
}
