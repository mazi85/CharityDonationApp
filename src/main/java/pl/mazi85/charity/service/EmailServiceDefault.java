package pl.mazi85.charity.service;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import pl.mazi85.charity.service.interfaces.EmailService;

import java.util.UUID;


@Service
@RequiredArgsConstructor
public class EmailServiceDefault implements EmailService {

    private final JavaMailSender emailSender;

    @Override
    public void sendSimpleMessage(
            String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("muzy1125@gmail.com");//set Your email
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
    }

    @Override
    public void sendTokenMessage(String username, UUID uuid) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("");//set Your email
        message.setTo(username);
        message.setSubject("Witaj w DonityApp. Link aktywacyjny");
        message.setText("http://localhost:8080/register/confirmation/"+ uuid.toString());
        emailSender.send(message);
    }

}
