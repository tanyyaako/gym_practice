package org.example.Controllers;

import org.example.DTOs.ClientDTO;
import org.example.DTOs.GymDTO;
import org.example.DTOs.MembershipCardDTO;
import org.example.services.MembershipCardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MembershipCardController {
    private final MembershipCardService membershipCardService;
    public MembershipCardController(MembershipCardService membershipCardService) {
        this.membershipCardService = membershipCardService;
    }

    @GetMapping("/checkCard")
    public MembershipCardDTO checkCard(@RequestBody ClientDTO clientDTO){
        return membershipCardService.checkCard(clientDTO);
    }

    @PatchMapping("/changeCard")
    public String changeGym(@RequestBody MembershipCardDTO membershipCardDTO) {
        return membershipCardService.changeGym(membershipCardDTO);
    }


}
