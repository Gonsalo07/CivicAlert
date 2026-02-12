package com.comunidad.incidencias.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comunidad.incidencias.model.TipoIncidencia;
import com.comunidad.incidencias.service.TipoIncidenciaService;

@RestController
@RequestMapping("/api/tipos-incidencia")
@CrossOrigin(origins = "http://localhost:4200")
public class TipoIncidenciaController {

    private final TipoIncidenciaService service;

    public TipoIncidenciaController(TipoIncidenciaService service) {
        this.service = service;
    }

    @GetMapping
    public List<TipoIncidencia> listar() {
        return service.listar();
    }
}