package com.example.demoauth.pojoSerialization;

import lombok.Data;

import java.util.Set;

//используется для удобства и сериализации, чтобы не писать много в тело запроса
@Data
public class SignupRequest {

    private String username;
    private String email;
    private Set<String> roles;
    private String password;
}
