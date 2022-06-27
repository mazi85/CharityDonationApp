package pl.mazi85.charity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mazi85.charity.model.User;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String registerView () {
        return "login";
    }

}
