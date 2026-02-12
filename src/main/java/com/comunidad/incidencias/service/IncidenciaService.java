<<<<<<< HEAD
package com.comunidad.incidencias.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.comunidad.incidencias.model.Incidencia;
import com.comunidad.incidencias.repository.IIncidenciaRepository;

@Service
public class IncidenciaService {

    private final IIncidenciaRepository incidenciaRepository;

    public IncidenciaService(IIncidenciaRepository incidenciaRepository) {
        this.incidenciaRepository = incidenciaRepository;
    }

    public List<Incidencia> listar() {
        return incidenciaRepository.findAll();
    }

    public Optional<Incidencia> buscarPorId(Long id) {
        return incidenciaRepository.findById(id);
    }

    public Incidencia guardar(Incidencia incidencia) {
        return incidenciaRepository.save(incidencia);
    }

    public void eliminar(Long id) {
        incidenciaRepository.deleteById(id);
    }
=======
package com.comunidad.incidencias.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.comunidad.incidencias.model.Incidencia;
import com.comunidad.incidencias.repository.IIncidenciaRepository;

@Service
public class IncidenciaService {

    private final IIncidenciaRepository incidenciaRepository;

    public IncidenciaService(IIncidenciaRepository incidenciaRepository) {
        this.incidenciaRepository = incidenciaRepository;
    }

    public List<Incidencia> listar() {
        return incidenciaRepository.findAll();
    }

    public Optional<Incidencia> buscarPorId(Long id) {
        return incidenciaRepository.findById(id);
    }

    public Incidencia guardar(Incidencia incidencia) {
        return incidenciaRepository.save(incidencia);
    }

    public void eliminar(Long id) {
        incidenciaRepository.deleteById(id);
    }
>>>>>>> cdc34d35cb8e41a9fab0f2f6046c0caa73c7225c
}