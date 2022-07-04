package pl.mazi85.charity.controller.institution;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mazi85.charity.service.interfaces.InstitutionService;


@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/institution/delete/{userId}")
public class InstitutionDeleteController {


    private final InstitutionService institutionService;

    @GetMapping
    public String prepareView(Model model, @PathVariable Long userId){
        model.addAttribute("name",institutionService.findUserById(userId).getName());
        return "/admin/institution/delete";
    }
    @PostMapping
    public String deleteInstitution(@PathVariable Long userId){
        institutionService.deleteUser(userId);
        return "redirect:/admin/institution/list";
    }

}
