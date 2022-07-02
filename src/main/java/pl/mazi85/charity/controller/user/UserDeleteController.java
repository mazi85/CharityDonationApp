package pl.mazi85.charity.controller.user;


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
@RequestMapping("/admin/users/delete/{userId}")
public class UserDeleteController {

    private final UserService userService;

    @GetMapping
    public String prepareView(Model model, @PathVariable Long userId){
        model.addAttribute("username",userService.findUserById(userId).getUsername());
        return "/admin/users/delete";
    }
    @PostMapping
    public String deleteUser(@PathVariable Long userId){
        userService.deleteUser(userId);
        return "redirect:/admin/users/list";
    }

}
