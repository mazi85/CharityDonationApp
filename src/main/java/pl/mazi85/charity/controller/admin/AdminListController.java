package pl.mazi85.charity.controller.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mazi85.charity.service.interfaces.UserService;


@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/admins/list")
public class AdminListController {

    private final UserService userService;

    @GetMapping
    public String prepareView(Model model){
        model.addAttribute("allAdmins",userService.allAdmins());

        return "/admin/admins/list";
    }


}
