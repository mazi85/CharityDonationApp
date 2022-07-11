package pl.mazi85.charity.service.interfaces;

public interface EmailService {

     void sendSimpleMessage(String to, String subject, String text);
}
