package pl.mazi85.charity.controller.institution;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mazi85.charity.service.interfaces.InstitutionService;
import pl.mazi85.charity.service.interfaces.UserService;


@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/institution/list")
public class InstitutionListController {

    private final InstitutionService institutionService;

    @GetMapping
    public String prepareView(Model model){
        model.addAttribute("allInstitutions",institutionService.institutionsList());

        return "/admin/institution/list";
    }


}
