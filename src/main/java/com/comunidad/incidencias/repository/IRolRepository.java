<<<<<<< HEAD
package com.comunidad.incidencias.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comunidad.incidencias.model.Rol;

public interface IRolRepository extends JpaRepository<Rol, Long> {

    Optional<Rol> findByNombre(String nombre);
=======
package com.comunidad.incidencias.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comunidad.incidencias.model.Rol;

public interface IRolRepository extends JpaRepository<Rol, Long> {

    Optional<Rol> findByNombre(String nombre);
>>>>>>> cdc34d35cb8e41a9fab0f2f6046c0caa73c7225c
}