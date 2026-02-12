CREATE DATABASE incidencias_comunitarias
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

USE incidencias_comunitarias;

-- CREACION TABLAS
CREATE TABLE roles (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL UNIQUE,
    descripcion VARCHAR(100),
    activo BOOLEAN NOT NULL DEFAULT TRUE
);

CREATE TABLE usuarios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    activo BOOLEAN NOT NULL DEFAULT TRUE,
    rol_id BIGINT NOT NULL,
    
    CONSTRAINT fk_usuario_rol
        FOREIGN KEY (rol_id)
        REFERENCES roles(id)
);

CREATE TABLE tipo_incidencias (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL UNIQUE,
    descripcion VARCHAR(150),
    activo BOOLEAN NOT NULL DEFAULT TRUE
);

CREATE TABLE estado_incidencias (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL UNIQUE,
    descripcion VARCHAR(150),
    activo BOOLEAN NOT NULL DEFAULT TRUE
);

CREATE TABLE incidencias (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    descripcion TEXT NOT NULL,
-- imagen_url VARCHAR(255) NULL,
    fecha DATETIME NOT NULL,
    usuario_id BIGINT NOT NULL,
    tipo_incidencia_id BIGINT NOT NULL,
    estado_incidencia_id BIGINT NOT NULL,
	FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
	FOREIGN KEY (tipo_incidencia_id) REFERENCES tipo_incidencias(id),
	FOREIGN KEY (estado_incidencia_id) REFERENCES estado_incidencias(id)
);

-- INSERCCIONES 

INSERT INTO roles (nombre, descripcion) VALUES
('ADMIN', 'Administrador del sistema'),
('USER', 'Usuario propietario');

INSERT INTO usuarios (username, password, rol_id) VALUES
('admin', 'admin123', 1),
('propietario1', 'user123', 2),
('propietario2', 'user123', 2);

INSERT INTO tipo_incidencias (nombre, descripcion) VALUES
('Corte de luz', 'Interrupción del servicio eléctrico'),
('Corte de agua', 'Interrupción del suministro de agua'),
('Fuga de gas', 'Posible fuga de gas en la zona'),
('Otro', 'Otro tipo de incidencia no clasificada');

INSERT INTO estado_incidencias (nombre, descripcion) VALUES
('PENDIENTE', 'Incidencia registrada y pendiente de atención'),
('EN_PROCESO', 'Incidencia en proceso de solución'),
('RESUELTA', 'Incidencia solucionada');

INSERT INTO incidencias (titulo, descripcion, fecha, usuario_id, tipo_incidencia_id, estado_incidencia_id) VALUES
('Corte de luz en bloque A', 'No hay suministro eléctrico desde la madrugada en el bloque A', NOW(), 2, 1, 1),
('Fuga de gas en cocina', 'Se percibe fuerte olor a gas en un departamento', NOW(), 3, 3, 2),
('Corte de agua general', 'No hay agua en toda la urbanización', NOW(), 2, 2, 1);

-- CIFRADO POR BCRYPT
UPDATE usuarios
SET password = '$2a$10$NG72XJUkTcjan7GGXUM8VuT1qYKis5Oyo7Yotl2p8jneAWD8cqfUC'
WHERE username = 'admin';
select * from usuarios
