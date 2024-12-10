INSERT INTO proveedor (id, nombre, contacto) VALUES
                                                 (1, 'Proveedor A', 'contacto@proveedora.com'),
                                                 (2, 'Proveedor B', 'contacto@proveedorb.com');

INSERT INTO estilo (id, nombre) VALUES
                                    (1, 'IPA'),
                                    (2, 'Stout');

INSERT INTO cerveza (id, nombre, precio, porcentaje_alcohol, proveedor_id, estilo_id) VALUES
                                                                                          (1, 'Cerveza 1', 120, 5.5, 1, 1),
                                                                                          (2, 'Cerveza 2', 150, 6.0, 1, 2),
                                                                                          (3, 'Cerveza 3', 100, 4.8, 2, 1);
