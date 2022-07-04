package pl.mazi85.charity.service.interfaces;

import pl.mazi85.charity.model.Institution;

import java.util.List;

public interface InstitutionService {

    List<Institution> institutionsList();


    Institution saveInstitution(Institution institution);

    Institution findUserById(Long institutionId);

    void deleteUser(Long userId);
}
