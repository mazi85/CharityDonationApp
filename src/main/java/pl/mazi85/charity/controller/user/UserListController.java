package pl.mazi85.charity.controller.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mazi85.charity.service.interfaces.UserService;


@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/users/list")
public class UserListController {

    private final UserService userService;

    @GetMapping
    public String prepareView(Model model){
        model.addAttribute("allUsers",userService.allUsers());

        return "/admin/users/list";
    }


}
