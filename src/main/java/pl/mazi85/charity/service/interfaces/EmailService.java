package pl.mazi85.charity.service.interfaces;

import java.util.UUID;

public interface EmailService {

     void sendSimpleMessage(String to, String subject, String text);

    void sendTokenMessage(String username, String uuid);
}
