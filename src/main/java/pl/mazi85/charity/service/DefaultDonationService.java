package pl.mazi85.charity.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mazi85.charity.model.Donation;
import pl.mazi85.charity.repository.DonationRepository;
import pl.mazi85.charity.service.interfaces.DonationService;
import pl.mazi85.charity.service.interfaces.UserService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultDonationService implements DonationService {

    private final DonationRepository donationRepository;
    private final UserService userService;

    @Override
    public Long donationQuantity() {
        return donationRepository.count();
    }

    @Override
    public Long allItemsInDonations() {
        return donationRepository.findAllByQuantityAndSum();
    }

    @Override
    public Donation saveDonation(Donation donation, String username) {
        donation.setUser(userService.getUserByUsername(username));
        return donationRepository.save(donation);
    }

    @Override
    public List<Donation> getAllCurrentUserDonationsOrdered(String username) {
        return donationRepository
                .findAllByUser_usernameOrderByReceivedDescUpdatedOnDescCreatedOnDesc(username) ;
    }
}
