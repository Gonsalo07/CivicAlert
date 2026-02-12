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
