CREATE TABLE Sucursal(
Id NUMBER PRIMARY KEY,
Nombre VARCHAR2(50) NOT NULL UNIQUE ,
Tamaño NUMBER NOT NULL ,
Direccion VARCHAR2(50) NOT NULL UNIQUE,
telefono VARCHAR2(10) NOT NULL UNIQUE,
Codigo_Ciudad NUMBER NOT NULL
);

CREATE TABLE Ciudad (
Codigo NUMBER PRIMARY KEY,
Nombre VARCHAR2(50) NOT NULL UNIQUE
);

CREATE TABLE Cliente(
Cedula VARCHAR2(10) PRIMARY KEY,
Nombre VARCHAR2(50) NOT NULL UNIQUE
);

CREATE TABLE ProductoPerecedero(
CodigoBarras_Producto NUMBER NOT NULL UNIQUE,
fechaVencimiento DATE NOT NULL
);

CREATE TABLE Venta(
Id NUMBER PRIMARY KEY ,
Fecha DATE NOT NULL,
Id_Sucursal NUMBER,
Cedula_Cliente VARCHAR2(10)
);

CREATE TABLE Bodega(
Id NUMBER PRIMARY KEY,
Nombre VARCHAR(50) NOT NULL UNIQUE,
Tamaño NUMBER NOT NULL,
Id_Sucursal NUMBER
);

CREATE TABLE RecepcionProductos(
Id NUMBER PRIMARY KEY,
fechaRecepcion DATE NOT NULL,
Id_Bodega NUMBER,
Id_OrdenCompra NUMBER
);

CREATE TABLE OrdenCompra(
Id NUMBER PRIMARY KEY,
FechaCreacion DATE NOT NULL,
Estado VARCHAR2(20) DEFAULT 'vigente',
FechaEntrega DATE NOT NULL,
Nit_Proveedor VARCHAR2(11),
Id_Sucursal NUMBER
);

CREATE TABLE Proveedor(
Nit VARCHAR2(11) PRIMARY KEY,
Nombre VARCHAR2(50) NOT NULL UNIQUE,
Direccion VARCHAR2(20) NOT NULL UNIQUE,
NombreContacto VARCHAR2(50) NOT NULL UNIQUE,
TelefonoContacto VARCHAR2(10) NOT NULL UNIQUE
);

CREATE TABLE Producto(
CodigoBarras NUMBER PRIMARY KEY,
Nombre VARCHAR2(50) NOT NULL UNIQUE,
PrecioUnitarioVenta NUMBER NOT NULL,
Presentacion VARCHAR2(100) NOT NULL,
CantidadPresentacion NUMBER NOT NULL,
UnidadMedida VARCHAR2(5) NOT NULL,
FechaExpiracion DATE,
Codigo_Categoria NUMBER,
Id_EspecificacionEmpacado NUMBER
);

CREATE TABLE EspecificacionEmpacado(
Id NUMBER PRIMARY KEY,
Volumen_cm3 NUMBER NOT NULL,
Peso_Gr NUMBER NOT NULL
);
CREATE TABLE InfoExtraOrden(
CodigoBarras_Producto NUMBER,
Id_OrdenCompra NUMBER,
Cantidad NUMBER NOT NULL,
CostoUnitarioCompra NUMBER NOT NULL
);
CREATE TABLE InfoExtraBodega(
CodigoBarras_Producto NUMBER, 
Id_Bodega NUMBER,
TotalExistencia NUMBER NOT NULL,
CostoPromedio NUMBER NOT NULL,
CapacidadAlmacenamiento NUMBER NOT NULL,
NivelMinimoReOrden NUMBER NOT NULL,
Id_detalleCostoBodega NUMBER
);

CREATE TABLE DetalleCostoBodega(
Id NUMBER PRIMARY KEY,
CostoUnitarioBodega NUMBER NOT NULL,
CantidadExistencias NUMBER NOT NULL
);

CREATE TABLE Categoria(
Codigo NUMBER PRIMARY KEY,
Nombre VARCHAR2(50) NOT NULL UNIQUE,
Descripcion VARCHAR2(100) NOT NULL,
CaracteristicasAlmacenamiento VARCHAR(200) NOT NULL
);
CREATE TABLE InfoExtraVenta(
CodigoBarras_Producto NUMBER,
Id_Venta NUMBER,
Cantidad NUMBER NOT NULL,
PrecioUnitarioVenta NUMBER NOT NULL
);
CREATE TABLE InfoExtraProveedor (
    Nit_Proveedor VARCHAR2(11), 
    CodigoBarras_Producto NUMBER,
    CONSTRAINT unique_proveedor_producto UNIQUE (Nit_Proveedor, CodigoBarras_Producto)
);
ALTER TABLE Sucursal 
ADD CONSTRAINT FK_codigo_ciudad 
FOREIGN KEY (Codigo_Ciudad) REFERENCES Ciudad(Codigo); 

ALTER TABLE ProductoPerecedero 
ADD CONSTRAINT FK_p_codigoBarras_producto 
FOREIGN KEY (CodigoBarras_Producto) REFERENCES Producto(CodigoBarras);  

ALTER TABLE Venta 
ADD CONSTRAINT FK_Id_Sucursal 
FOREIGN KEY (Id_Sucursal) REFERENCES Sucursal(Id); 

ALTER TABLE Venta 
ADD CONSTRAINT FK_Cedula_Cliente 
FOREIGN KEY (Cedula_Cliente) REFERENCES Cliente(Cedula); 

ALTER TABLE Bodega
ADD CONSTRAINT FK_Id_Sucursal  
FOREIGN KEY (Id_Sucursal) REFERENCES Sucursal(Id); 

ALTER TABLE RecepcionProductos 
ADD CONSTRAINT FK_Id_Bodega 
FOREIGN KEY (Id_Bodega) REFERENCES Bodega(Id); 

ALTER TABLE RecepcionProductos 
ADD CONSTRAINT FK_Id_OrdenCompra  
FOREIGN KEY (Id_OrdenCompra) REFERENCES OrdenCompra(Id); 

ALTER TABLE OrdenCompra 
ADD CONSTRAINT FK_Nit_Proveedor  
FOREIGN KEY (Nit_Proovedor) REFERENCES Proveedor (Nit); 

ALTER TABLE OrdenCompra 
ADD CONSTRAINT FK_OC_Id_Sucursal 
FOREIGN KEY (Id_Sucursal) REFERENCES Sucursal (Id); 

ALTER TABLE Producto 
ADD CONSTRAINT FK_Codigo_Categoria 
FOREIGN KEY (Codigo_Categoria) REFERENCES Categoria (Codigo); 

ALTER TABLE Producto 
ADD CONSTRAINT FK_Id_EspecificacionEmpacado 
FOREIGN KEY (Id_EspecificacionEmpacado) REFERENCES  EspecificacionEmpacado (Id); 
 
ALTER TABLE InfoExtraOrden 
ADD CONSTRAINT FK_CodigoBarras_Producto 
FOREIGN KEY (CodigoBarras_Producto) REFERENCES Producto (CodigoBarras); 

ALTER TABLE InfoExtraOrden 
ADD CONSTRAINT FK_IE_Id_OrdenCompra 
FOREIGN KEY (Id_OrdenCompra) REFERENCES OrdenCompra (Id); 

ALTER TABLE InfoExtraBodega 
ADD CONSTRAINT FK_IEB_codigoBarras_producto 
FOREIGN KEY (CodigoBarras_Producto) REFERENCES Producto(CodigoBarras); 

ALTER TABLE InfoExtraBodega 
ADD CONSTRAINT FK_IE_Id_Bodega 
FOREIGN KEY (Id_Bodega) REFERENCES Bodega(Id); 

ALTER TABLE InfoExtraBodega 
ADD CONSTRAINT FK_IE_Id_detalleCostoBodega 
FOREIGN KEY (Id_detalleCostoBodega) REFERENCES DetalleCostoBodega(Id); 

ALTER TABLE InfoExtraVenta 
ADD CONSTRAINT FK_IEV_codigoBarras_producto 
FOREIGN KEY (CodigoBarras_Producto) REFERENCES Producto(CodigoBarras); 

ALTER TABLE InfoExtraVenta 
ADD CONSTRAINT FK_Id_Venta 
FOREIGN KEY (Id_Venta) REFERENCES Venta(id); 

ALTER TABLE InfoExtraProveedor  
ADD CONSTRAINT FK_IE_Nit_Proveedor  
FOREIGN KEY (Nit_Proveedor) REFERENCES Proveedor (Nit); 

ALTER TABLE InfoExtraProveedor 
ADD CONSTRAINT FK_codigoBarras_producto 
FOREIGN KEY (CodigoBarras_Producto) REFERENCES Producto(CodigoBarras);