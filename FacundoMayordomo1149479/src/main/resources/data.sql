INSERT INTO ESTILO(ID,NOMBRE)
VALUES(1,'Estilo 1'),(2,'Estilo 2'),(3,'Estilo 3'),(4,'Estilo 4');

INSERT INTO PROVEEDOR(ID,NOMBRE,CONTACTO)
VALUES(1,'Prov1','correo@correo.com'),(2,'Prov2','correo@correo.com'),(3,'Prov3','correo@correo.com'),(4,'Prov4','correo@correo.com');

INSERT INTO CERVEZA(ID,NOMBRE,PRECIO,PORCENTAJE_ALCOHOL,ESTILO_ID,PROVEEDOR_ID)
VALUES(1,'Cerveza1',1000,0.05,1,1),(2,'Cerveza2',2000,0.1,1,2);