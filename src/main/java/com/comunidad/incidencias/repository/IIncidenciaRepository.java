<<<<<<< HEAD
package com.comunidad.incidencias.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comunidad.incidencias.model.Incidencia;
import com.comunidad.incidencias.model.Usuario;

public interface IIncidenciaRepository extends JpaRepository<Incidencia, Long> {

    List<Incidencia> findByUsuario(Usuario usuario);
}
=======
package com.comunidad.incidencias.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comunidad.incidencias.model.Incidencia;
import com.comunidad.incidencias.model.Usuario;

public interface IIncidenciaRepository extends JpaRepository<Incidencia, Long> {

    List<Incidencia> findByUsuario(Usuario usuario);
}
>>>>>>> cdc34d35cb8e41a9fab0f2f6046c0caa73c7225c
