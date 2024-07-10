package org.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;
@Embeddable
public class ReservationId implements Serializable{


    private Long clientId;
    private Long groupTrainingId;

    @Column(name="client_id")
    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    @Column(name="group_training_id")
    public Long getGroupTrainingId() {
        return groupTrainingId;
    }

    public void setGroupTrainingId(Long groupTrainingId) {
        this.groupTrainingId = groupTrainingId;
    }
}
