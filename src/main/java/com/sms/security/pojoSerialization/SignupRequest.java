package com.sms.security.pojoSerialization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import java.util.Set;

//используется для сериализации

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SignupRequest {

    @org.springframework.lang.NonNull
    private String surname;

    @org.springframework.lang.NonNull
    private String name;

    private String middleName;//????????????

    private String group;//?????????????????

    @Email
    @org.springframework.lang.NonNull
    private String email;

    @org.springframework.lang.NonNull
    private Set<String> roles;

    @org.springframework.lang.NonNull
    private String password;

    @org.springframework.lang.NonNull
    private String accountType;
}
