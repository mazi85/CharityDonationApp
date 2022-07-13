package pl.mazi85.charity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.mazi85.charity.model.Token;
import pl.mazi85.charity.model.User;
import pl.mazi85.charity.service.interfaces.EmailService;
import pl.mazi85.charity.service.interfaces.TokenService;
import pl.mazi85.charity.service.interfaces.UserService;

import java.util.UUID;


@Controller
@RequiredArgsConstructor
@RequestMapping("/register")
public class RegisterController {

    private final UserService userService;
    private final EmailService emailService;
    private final TokenService tokenService;

    @GetMapping
    public String registerView (Model model) {
        model.addAttribute("user", new User());
        return "app/register";
    }

    @PostMapping
    public String registerFilled (@ModelAttribute(name = "user") User user,
                                  @RequestParam(name = "password2") String password2){
        if(password2.equals(user.getPassword())) {
            userService.createUser(user);
            Token registerTokenForUser = tokenService.createRegisterTokenForUser(user);
            emailService.sendTokenMessage(user.getUsername(),registerTokenForUser.getUuid());
            }
        else{
            //model.addAttribute("user", user);
            return "app/register";
        }
        return "redirect:/register/confirmation";
    }

    @GetMapping
    @RequestMapping("/confirmation")
    public String registerConfirmationView() {
        return "app/register-confirmation";
    }

    @GetMapping
    @RequestMapping("/confirmation/{uuid}")
    public String registerConfirmation(@PathVariable UUID uuid) {
        return "redirect:/login";
    }




}
