package pl.mazi85.charity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mazi85.charity.service.DonationService;
import pl.mazi85.charity.service.InstitutionService;


@Controller
@RequiredArgsConstructor
public class HomeController {

    private final InstitutionService institutionService;
    private final DonationService donationService;

    @RequestMapping("/")
    public String homeAction(Model model){
        model.addAttribute("institutions",institutionService.institutionsList());
        model.addAttribute("donationQuantity",donationService.donationQuantity());
        model.addAttribute("allItemsInDonations",donationService.allItemsInDonations());
        return "index";
    }
}