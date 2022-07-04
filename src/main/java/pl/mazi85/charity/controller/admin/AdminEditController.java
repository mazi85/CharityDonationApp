package pl.mazi85.charity.controller.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.mazi85.charity.model.User;
import pl.mazi85.charity.service.interfaces.UserService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/admins/edit")

public class AdminEditController {

    private final UserService userService;

    @RequestMapping("/{adminId}")
    @GetMapping
    public String prepareView(Model model, @PathVariable Long adminId){
        model.addAttribute("admin",userService.findAdminById(adminId));
        return "/admin/admins/edit";
    }

    @PostMapping
    public String editUser(@ModelAttribute(name = "admin") User user ){
        userService.editAdmin(user);
        return "redirect:list";
    }

}
