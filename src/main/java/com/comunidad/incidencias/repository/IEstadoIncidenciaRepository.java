package com.comunidad.incidencias.repository;
import com.comunidad.incidencias.model.EstadoIncidencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstadoIncidenciaRepository extends JpaRepository<EstadoIncidencia, Long> {
}