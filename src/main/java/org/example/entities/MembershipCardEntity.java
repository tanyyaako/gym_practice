package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "membership_card")
public class MembershipCardEntity {

    private Long numberCard;

    private LocalDateTime dateOfCreation;

    private Integer type;

    private ClientEntity client;

    private GymEntity gym;
    private Integer check;

    public MembershipCardEntity(Integer check, ClientEntity client, LocalDateTime dateOfCreation, GymEntity gym, Long numberCard, Integer type) {
        this.check = check;
        this.client = client;
        this.dateOfCreation = dateOfCreation;
        this.gym = gym;
        this.numberCard = numberCard;
        this.type = type;
    }

    protected MembershipCardEntity() {}

    @Column(name = "date_of_creation")
    public LocalDateTime getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDateTime dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "number_card")
    public Long getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(Long numberCard) {
        this.numberCard = numberCard;
    }

    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @OneToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, targetEntity = ClientEntity.class)
    @JoinColumn(name = "client_id")
    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, targetEntity = GymEntity.class)
    @JoinColumn(name = "gym_id")
    public GymEntity getGym() {
        return gym;
    }

    public void setGym(GymEntity gym) {
        this.gym = gym;
    }

    @Column(name = "check_client")
    public Integer getCheck() {
        return check;
    }

    public void setCheck(Integer check) {
        this.check = check;
    }
}
