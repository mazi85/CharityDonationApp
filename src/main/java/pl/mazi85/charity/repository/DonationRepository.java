package pl.mazi85.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mazi85.charity.model.Donation;

@Repository
public interface DonationRepository extends JpaRepository<Donation,Long> {
}
