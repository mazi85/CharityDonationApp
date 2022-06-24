package pl.mazi85.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mazi85.charity.model.Institution;

@Repository
public interface InstitutionRepository extends JpaRepository<Institution,Long> {
}