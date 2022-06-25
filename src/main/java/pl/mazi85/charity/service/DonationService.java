package pl.mazi85.charity.service;

import pl.mazi85.charity.model.Donation;

public interface DonationService {
    Long donationQuantity();

    Long allItemsInDonations();

    Donation saveDonation(Donation donation);
}
