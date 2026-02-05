-- 1. Usuarios: Gestión de perfiles y roles
CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre_completo VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    rol ENUM('ciudadano', 'moderador', 'admin') DEFAULT 'ciudadano',
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 2. Categorías: Tipos de incidentes (Baches, Alumbrado, Seguridad, etc.)
CREATE TABLE categorias (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nombre_categoria VARCHAR(50) NOT NULL,
    descripcion TEXT
);

-- 3. Estados: Flujo del incidente (Reportado, En Proceso, Resuelto, Desestimado)
CREATE TABLE estados (
    id_estado INT AUTO_INCREMENT PRIMARY KEY,
    nombre_estado VARCHAR(30) NOT NULL
);

-- 4. Incidentes: La entidad central
CREATE TABLE incidentes (
    id_incidente INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    descripcion TEXT NOT NULL,
    ubicacion_latitud DECIMAL(10, 8),
    ubicacion_longitud DECIMAL(11, 8),
    fecha_reporte TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    id_usuario INT,
    id_categoria INT,
    id_estado INT DEFAULT 1,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario),
    FOREIGN KEY (id_categoria) REFERENCES categorias(id_categoria),
    FOREIGN KEY (id_estado) REFERENCES estados(id_estado)
);

-- 5. Comentarios: Retroalimentación de la comunidad o autoridades
CREATE TABLE comentarios (
    id_comentario INT AUTO_INCREMENT PRIMARY KEY,
    contenido TEXT NOT NULL,
    fecha_comentario TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    id_incidente INT,
    id_usuario INT,
    FOREIGN KEY (id_incidente) REFERENCES incidentes(id_incidente) ON DELETE CASCADE,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);

-- 6. Evidencias: Fotos o archivos adjuntos del reporte
CREATE TABLE evidencias (
    id_evidencia INT AUTO_INCREMENT PRIMARY KEY,
    url_archivo VARCHAR(255) NOT NULL,
    tipo_archivo VARCHAR(20), -- image/jpeg, image/png
    id_incidente INT,
    FOREIGN KEY (id_incidente) REFERENCES incidentes(id_incidente) ON DELETE CASCADE
);

-- 7. Votos: Para priorizar incidentes por relevancia ciudadana
CREATE TABLE votos (
    id_usuario INT,
    id_incidente INT,
    PRIMARY KEY (id_usuario, id_incidente),
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario),
    FOREIGN KEY (id_incidente) REFERENCES incidentes(id_incidente)
);

-- 8. Historial_Estados: Para auditar quién y cuándo cambió el estado del reporte
CREATE TABLE historial_estados (
    id_historial INT AUTO_INCREMENT PRIMARY KEY,
    id_incidente INT,
    id_estado_anterior INT,
    id_estado_nuevo INT,
    fecha_cambio TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    id_usuario_cambio INT, -- El moderador que hizo el cambio
    FOREIGN KEY (id_incidente) REFERENCES incidentes(id_incidente),
    FOREIGN KEY (id_usuario_cambio) REFERENCES usuarios(id_usuario)
);