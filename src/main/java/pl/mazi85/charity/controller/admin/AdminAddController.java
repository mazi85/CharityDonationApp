package pl.mazi85.charity.controller.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.mazi85.charity.model.User;
import pl.mazi85.charity.service.interfaces.UserService;



@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/admins/add")
public class AdminAddController {

    private final UserService userService;

    @GetMapping
    public String registerView (Model model) {
        model.addAttribute("user", new User());
        return "/admin/admins/add";
    }

    @PostMapping
    public String createNewAdmin (@ModelAttribute(name = "user") User user,
                                  @RequestParam(name = "password2") String password2){
        if(password2.equals(user.getPassword())) {
            userService.createAdmin(user);}
        return "redirect:/admin/admins/list";
    }

}
