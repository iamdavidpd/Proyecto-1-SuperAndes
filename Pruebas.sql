
Error que empieza en la línea: 4 del comando :
INSERT INTO Sucursal (Id, Nombre, Tamaño, Direccion, telefono, Codigo_Ciudad) 
VALUES (111, 'Sucursal AFC', 100, 'Calle 81', '123456711', 1)
Informe de error -
ORA-00001: restricción única (ISIS2304A16202420.SYS_C001282984) violada


Error que empieza en la línea: 8 del comando :
INSERT INTO Sucursal (Id, Nombre, Tamaño, Direccion, telefono, Codigo_Ciudad) 
VALUES (111, 'Sucursal BEW', 150, 'Calle 2', '0987654321', 1)
Informe de error -
ORA-00001: restricción única (ISIS2304A16202420.SYS_C001282984) violada


Error que empieza en la línea: 15 del comando :
INSERT INTO Ciudad (Codigo, Nombre) VALUES (11, 'Cali')
Informe de error -
ORA-00001: restricción única (ISIS2304A16202420.SYS_C001308696) violada


Error que empieza en la línea: 18 del comando :
INSERT INTO Sucursal (Id, Nombre, Tamaño, Direccion, telefono, Codigo_Ciudad) 
VALUES (222, 'Sucursal B', 150, 'Calle 2', '0987654321', 11)
Informe de error -
ORA-00001: restricción única (ISIS2304A16202420.SYS_C001282986) violada


Error que empieza en la línea: 22 del comando :
INSERT INTO Sucursal (Id, Nombre, Tamaño, Direccion, telefono, Codigo_Ciudad) 
VALUES (333, 'Sucursal C', 200, 'Calle 3', '1122334455', 999)
Informe de error -
ORA-00001: restricción única (ISIS2304A16202420.SYS_C001282986) violada


Error que empieza en la línea: 28 del comando :
INSERT INTO ProductoPerecedero (CodigoBarras_Producto, fechaVencimiento) 
VALUES (101, TO_DATE('2024-12-31', 'YYYY-MM-DD'))
Informe de error -
ORA-02291: restricción de integridad (ISIS2304A16202420.FK_P_CODIGOBARRAS_PRODUCTO) violada - clave principal no encontrada


Error que empieza en la línea: 32 del comando :
INSERT INTO ProductoPerecedero (CodigoBarras_Producto, fechaVencimiento) 
VALUES (101, TO_DATE('2025-01-01', 'YYYY-MM-DD'))
Informe de error -
ORA-02291: restricción de integridad (ISIS2304A16202420.FK_P_CODIGOBARRAS_PRODUCTO) violada - clave principal no encontrada


Error que empieza en la línea: 38 del comando :
INSERT INTO Producto (CodigoBarras, Nombre, PrecioUnitarioVenta, Presentacion, CantidadPresentacion, UnidadMedida) 
VALUES (191, 'Gancho', 15.00, 'Unidad', 1, 'unid')
Informe de error -
ORA-00001: restricción única (ISIS2304A16202420.SYS_C001283135) violada


Error que empieza en la línea: 41 del comando :
INSERT INTO Producto (CodigoBarras, Nombre, PrecioUnitarioVenta, Presentacion, CantidadPresentacion, UnidadMedida) 
VALUES (192, 'Tablero', 500.00, 'Unidad', 1, 'unid')
Informe de error -
ORA-00001: restricción única (ISIS2304A16202420.SYS_C001283135) violada


CODIGOBARRAS NOMBRE                                             PRECIOUNITARIOVENTA PRESENTACION                                                                                         CANTIDADPRESENTACION UNIDA FECHAEXP CODIGO_CATEGORIA ID_ESPECIFICACIONEMPACADO
------------ -------------------------------------------------- ------------------- ---------------------------------------------------------------------------------------------------- -------------------- ----- -------- ---------------- -------------------------
         191 Gancho                                                              15 Unidad                                                                                                                  1 unid                                                     


Error que empieza en la línea: 52 del comando :
INSERT INTO Producto (CodigoBarras, Nombre, PrecioUnitarioVenta, Presentacion, CantidadPresentacion, UnidadMedida) 
VALUES (1033, 'Almohada', 300.00, 'Unidad', 1, 'unid')
Informe de error -
ORA-00001: restricción única (ISIS2304A16202420.SYS_C001283135) violada


1 fila insertadas.


1 fila actualizadas.


1 fila eliminado


0 filas eliminado


0 filas actualizadas.


Error que empieza en la línea: 4 del comando :
INSERT INTO Sucursal (Id, Nombre, Tamaño, Direccion, telefono, Codigo_Ciudad) 
VALUES (111, 'Sucursal AFC', 100, 'Calle 81', '123456711', 1)
Informe de error -
ORA-00001: restricción única (ISIS2304A16202420.SYS_C001282984) violada


Error que empieza en la línea: 8 del comando :
INSERT INTO Sucursal (Id, Nombre, Tamaño, Direccion, telefono, Codigo_Ciudad) 
VALUES (111, 'Sucursal BEW', 150, 'Calle 2', '0987654321', 1)
Informe de error -
ORA-00001: restricción única (ISIS2304A16202420.SYS_C001282984) violada


Error que empieza en la línea: 15 del comando :
INSERT INTO Ciudad (Codigo, Nombre) VALUES (11, 'Cali')
Informe de error -
ORA-00001: restricción única (ISIS2304A16202420.SYS_C001308696) violada


Error que empieza en la línea: 18 del comando :
INSERT INTO Sucursal (Id, Nombre, Tamaño, Direccion, telefono, Codigo_Ciudad) 
VALUES (222, 'Sucursal B', 150, 'Calle 2', '0987654321', 11)
Informe de error -
ORA-00001: restricción única (ISIS2304A16202420.SYS_C001282986) violada


Error que empieza en la línea: 22 del comando :
INSERT INTO Sucursal (Id, Nombre, Tamaño, Direccion, telefono, Codigo_Ciudad) 
VALUES (333, 'Sucursal C', 200, 'Calle 3', '1122334455', 9990)
Informe de error -
ORA-00001: restricción única (ISIS2304A16202420.SYS_C001282986) violada


1 fila insertadas.


1 fila insertadas.


Error que empieza en la línea: 35 del comando :
INSERT INTO ProductoPerecedero (CodigoBarras_Producto, fechaVencimiento) 
VALUES (101, TO_DATE('2025-01-01', 'YYYY-MM-DD'))
Informe de error -
ORA-00001: restricción única (ISIS2304A16202420.SYS_C001309297) violada


Error que empieza en la línea: 41 del comando :
INSERT INTO Producto (CodigoBarras, Nombre, PrecioUnitarioVenta, Presentacion, CantidadPresentacion, UnidadMedida) 
VALUES (191, 'Gancho', 15.00, 'Unidad', 1, 'unid')
Informe de error -
ORA-00001: restricción única (ISIS2304A16202420.SYS_C001283135) violada


Error que empieza en la línea: 44 del comando :
INSERT INTO Producto (CodigoBarras, Nombre, PrecioUnitarioVenta, Presentacion, CantidadPresentacion, UnidadMedida) 
VALUES (192, 'Tablero', 500.00, 'Unidad', 1, 'unid')
Informe de error -
ORA-00001: restricción única (ISIS2304A16202420.SYS_C001283135) violada


CODIGOBARRAS NOMBRE                                             PRECIOUNITARIOVENTA PRESENTACION                                                                                         CANTIDADPRESENTACION UNIDA FECHAEXP CODIGO_CATEGORIA ID_ESPECIFICACIONEMPACADO
------------ -------------------------------------------------- ------------------- ---------------------------------------------------------------------------------------------------- -------------------- ----- -------- ---------------- -------------------------
         191 Gancho                                                              15 Unidad                                                                                                                  1 unid                                                     


Error que empieza en la línea: 55 del comando :
INSERT INTO Producto (CodigoBarras, Nombre, PrecioUnitarioVenta, Presentacion, CantidadPresentacion, UnidadMedida) 
VALUES (1033, 'Almohada', 300.00, 'Unidad', 1, 'unid')
Informe de error -
ORA-00001: restricción única (ISIS2304A16202420.SYS_C001283135) violada


1 fila insertadas.


1 fila actualizadas.


1 fila eliminado


0 filas eliminado


0 filas actualizadas.

