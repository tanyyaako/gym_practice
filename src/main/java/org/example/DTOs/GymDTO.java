package org.example.DTOs;

import org.example.entities.MembershipCardEntity;

import java.util.Set;

public class GymDTO {
    private Long id;
    private String address;
    private String contactNumber;
    private Set<MembershipCardEntity> membershipCardEntitySet;

    public GymDTO(String address, String contactNumber, Long id, Set<MembershipCardEntity> membershipCardEntitySet) {
        this.address = address;
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

}
