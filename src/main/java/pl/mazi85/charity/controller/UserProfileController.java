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
@RequestMapping("user/profile")
public class UserProfileController {

    private final UserService userService;

    @GetMapping
    public String prepareView(Model model) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        model.addAttribute("user", userService.getUserByUsername(username));

        return "app/users/profile";
    }

    @PostMapping
    public String editProfile(User user){
        userService.editUser(user);
        return "redirect:/logout";
    }

}
