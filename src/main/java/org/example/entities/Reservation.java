package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="reservation")
public class Reservation {

    private ReservationId id;
    private ClientEntity client;
    private GroupTraining groupTraining;
    private LocalDateTime dateTime;

    @EmbeddedId
    public ReservationId getId() {
        return id;
    }

    public void setId(ReservationId id) {
        this.id = id;
    }

    @Column
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, targetEntity = ClientEntity.class)
    @MapsId("clientId")
    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, targetEntity = GroupTraining.class)
    @MapsId("groupTrainingId")
    public GroupTraining getGroupTraining() {
        return groupTraining;
    }

    public void setGroupTraining(GroupTraining groupTraining) {
        this.groupTraining = groupTraining;
    }
}
