package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="reservation")
public class Reservation extends BaseEntity {

    private ClientEntity client;
    private GroupTraining groupTraining;
    private LocalDateTime dateTime;

    public Reservation(ClientEntity client, LocalDateTime dateTime, GroupTraining groupTraining) {
        this.client = client;
        this.dateTime = dateTime;
        this.groupTraining = groupTraining;
    }
    public Reservation() {}

    @Column(name = "date_time")
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, targetEntity = ClientEntity.class)
    @JoinColumn(name = "client_id")
    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, targetEntity = GroupTraining.class)
    @JoinColumn(name = "group_training_id")
    public GroupTraining getGroupTraining() {
        return groupTraining;
    }

    public void setGroupTraining(GroupTraining groupTraining) {
        this.groupTraining = groupTraining;
    }
}
