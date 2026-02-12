package com.comunidad.incidencias.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comunidad.incidencias.model.TipoIncidencia;

public interface ITipoIncidenciaRepository extends JpaRepository<TipoIncidencia, Long> {
}