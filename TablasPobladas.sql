INSERT INTO Bodega (Id, Nombre, Tamaño, Id_Sucursal) VALUES (1, 'Bodega Central', 500, 1);
INSERT INTO Bodega (Id, Nombre, Tamaño, Id_Sucursal) VALUES (2, 'Bodega Norte', 300, 2);
INSERT INTO Bodega (Id, Nombre, Tamaño, Id_Sucursal) VALUES (3, 'Bodega Sur', 400, 3);
INSERT INTO Bodega (Id, Nombre, Tamaño, Id_Sucursal) VALUES (4, 'Bodega Este', 600, 4);
INSERT INTO Bodega (Id, Nombre, Tamaño, Id_Sucursal) VALUES (5, 'Bodega Oeste', 700, 5);

INSERT INTO Categoria (Codigo, Nombre, Descripcion, CaracteristicasAlmacenamiento) VALUES (1, 'Alimentos', 'Productos comestibles y perecederos', 'Almacenar en lugar fresco y seco');
INSERT INTO Categoria (Codigo, Nombre, Descripcion, CaracteristicasAlmacenamiento) VALUES (2, 'Ropa', 'Prendas de vestir para diferentes climas', 'Almacenar en lugar seco y ventilado');
INSERT INTO Categoria (Codigo, Nombre, Descripcion, CaracteristicasAlmacenamiento) VALUES (3, 'Electrónica', 'Dispositivos electrónicos y electrodomésticos', 'Almacenar en lugar seco, evitar humedad');
INSERT INTO Categoria (Codigo, Nombre, Descripcion, CaracteristicasAlmacenamiento) VALUES (4, 'Muebles', 'Artículos para el hogar y oficina', 'Almacenar en lugar seco, evitar golpes');
INSERT INTO Categoria (Codigo, Nombre, Descripcion, CaracteristicasAlmacenamiento) VALUES (5, 'Juguetes', 'Artículos de entretenimiento para niños', 'Almacenar en lugar seco, evitar exposición al sol');

INSERT INTO DetalleCostoBodega (Id, CostoUnitarioBodega, CantidadExistencias) VALUES (1, 100.00, 50);
INSERT INTO DetalleCostoBodega (Id, CostoUnitarioBodega, CantidadExistencias) VALUES (2, 150.50, 100);
INSERT INTO DetalleCostoBodega (Id, CostoUnitarioBodega, CantidadExistencias) VALUES (3, 200.75, 75);
INSERT INTO DetalleCostoBodega (Id, CostoUnitarioBodega, CantidadExistencias) VALUES (4, 250.00, 30);
INSERT INTO DetalleCostoBodega (Id, CostoUnitarioBodega, CantidadExistencias) VALUES (5, 300.25, 20);

INSERT INTO EspecificacionEmpacado (Id, Volumen_cm3, CantidadExistencias) VALUES (1, 1000, 200);
INSERT INTO EspecificacionEmpacado (Id, Volumen_cm3, CantidadExistencias) VALUES (2, 1500, 150);
INSERT INTO EspecificacionEmpacado (Id, Volumen_cm3, CantidadExistencias) VALUES (3, 2000, 100);
INSERT INTO EspecificacionEmpacado (Id, Volumen_cm3, CantidadExistencias) VALUES (4, 2500, 50);
INSERT INTO EspecificacionEmpacado (Id, Volumen_cm3, CantidadExistencias) VALUES (5, 3000, 25);

INSERT INTO InfoExtraBodega (CodigoBarras_Producto, Id_Bodega, TotalExistencia, CostoPromedio, CapacidadAlmacenamiento, NivelMinimoReOrden, Id_detalleCostoBodega) VALUES (1001, 1, 150, 1.30, 500, 50, 1);
INSERT INTO InfoExtraBodega (CodigoBarras_Producto, Id_Bodega, TotalExistencia, CostoPromedio, CapacidadAlmacenamiento, NivelMinimoReOrden, Id_detalleCostoBodega) VALUES (1002, 2, 100, 14.50, 300, 30, 2);
INSERT INTO InfoExtraBodega (CodigoBarras_Producto, Id_Bodega, TotalExistencia, CostoPromedio, CapacidadAlmacenamiento, NivelMinimoReOrden, Id_detalleCostoBodega) VALUES (1003, 3, 75, 490.00, 400, 20, 3);
INSERT INTO InfoExtraBodega (CodigoBarras_Producto, Id_Bodega, TotalExistencia, CostoPromedio, CapacidadAlmacenamiento, NivelMinimoReOrden, Id_detalleCostoBodega) VALUES (1004, 4, 30, 280.00, 600, 10, 4);
INSERT INTO InfoExtraBodega (CodigoBarras_Producto, Id_Bodega, TotalExistencia, CostoPromedio, CapacidadAlmacenamiento, NivelMinimoReOrden, Id_detalleCostoBodega) VALUES (1005, 5, 20, 17.00, 700, 5, 5);

INSERT INTO InfoExtraOrden (CodigoBarras_Producto, Id_OrdenCompra, Cantidad, CostoUnitarioCompra) VALUES (1001, 1, 10, 1.20);
INSERT INTO InfoExtraOrden (CodigoBarras_Producto, Id_OrdenCompra, Cantidad, CostoUnitarioCompra) VALUES (1002, 2, 5, 14.00);
INSERT INTO InfoExtraOrden (CodigoBarras_Producto, Id_OrdenCompra, Cantidad, CostoUnitarioCompra) VALUES (1003, 3, 2, 480.00);
INSERT INTO InfoExtraOrden (CodigoBarras_Producto, Id_OrdenCompra, Cantidad, CostoUnitarioCompra) VALUES (1004, 4, 1, 290.00);
INSERT INTO InfoExtraOrden (CodigoBarras_Producto, Id_OrdenCompra, Cantidad, CostoUnitarioCompra) VALUES (1005, 5, 3, 18.00);

INSERT INTO InfoExtraProveedor (Nit_Proveedor, Id_OrdenCompra) VALUES ('12345678901', 1);
INSERT INTO InfoExtraProveedor (Nit_Proveedor, Id_OrdenCompra) VALUES ('23456789012', 2);
INSERT INTO InfoExtraProveedor (Nit_Proveedor, Id_OrdenCompra) VALUES ('34567890123', 3);
INSERT INTO InfoExtraProveedor (Nit_Proveedor, Id_OrdenCompra) VALUES ('45678901234', 4);
INSERT INTO InfoExtraProveedor (Nit_Proveedor, Id_OrdenCompra) VALUES ('56789012345', 5);

INSERT INTO InfoExtraVenta (Id_Venta, CodigoBarras_Producto, Cantidad, PrecioUnitario) VALUES (1, 1001, 5, 1.50);
INSERT INTO InfoExtraVenta (Id_Venta, CodigoBarras_Producto, Cantidad, PrecioUnitario) VALUES (2, 1002, 2, 15.00);
INSERT INTO InfoExtraVenta (Id_Venta, CodigoBarras_Producto, Cantidad, PrecioUnitario) VALUES (3, 1003, 1, 500.00);
INSERT INTO InfoExtraVenta (Id_Venta, CodigoBarras_Producto, Cantidad, PrecioUnitario) VALUES (4, 1004, 1, 300.00);
INSERT INTO InfoExtraVenta (Id_Venta, CodigoBarras_Producto, Cantidad, PrecioUnitario) VALUES (5, 1005, 3, 20.00);

INSERT INTO OrdenCompra (Id, FechaCreacion, Estado, FechaEntrega, Nit_Proveedor, Id_Sucursal) VALUES (1, TO_DATE('2024-01-01', 'YYYY-MM-DD'), 'vigente', TO_DATE('2024-01-15', 'YYYY-MM-DD'), '12345678901', 1);
INSERT INTO OrdenCompra (Id, FechaCreacion, Estado, FechaEntrega, Nit_Proveedor, Id_Sucursal) VALUES (2, TO_DATE('2024-01-02', 'YYYY-MM-DD'), 'vigente', TO_DATE('2024-01-16', 'YYYY-MM-DD'), '23456789012', 2);
INSERT INTO OrdenCompra (Id, FechaCreacion, Estado, FechaEntrega, Nit_Proveedor, Id_Sucursal) VALUES (3, TO_DATE('2024-01-03', 'YYYY-MM-DD'), 'vigente', TO_DATE('2024-01-17', 'YYYY-MM-DD'), '34567890123', 3);
INSERT INTO OrdenCompra (Id, FechaCreacion, Estado, FechaEntrega, Nit_Proveedor, Id_Sucursal) VALUES (4, TO_DATE('2024-01-04', 'YYYY-MM-DD'), 'vigente', TO_DATE('2024-01-18', 'YYYY-MM-DD'), '45678901234', 4);
INSERT INTO OrdenCompra (Id, FechaCreacion, Estado, FechaEntrega, Nit_Proveedor, Id_Sucursal) VALUES (5, TO_DATE('2024-01-05', 'YYYY-MM-DD'), 'vigente', TO_DATE('2024-01-19', 'YYYY-MM-DD'), '56789012345', 5);

INSERT INTO Producto (CodigoBarras, Nombre, PrecioUnitarioVenta, Presentacion, CantidadPresentacion, UnidadMedida, FechaExpiracion, Codigo_Categoria, Id_EspecificacionEmpacado) VALUES (1001, 'Manzana', 1.50, 'Bolsa de 1 kg', 1, 'kg', TO_DATE('2024-12-31', 'YYYY-MM-DD'), 1, 1);
INSERT INTO Producto (CodigoBarras, Nombre, PrecioUnitarioVenta, Presentacion, CantidadPresentacion, UnidadMedida, FechaExpiracion, Codigo_Categoria, Id_EspecificacionEmpacado) VALUES (1002, 'Camiseta', 15.00, 'Unidad', 1, 'unidad', NULL, 2, 2);
INSERT INTO Producto (CodigoBarras, Nombre, PrecioUnitarioVenta, Presentacion, CantidadPresentacion, UnidadMedida, FechaExpiracion, Codigo_Categoria, Id_EspecificacionEmpacado) VALUES (1003, 'Televisor', 500.00, 'Unidad', 1, 'unidad', NULL, 3, 3);
INSERT INTO Producto (CodigoBarras, Nombre, PrecioUnitarioVenta, Presentacion, CantidadPresentacion, UnidadMedida, FechaExpiracion, Codigo_Categoria, Id_EspecificacionEmpacado) VALUES (1004, 'Sofá', 300.00, 'Unidad', 1, 'unidad', NULL, 4, 4);
INSERT INTO Producto (CodigoBarras, Nombre, PrecioUnitarioVenta, Presentacion, CantidadPresentacion, UnidadMedida, FechaExpiracion, Codigo_Categoria, Id_EspecificacionEmpacado) VALUES (1005, 'Muñeca', 20.00, 'Unidad', 1, 'unidad', NULL, 5, 5);

INSERT INTO ProductoPerecedero (CodigoBarras_Producto, fechaVencimiento) VALUES (1001, TO_DATE('2024-12-31', 'YYYY-MM-DD'));
INSERT INTO ProductoPerecedero (CodigoBarras_Producto, fechaVencimiento) VALUES (1002, TO_DATE('2024-11-30', 'YYYY-MM-DD'));
INSERT INTO ProductoPerecedero (CodigoBarras_Producto, fechaVencimiento) VALUES (1003, TO_DATE('2024-10-15', 'YYYY-MM-DD'));
INSERT INTO ProductoPerecedero (CodigoBarras_Producto, fechaVencimiento) VALUES (1004, TO_DATE('2024-09-01', 'YYYY-MM-DD'));
INSERT INTO ProductoPerecedero (CodigoBarras_Producto, fechaVencimiento) VALUES (1005, TO_DATE('2024-08-20', 'YYYY-MM-DD'));

INSERT INTO Proveedor (Nit, Nombre, Direccion, NombreContacto, TelefonoContacto) VALUES ('12345678901', 'Proveedor A', 'Calle Proveedor A', 'Juan Pérez', '3001112233');
INSERT INTO Proveedor (Nit, Nombre, Direccion, NombreContacto, TelefonoContacto) VALUES ('23456789012', 'Proveedor B', 'Calle Proveedor B', 'Ana Gómez', '3002223344');
INSERT INTO Proveedor (Nit, Nombre, Direccion, NombreContacto, TelefonoContacto) VALUES ('34567890123', 'Proveedor C', 'Calle Proveedor C', 'Luis Martínez', '3003334455');
INSERT INTO Proveedor (Nit, Nombre, Direccion, NombreContacto, TelefonoContacto) VALUES ('45678901234', 'Proveedor D', 'Calle Proveedor D', 'Sofía López', '3004445566');
INSERT INTO Proveedor (Nit, Nombre, Direccion, NombreContacto, TelefonoContacto) VALUES ('56789012345', 'Proveedor E', 'Calle Proveedor E', 'Carlos Sánchez', '3005556677');

INSERT INTO RecepcionProductos (Id, fechaRecepcion, Id_Bodega, Id_OrdenCompra) VALUES (1, TO_DATE('2024-01-10', 'YYYY-MM-DD'), 1, 1);
INSERT INTO RecepcionProductos (Id, fechaRecepcion, Id_Bodega, Id_OrdenCompra) VALUES (2, TO_DATE('2024-01-11', 'YYYY-MM-DD'), 2, 2);
INSERT INTO RecepcionProductos (Id, fechaRecepcion, Id_Bodega, Id_OrdenCompra) VALUES (3, TO_DATE('2024-01-12', 'YYYY-MM-DD'), 3, 3);
INSERT INTO RecepcionProductos (Id, fechaRecepcion, Id_Bodega, Id_OrdenCompra) VALUES (4, TO_DATE('2024-01-13', 'YYYY-MM-DD'), 4, 4);
INSERT INTO RecepcionProductos (Id, fechaRecepcion, Id_Bodega, Id_OrdenCompra) VALUES (5, TO_DATE('2024-01-14', 'YYYY-MM-DD'), 5, 5);

INSERT INTO Sucursal (Id, Nombre, Tamaño, Direccion, telefono, Codigo_Ciudad) VALUES (1, 'Sucursal Central', 500, 'Calle 1', '3001234567', 1);
INSERT INTO Sucursal (Id, Nombre, Tamaño, Direccion, telefono, Codigo_Ciudad) VALUES (2, 'Sucursal Norte', 300, 'Calle 2', '3002345678', 2);
INSERT INTO Sucursal (Id, Nombre, Tamaño, Direccion, telefono, Codigo_Ciudad) VALUES (3, 'Sucursal Sur', 400, 'Calle 3', '3003456789', 3);
INSERT INTO Sucursal (Id, Nombre, Tamaño, Direccion, telefono, Codigo_Ciudad) VALUES (4, 'Sucursal Este', 600, 'Calle 4', '3004567890', 4);
INSERT INTO Sucursal (Id, Nombre, Tamaño, Direccion, telefono, Codigo_Ciudad) VALUES (5, 'Sucursal Oeste', 700, 'Calle 5', '3005678901', 5);

INSERT INTO Venta (Id, Fecha, Id_Sucursal, Cedula_Cliente) VALUES (1, TO_DATE('2024-01-15', 'YYYY-MM-DD'), 1, '1234567890');
INSERT INTO Venta (Id, Fecha, Id_Sucursal, Cedula_Cliente) VALUES (2, TO_DATE('2024-01-16', 'YYYY-MM-DD'), 2, '0987654321');
INSERT INTO Venta (Id, Fecha, Id_Sucursal, Cedula_Cliente) VALUES (3, TO_DATE('2024-01-17', 'YYYY-MM-DD'), 3, '1122334455');
INSERT INTO Venta (Id, Fecha, Id_Sucursal, Cedula_Cliente) VALUES (4, TO_DATE('2024-01-18', 'YYYY-MM-DD'), 4, '2233445566');
INSERT INTO Venta (Id, Fecha, Id_Sucursal, Cedula_Cliente) VALUES (5, TO_DATE('2024-01-19', 'YYYY-MM-DD'), 5, '3344556677');
