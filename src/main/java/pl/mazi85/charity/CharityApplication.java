package pl.mazi85.charity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import pl.mazi85.charity.model.User;
import pl.mazi85.charity.repository.UserRepository;
import pl.mazi85.charity.service.interfaces.UserService;

@SpringBootApplication
public class CharityApplication {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {

        SpringApplication.run(CharityApplication.class, args);
    }

    @Bean
   public CommandLineRunner run(){
        return args -> {
//            userService.createAdmin(User.builder()
//                            .username("admin")
//                            .password("admin123")
//                            .name("Maciek")
//                            .lastName("Maćkowski")
//                    .build());

        };
    }





}
