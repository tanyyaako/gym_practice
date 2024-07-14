package org.example.DTOs;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import org.example.entities.AdminEntity;
import org.example.entities.MembershipCardEntity;

import java.util.Set;

public class GymDTO {
    private Long id;
    private String address;
    private String contactNumber;
    private Set<MembershipCardEntity> membershipCardEntitySet;
    private Set<AdminEntity> adminEntitySet;

    public GymDTO(String address, Set<AdminEntity> adminEntitySet, String contactNumber, Long id, Set<MembershipCardEntity> membershipCardEntitySet) {
        this.address = address;
        this.adminEntitySet = adminEntitySet;
        this.contactNumber = contactNumber;
        this.id = id;
        this.membershipCardEntitySet = membershipCardEntitySet;
    }

    public GymDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


    public Set<MembershipCardEntity> getMembershipCardEntitySet() {
        return membershipCardEntitySet;
    }

    public void setMembershipCardEntitySet(Set<MembershipCardEntity> membershipCardEntitySet) {
        this.membershipCardEntitySet = membershipCardEntitySet;
    }

    public Set<AdminEntity> getAdminEntitySet() {
        return adminEntitySet;
    }

    public void setAdminEntitySet(Set<AdminEntity> adminEntitySet) {
        this.adminEntitySet = adminEntitySet;
    }
}
