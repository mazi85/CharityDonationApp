package pl.mazi85.charity.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mazi85.charity.model.Institution;
import pl.mazi85.charity.repository.InstitutionRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultInstitutionService implements InstitutionService{

    private final InstitutionRepository institutionRepository;

    @Override
    public List<Institution> institutionsList() {
        return institutionRepository.findAll();
    }
}
