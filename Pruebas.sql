//PRUEBA DE UNICIDAD: LLAVES PRIMARIAS REPETIDAS

//Inserción de una sucursal con PK única
INSERT INTO Sucursal (Id, Nombre, Tamaño, Direccion, telefono, Codigo_Ciudad) 
VALUES (111, 'Sucursal AFC', 100, 'Calle 81', '123456711', 1);

//Intentar insertar otra sucursal con la misma PK
INSERT INTO Sucursal (Id, Nombre, Tamaño, Direccion, telefono, Codigo_Ciudad) 
VALUES (111, 'Sucursal BEW', 150, 'Calle 2', '0987654321', 1); //Falla porque ya existe un registro en la tabla sucursal con PK 111


//PRUEBA DE INTEGRIDAD REFERENCIAL CON LLAVES FORÁNEAS

//Inserción de una ciudad en la tabla Ciudad
INSERT INTO Ciudad (Codigo, Nombre) VALUES (11, 'Cali');

//Inserción de una sucursal que referencia la ciudad existente
INSERT INTO Sucursal (Id, Nombre, Tamaño, Direccion, telefono, Codigo_Ciudad) 
VALUES (222, 'Sucursal B', 150, 'Calle 2', '0987654321', 11); //Funciona porque la ciudad con código 11 existe dentro de la tabla Ciudad

//Intentar insertar una sucursal que referencia una ciudad que no existe
INSERT INTO Sucursal (Id, Nombre, Tamaño, Direccion, telefono, Codigo_Ciudad) 
VALUES (333, 'Sucursal C', 200, 'Calle 3', '1122334455', 9990); //Falla porque la ciudad con código 999 no existe dentro de la tabla Ciudad

//PRUEBA DE INTEGRIDAD DE ACUERDO CON CON RESTRICCIONES DE CHEQUEO

//Intentar insertar un producto perecedero con un código de barras duplicado
INSERT INTO Producto (CodigoBarras, Nombre, PrecioUnitarioVenta, Presentacion, CantidadPresentacion, UnidadMedida, FechaExpiracion, Codigo_Categoria, Id_EspecificacionEmpacado) 
VALUES (101, 'Pestañina', 25.00, 'Unidad', 1, 'unid', NULL, 1, 1);

INSERT INTO ProductoPerecedero (CodigoBarras_Producto, fechaVencimiento) 
VALUES (101, TO_DATE('2024-12-31', 'YYYY-MM-DD'));

//Intentar insertar otro producto perecedero con el mismo código de barras
INSERT INTO ProductoPerecedero (CodigoBarras_Producto, fechaVencimiento) 
VALUES (101, TO_DATE('2025-01-01', 'YYYY-MM-DD')); //Falla porque ya existe un producto perecedero con en código de barras 101

//PRUEBAS DE FUNCIONALIDAD DE LA APP: BÚSQUEDA DE PRODUCTOS

//Inserción de varios productos
INSERT INTO Producto (CodigoBarras, Nombre, PrecioUnitarioVenta, Presentacion, CantidadPresentacion, UnidadMedida) 
VALUES (191, 'Gancho', 15.00, 'Unidad', 1, 'unid');

INSERT INTO Producto (CodigoBarras, Nombre, PrecioUnitarioVenta, Presentacion, CantidadPresentacion, UnidadMedida) 
VALUES (192, 'Tablero', 500.00, 'Unidad', 1, 'unid');

//Búsqueda por nombre de producto
SELECT * 
FROM Producto 
WHERE Nombre LIKE '%Gancho%'; //Devuelve la información del producto 'Gancho'

//PRUEBAS DE FUNCIONALIDAD DE LA APP: ROLES DE USUARIO

//Intentar agregar un nuevo producto
INSERT INTO Producto (CodigoBarras, Nombre, PrecioUnitarioVenta, Presentacion, CantidadPresentacion, UnidadMedida) 
VALUES (1033, 'Almohada', 300.00, 'Unidad', 1, 'unid'); //Se inserta de manera exitosa dentro de la tabla Producto

//CASOS EXITOSOS Y DE FALLA

//Inserción de un nuevo producto correctamente
INSERT INTO Producto (CodigoBarras, Nombre, PrecioUnitarioVenta, Presentacion, CantidadPresentacion, UnidadMedida) 
VALUES (1044, 'Marcador', 20.00, 'Unidad', 1, 'unid'); //Se inserta exitosamente el producto "Marcador" en la tabla Producto

//Actualización de un producto existente
UPDATE Producto 
SET PrecioUnitarioVenta = 22.00 
WHERE CodigoBarras = 1044; //Actualiza exitosamente el precio del marcador dentro de la tabla Producto

//Eliminación de un producto
DELETE FROM Producto 
WHERE CodigoBarras = 1044; //Elimina exitosamente el marcador de la tabla Producto

//Intentar eliminar un producto que no existe
DELETE FROM Producto 
WHERE CodigoBarras = 9999; //Falla porque no existe ningún producto con el código 9999

//Intentar actualizar un producto que no existe
UPDATE Producto 
SET PrecioUnitarioVenta = 30.00
WHERE CodigoBarras = 9999; //Falla porque no existe el producto con código de barras 9999, por lo tanto no se puede acualizar la info de este






