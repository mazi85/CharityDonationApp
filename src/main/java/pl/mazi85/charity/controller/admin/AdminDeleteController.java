package pl.mazi85.charity.controller.admin;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mazi85.charity.service.interfaces.UserService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/admins/delete/{adminId}")
public class AdminDeleteController {

    private final UserService userService;

    @GetMapping
    public String prepareView(Model model, @PathVariable Long adminId){
        model.addAttribute("username",userService.findUserById(adminId).getUsername());
        return "/admin/admins/delete";
    }
    @PostMapping
    public String deleteUser(@PathVariable Long adminId){
        userService.deleteUser(adminId);
        return "redirect:/admin/admins/list";
    }

}
