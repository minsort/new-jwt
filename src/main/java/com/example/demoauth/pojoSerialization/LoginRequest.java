package com.example.demoauth.pojoSerialization;

import lombok.Data;

//объект чтобы залогиниться
@Data
public class LoginRequest {
    private String username;
    private String password;
}
