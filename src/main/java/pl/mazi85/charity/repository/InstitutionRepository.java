package pl.mazi85.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mazi85.charity.model.Institution;

public interface InstitutionRepository extends JpaRepository<Institution,Long> {
}
