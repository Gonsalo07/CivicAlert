package com.comunidad.incidencias.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comunidad.incidencias.model.Rol;

public interface IRolRepository extends JpaRepository<Rol, Long> {

    Optional<Rol> findByNombre(String nombre);
}