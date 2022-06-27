package pl.mazi85.charity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.mazi85.charity.model.User;
import pl.mazi85.charity.service.UserService;


@Controller
@RequiredArgsConstructor
@RequestMapping("/register")
public class RegisterController {

    private final UserService userService;

    @GetMapping
    public String registerView (Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping
    public String registerFilled (@ModelAttribute(name = "user") User user,
                                  @RequestParam(name = "password2") String password2){
        if(password2.equals(user.getPassword())) {
            userService.createUser(user);}
        return "redirect:form";
    }




}
