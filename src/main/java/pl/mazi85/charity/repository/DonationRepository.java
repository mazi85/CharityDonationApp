package pl.mazi85.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.mazi85.charity.model.Donation;

@Repository
public interface DonationRepository extends JpaRepository<Donation,Long> {


    @Query(value = "SELECT SUM(quantity) FROM donations",nativeQuery = true)
    Long findAllByQuantityAndSum();
}
