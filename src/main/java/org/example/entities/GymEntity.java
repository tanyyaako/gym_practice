package org.example.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Gym")
public class GymEntity {

    private Long id;
    private String address;
    private String contactNumber;
    private List<MembershipCardEntity> membershipCardEntityList;
    private List<AdminEntity> adminEntityList;

    @Column
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

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

    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, targetEntity = MembershipCardEntity.class, mappedBy = "gym")
    public List<MembershipCardEntity> getMembershipCardEntityList() {
        return membershipCardEntityList;
    }

    public void setMembershipCardEntityList(List<MembershipCardEntity> membershipCardEntityList) {
        this.membershipCardEntityList = membershipCardEntityList;
    }

    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, targetEntity = AdminEntity.class, mappedBy = "gym")
    public List<AdminEntity> getAdminEntityList() {
        return adminEntityList;
    }

    public void setAdminEntityList(List<AdminEntity> adminEntityList) {
        this.adminEntityList = adminEntityList;
    }
}
