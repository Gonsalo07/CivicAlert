<<<<<<< HEAD
package com.comunidad.incidencias.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comunidad.incidencias.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByUsername(String username);
=======
package com.comunidad.incidencias.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comunidad.incidencias.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByUsername(String username);
>>>>>>> cdc34d35cb8e41a9fab0f2f6046c0caa73c7225c
}