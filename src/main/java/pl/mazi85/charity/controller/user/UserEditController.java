package pl.mazi85.charity.controller.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.mazi85.charity.model.User;
import pl.mazi85.charity.service.interfaces.UserService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/users/edit")

public class UserEditController {

    private final UserService userService;

    @RequestMapping("/{userId}")
    @GetMapping
    public String prepareView(Model model, @PathVariable Long userId){
        model.addAttribute("user",userService.findUserById(userId));
        return "/admin/users/edit";
    }

    @PostMapping
    public String editUser(@ModelAttribute(name = "user") User user ){
        userService.editUser(user);
        return "redirect:list";
    }

}
