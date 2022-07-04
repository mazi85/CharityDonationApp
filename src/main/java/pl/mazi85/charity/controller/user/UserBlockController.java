package pl.mazi85.charity.controller.user;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mazi85.charity.service.interfaces.UserService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/users")
public class UserBlockController {

    private final UserService userService;

    @RequestMapping("/block/{userId}")
    @GetMapping
     public String blockUser(@PathVariable Long userId){
        userService.blockUser(userId);
        return "redirect:/admin/users/list";
    }

    @RequestMapping("/unblock/{userId}")
    @GetMapping
    public String unblockUser(@PathVariable Long userId){
        userService.unblockUser(userId);
        return "redirect:/admin/users/list";
    }


}
