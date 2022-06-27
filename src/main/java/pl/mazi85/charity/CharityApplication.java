package pl.mazi85.charity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import pl.mazi85.charity.model.User;
import pl.mazi85.charity.repository.UserRepository;

@SpringBootApplication
public class CharityApplication {

    public static void main(String[] args) {

        SpringApplication.run(CharityApplication.class, args);
    }


}
