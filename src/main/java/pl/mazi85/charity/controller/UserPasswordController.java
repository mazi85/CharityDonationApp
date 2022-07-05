package pl.mazi85.charity.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mazi85.charity.model.User;
import pl.mazi85.charity.service.interfaces.UserService;

@Controller
@RequiredArgsConstructor
@RequestMapping("user/edit-password")
public class UserPasswordController {

    private final UserService userService;

    @GetMapping
    public String prepareView(Model model) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        model.addAttribute("user", userService.getUserByUsername(username));

        return "app/users/edit-password";
    }

    @PostMapping
    public String editProfile(User user){
        userService.editUserPassword(user);
        return "redirect:/logout";
    }

}
