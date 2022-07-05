package pl.mazi85.charity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mazi85.charity.service.interfaces.DonationService;
import pl.mazi85.charity.service.interfaces.InstitutionService;


@Controller
@RequiredArgsConstructor
@RequestMapping("/home")
public class HomeController {

    private final InstitutionService institutionService;
    private final DonationService donationService;

    @GetMapping
    public String homeAction(Model model){
        model.addAttribute("institutions",institutionService.institutionsList());
        model.addAttribute("donationQuantity",donationService.donationQuantity());
        model.addAttribute("allItemsInDonations",donationService.allItemsInDonations());
        return "app/index";
    }
}
