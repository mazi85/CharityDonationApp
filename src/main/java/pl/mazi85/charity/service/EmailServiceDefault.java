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
        UUID uuid = UUID.randomUUID();
        message.setFrom("");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
    }

}
