<<<<<<< HEAD
package com.comunidad.incidencias.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "estado_incidencias")
@Data
public class EstadoIncidencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombre;

    private String descripcion;

    private Boolean activo;
}
=======
package com.comunidad.incidencias.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "estado_incidencias")
@Data
public class EstadoIncidencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombre;

    private String descripcion;

    private Boolean activo;
}
>>>>>>> cdc34d35cb8e41a9fab0f2f6046c0caa73c7225c
