package com.comunidad.incidencias.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.comunidad.incidencias.model.TipoIncidencia;
import com.comunidad.incidencias.repository.ITipoIncidenciaRepository;

@Service
public class TipoIncidenciaService {

    private final ITipoIncidenciaRepository repository;

    public TipoIncidenciaService(ITipoIncidenciaRepository repository) {
        this.repository = repository;
    }

    public List<TipoIncidencia> listar() {
        return repository.findAll();
    }
}