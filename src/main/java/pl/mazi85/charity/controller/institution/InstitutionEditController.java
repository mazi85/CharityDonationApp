package pl.mazi85.charity.controller.institution;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.mazi85.charity.model.Institution;
import pl.mazi85.charity.service.interfaces.InstitutionService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/institution/edit")
public class InstitutionEditController {

    private final InstitutionService institutionService;

    @GetMapping
    @RequestMapping("/{institutionId}")
    public String prepareView(Model model, @PathVariable Long institutionId){
        model.addAttribute("institution",institutionService.findUserById(institutionId));
        return "/admin/institution/edit";
    }

    @PostMapping
    public String editInstitution(@ModelAttribute(name = "institution") Institution institution){
        institutionService.saveInstitution(institution);
        return "redirect:/admin/institution/list";
    }
}
