INSERT INTO proveedor (nombre, contacto) VALUES
                                                 ('Proveedor A', 'contacto@proveedora.com'),
                                                 ('Proveedor B', 'contacto@proveedorb.com');

INSERT INTO estilo (nombre) VALUES
                                    ('IPA'),
                                    ('Stout');

INSERT INTO cerveza (nombre, precio, porcentaje_alcohol, proveedor_id, estilo_id) VALUES
                                                                                          ('Cerveza 1', 120, 5.5, 1, 1),
                                                                                          ('Cerveza 2', 150, 6.0, 1, 2),
                                                                                          ('Cerveza 3', 100, 4.8, 2, 1);
