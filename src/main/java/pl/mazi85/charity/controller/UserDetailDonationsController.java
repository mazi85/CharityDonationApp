package pl.mazi85.charity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.mazi85.charity.service.interfaces.DonationService;


@Controller
@RequiredArgsConstructor
@RequestMapping("/user/donation/details/{donationId}")
public class UserDetailDonationsController {

    private final DonationService donationService;

    @GetMapping
    public String prepareView(Model model, @PathVariable Long donationId){
        model.addAttribute("donation", donationService.getDonationById(donationId));
        return "app/users/donation-details";
    }

    @PostMapping
    public String acceptReceive(@PathVariable Long donationId){
        donationService.acceptReceive(donationId);
        return "redirect:/user/donation/list";
    }

}
