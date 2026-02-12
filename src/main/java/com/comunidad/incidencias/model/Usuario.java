<<<<<<< HEAD
package com.comunidad.incidencias.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usuarios")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    private Boolean activo;

    @ManyToOne
    @JoinColumn(name = "rol_id", nullable = false)
    private Rol rol;
=======
package com.comunidad.incidencias.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usuarios")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    private Boolean activo;

    @ManyToOne
    @JoinColumn(name = "rol_id", nullable = false)
    private Rol rol;
>>>>>>> cdc34d35cb8e41a9fab0f2f6046c0caa73c7225c
}