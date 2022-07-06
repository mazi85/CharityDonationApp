package pl.mazi85.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.mazi85.charity.model.Donation;

import java.util.List;

public interface DonationRepository extends JpaRepository<Donation,Long> {


    @Query(value = "SELECT SUM(quantity) FROM donations",nativeQuery = true)
    Long findAllByQuantityAndSum();

    List<Donation> findAllByUser_usernameOrderByReceivedDescUpdatedOnDescCreatedOnDesc(String username);
}
