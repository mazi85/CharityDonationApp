package pl.mazi85.charity.service.interfaces;

import pl.mazi85.charity.model.Donation;

import java.util.List;

public interface DonationService {
    Long donationQuantity();

    Long allItemsInDonations();

    Donation saveDonation(Donation donation, String username);

    List<Donation> getAllCurrentUserDonationsOrdered(String username);

    Donation getDonationById(Long donationId);

    void acceptReceive(Long donationId);
}
