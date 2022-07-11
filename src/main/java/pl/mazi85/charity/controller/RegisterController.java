package pl.mazi85.charity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.mazi85.charity.model.User;
import pl.mazi85.charity.service.interfaces.EmailService;
import pl.mazi85.charity.service.interfaces.UserService;


@Controller
@RequiredArgsConstructor
@RequestMapping("/register")
public class RegisterController {

    private final UserService userService;
    private final EmailService emailService;

    @GetMapping
    public String registerView (Model model) {
        model.addAttribute("user", new User());
        return "app/register";
    }

    @PostMapping
    public String registerFilled (@ModelAttribute(name = "user") User user,
                                  @RequestParam(name = "password2") String password2){
        if(password2.equals(user.getPassword())) {
            emailService.sendSimpleMessage(user.getUsername(),"Welcome to DonityApp","click link");
            userService.createUser(user);}
        return "redirect:/login";
    }




}
