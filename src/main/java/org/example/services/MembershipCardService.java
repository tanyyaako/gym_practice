package org.example.services;

import org.example.DTOs.ClientDTO;
import org.example.DTOs.GymDTO;
import org.example.DTOs.MembershipCardDTO;

public interface MembershipCardService {
    public Integer CheckCard(ClientDTO clientDTO, GymDTO gymDTO);
}
