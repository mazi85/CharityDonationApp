package pl.mazi85.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mazi85.charity.model.Donation;

public interface DonationRepository extends JpaRepository<Donation,Long> {
}
