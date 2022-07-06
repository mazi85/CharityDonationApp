package pl.mazi85.charity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mazi85.charity.service.interfaces.DonationService;


@Controller
@RequiredArgsConstructor
@RequestMapping("/user/donation/list")
public class UserListDonationsController {

    private final DonationService donationService;

    @GetMapping
    public String prepareView(Model model){
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        model.addAttribute("donations", donationService.getAllCurrentUserDonationsOrdered(username));
        return "app/users/donation-list";
    }

}
