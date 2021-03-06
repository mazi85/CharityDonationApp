package pl.mazi85.charity.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mazi85.charity.model.Donation;
import pl.mazi85.charity.service.interfaces.CategoryService;
import pl.mazi85.charity.service.interfaces.DonationService;
import pl.mazi85.charity.service.interfaces.InstitutionService;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/user/form")
public class UserAddDonationController {

    private final CategoryService categoryService;
    private final InstitutionService institutionService;
    private final DonationService donationService;

    @GetMapping
    public String formView(Model model) {

        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        model.addAttribute("categories", categoryService.allCategories());
        model.addAttribute("institutions", institutionService.institutionsList());
        model.addAttribute("donation", new Donation());
        model.addAttribute("username",username);
        return "app/users/form";
    }

    @PostMapping
    public String fromFilled(@ModelAttribute(name = "donation") Donation donation, Model model) {
        log.info("{}", donation);
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        Donation savedDonation = donationService.saveDonation(donation,username);
        model.addAttribute("donation",savedDonation);
        return "app/users/form-confirmation";

    }

}
