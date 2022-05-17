package com.project.security;

import com.project.security.model.ERole;
import com.project.security.model.Role;
import com.project.security.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SMSSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SMSSecurityApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(RoleRepository roleDao){
        return (args) -> {
            roleDao.save(new Role(ERole.ROLE_ADMIN));
            roleDao.save(new Role(ERole.ROLE_MODERATOR));
            roleDao.save(new Role(ERole.ROLE_USER));
        };
    }



}
