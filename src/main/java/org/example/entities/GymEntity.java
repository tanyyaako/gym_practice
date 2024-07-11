package org.example.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "gym")
public class GymEntity extends BaseEntity {

    private String address;
    private String contactNumber;
    private Set<MembershipCardEntity> membershipCardEntitySet;
    private Set<AdminEntity> adminEntitySet;

    public GymEntity(String address, Set<AdminEntity> adminEntitySet, String contactNumber, Set<MembershipCardEntity> membershipCardEntitySet) {
        this.address = address;
        this.adminEntitySet = adminEntitySet;
        this.contactNumber = contactNumber;
        this.membershipCardEntitySet = membershipCardEntitySet;
    }
    protected GymEntity() {}

    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "contact_number")
    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, targetEntity = MembershipCardEntity.class, mappedBy = "gym")
    public Set<MembershipCardEntity> getMembershipCardEntitySet() {
        return membershipCardEntitySet;
    }

    public void setMembershipCardEntitySet(Set<MembershipCardEntity> membershipCardEntitySet) {
        this.membershipCardEntitySet = membershipCardEntitySet;
    }

    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, targetEntity = AdminEntity.class, mappedBy = "gym")
    public Set<AdminEntity> getAdminEntitySet() {
        return adminEntitySet;
    }

    public void setAdminEntitySet(Set<AdminEntity> adminEntitySet) {
        this.adminEntitySet = adminEntitySet;
    }
}
