package com.comunidad.incidencias.model;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;

}