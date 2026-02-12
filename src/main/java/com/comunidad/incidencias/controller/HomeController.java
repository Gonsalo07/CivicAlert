<<<<<<< HEAD
package com.comunidad.incidencias.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "API de Incidencias funcionando correctamente 🚀";
    }
=======
package com.comunidad.incidencias.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "API de Incidencias funcionando correctamente 🚀";
    }
>>>>>>> cdc34d35cb8e41a9fab0f2f6046c0caa73c7225c
}