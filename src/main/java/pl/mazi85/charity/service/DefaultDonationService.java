package pl.mazi85.charity.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mazi85.charity.model.Donation;
import pl.mazi85.charity.repository.DonationRepository;

@Service
@RequiredArgsConstructor
public class DefaultDonationService implements DonationService{

    private final DonationRepository donationRepository;

    @Override
    public Long donationQuantity() {
        return donationRepository.count();
    }

    @Override
    public Long allItemsInDonations() {
        return donationRepository.findAllByQuantityAndSum();
    }

    @Override
    public Donation saveDonation(Donation donation) {
        return donationRepository.save(donation);
    }
}
