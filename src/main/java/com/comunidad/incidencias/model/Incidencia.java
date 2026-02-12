package com.comunidad.incidencias.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "incidencias")
@Data
public class Incidencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String descripcion;
    
   /* @Column(name = "imagen_url")
    private String imagenUrl;*/

    @Column(nullable = false)
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "tipo_incidencia_id", nullable = false)
    private TipoIncidencia tipoIncidencia;

    @ManyToOne
    @JoinColumn(name = "estado_incidencia_id", nullable = false)
    private EstadoIncidencia estadoIncidencia;
}