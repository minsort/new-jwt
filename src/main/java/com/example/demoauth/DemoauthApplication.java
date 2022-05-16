package com.example.demoauth;

import com.example.demoauth.model.Role;
import com.example.demoauth.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.example.demoauth.model.ERole.*;

@SpringBootApplication
public class DemoauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoauthApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(RoleRepository roleDao){
        return (args) -> {
            roleDao.save(new Role(1L,ROLE_ADMIN));
            roleDao.save(new Role(2L,ROLE_MODERATOR));
            roleDao.save(new Role(3L,ROLE_USER));
        };
    }



}
