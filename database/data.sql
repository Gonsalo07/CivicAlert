USE CivicAlert;

-- 1. Insertar Estados (El flujo lógico)
INSERT INTO estados (nombre_estado) VALUES 
('Reportado'), 
('En Revisión'), 
('En Proceso'), 
('Resuelto'), 
('Desestimado');

-- 2. Insertar Categorías
INSERT INTO categorias (nombre_categoria, descripcion) VALUES 
('Vialidad', 'Baches, semáforos dañados y señalética'),
('Alumbrado', 'Postes de luz sin funcionamiento o cables expuestos'),
('Seguridad', 'Zonas peligrosas o falta de vigilancia'),
('Limpieza', 'Acumulación de basura en vía pública o parques');

-- 3. Insertar Usuarios (Password de ejemplo: 'password123')
INSERT INTO usuarios (nombre_completo, email, password_hash, rol) VALUES 
('Admin Urbatento', 'admin@urbatento.com', '$2y$10$e0MYzXy...', 'admin'),
('Juan Pérez', 'juan.perez@email.com', '$2y$10$e0MYzXy...', 'ciudadano'),
('María García', 'm.garcia@email.com', '$2y$10$e0MYzXy...', 'ciudadano'),
('Carlos Moderador', 'carlos.mod@gob.com', '$2y$10$e0MYzXy...', 'moderador');

-- 4. Insertar Incidentes (Ubicaciones en coordenadas reales aproximadas)
INSERT INTO incidentes (titulo, descripcion, ubicacion_latitud, ubicacion_longitud, id_usuario, id_categoria, id_estado) VALUES 
('Bache profundo en Av. Principal', 'Hay un bache gigante que está dañando los neumáticos de los autos.', -12.046374, -77.042793, 2, 1, 1),
('Poste de luz parpadeante', 'El poste frente al parque central no enciende bien de noche.', -12.050000, -77.040000, 3, 2, 2),
('Basural acumulado', 'Gente de otros barrios arroja bolsas de basura en la esquina del mercado.', -12.043000, -77.045000, 2, 4, 3);

-- 5. Insertar Evidencias (Rutas ficticias a imágenes)
INSERT INTO evidencias (url_archivo, tipo_archivo, id_incidente) VALUES 
('uploads/bache1.jpg', 'image/jpeg', 1),
('uploads/poste_noche.png', 'image/png', 2),
('uploads/basura_esquina.jpg', 'image/jpeg', 3);

-- 6. Insertar Comentarios (Conversación)
INSERT INTO comentarios (contenido, id_incidente, id_usuario) VALUES 
('Yo pasé por ahí ayer y casi rompo mi suspensión. ¡Urge arreglo!', 1, 3),
('Hemos recibido el reporte, se enviará una cuadrilla mañana.', 1, 4),
('El camión de la basura no ha pasado en 3 días por aquí.', 3, 2);

-- 7. Insertar Votos (Relevancia social)
INSERT INTO votos (id_usuario, id_incidente) VALUES 
(2, 2), -- Juan vota por el poste de María
(3, 1), -- María vota por el bache de Juan
(4, 1); -- El moderador le da relevancia al bache

-- 8. Historial de Estados (Trazabilidad)
INSERT INTO historial_estados (id_incidente, id_estado_anterior, id_estado_nuevo, id_usuario_cambio) VALUES 
(1, NULL, 1, 2), -- Creación del reporte
(2, 1, 2, 4),    -- Moderador lo pasa a 'En Revisión'
(3, 2, 3, 4);    -- Moderador lo pasa a 'En Proceso'