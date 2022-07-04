package pl.mazi85.charity.controller.institution;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mazi85.charity.model.Institution;
import pl.mazi85.charity.service.interfaces.InstitutionService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/institution/add")
public class InstitutionAddController {

    private final InstitutionService institutionService;

    @GetMapping
    public String prepareView(Model model){
        model.addAttribute("institution",new Institution());
        return "/admin/institution/add";
    }

    @PostMapping
    public String addInstitution(@ModelAttribute(name = "institution") Institution institution){
        institutionService.saveInstitution(institution);
        return "redirect:/admin/institution/list";
    }
}
