package com.comunidad.incidencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class IncidenciasApplication {
	//implements CommandLineRunner
	//@Autowired
	//private PasswordEncoder passwordEncoder;
	   
	public static void main(String[] args) {
		SpringApplication.run(IncidenciasApplication.class, args);
	}

  /*  @Override
    public void run(String... args) {
        System.out.println(passwordEncoder.encode("admin123"));
    }*/
}
