package com.comunidad.incidencias.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comunidad.incidencias.model.EstadoIncidencia;
import com.comunidad.incidencias.service.EstadoIncidenciaService;

@RestController
@RequestMapping("/api/estados-incidencia")
@CrossOrigin(origins = "http://localhost:4200")
public class EstadoIncidenciaController {

    private final EstadoIncidenciaService service;

    public EstadoIncidenciaController(EstadoIncidenciaService service) {
        this.service = service;
    }

    @GetMapping
    public List<EstadoIncidencia> listar() {
        return service.listar();
    }
}
