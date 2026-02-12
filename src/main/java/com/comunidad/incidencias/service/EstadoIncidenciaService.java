<<<<<<< HEAD
package com.comunidad.incidencias.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.comunidad.incidencias.model.EstadoIncidencia;
import com.comunidad.incidencias.repository.IEstadoIncidenciaRepository;

@Service
public class EstadoIncidenciaService {

    private final IEstadoIncidenciaRepository repository;

    public EstadoIncidenciaService(IEstadoIncidenciaRepository repository) {
        this.repository = repository;
    }

    public List<EstadoIncidencia> listar() {
        return repository.findAll();
    }
=======
package com.comunidad.incidencias.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.comunidad.incidencias.model.EstadoIncidencia;
import com.comunidad.incidencias.repository.IEstadoIncidenciaRepository;

@Service
public class EstadoIncidenciaService {

    private final IEstadoIncidenciaRepository repository;

    public EstadoIncidenciaService(IEstadoIncidenciaRepository repository) {
        this.repository = repository;
    }

    public List<EstadoIncidencia> listar() {
        return repository.findAll();
    }
>>>>>>> cdc34d35cb8e41a9fab0f2f6046c0caa73c7225c
}