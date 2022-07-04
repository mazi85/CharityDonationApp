package pl.mazi85.charity.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mazi85.charity.model.Donation;
import pl.mazi85.charity.model.Institution;
import pl.mazi85.charity.repository.InstitutionRepository;
import pl.mazi85.charity.service.interfaces.InstitutionService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultInstitutionService implements InstitutionService {

    private final InstitutionRepository institutionRepository;

    @Override
    public List<Institution> institutionsList() {
        return institutionRepository.findAll();
    }

    public Institution saveInstitution(Institution institution) {
        return institutionRepository.save(institution);
    }

    @Override
    public Institution findUserById(Long institutionId) {
        return institutionRepository.getById(institutionId);
    }

}
