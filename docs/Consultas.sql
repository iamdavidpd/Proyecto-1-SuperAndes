//CONSULTAS PUNTO 3

SELECT b.Nombre AS Bodega, (SUM(ieb.TotalExistencia * ee.volumen_m3) / b.tamaño) * 100 AS PorcentajeOcupacion
FROM Bodega b
INNER JOIN InfoExtraBodega ieb ON b.Id = ieb.Id_Bodega
INNER JOIN Producto p ON ieb.codigobarras_producto = p.codigobarras
INNER JOIN EspecificacionEmpacado ee ON p.Id_EspecificacionEmpacado = ee.Id
WHERE p.codigobarras IN X
AND b.Id_Sucursal = Y
GROUP BY b.Nombre;

//CONSULTAS PUNTO 4

SELECT s.nombre 
FROM Sucursal s

INNER JOIN Bodega b ON s.id= b.id_sucursal
INNER JOIN InfoExtraBodega ieb ON b.id = ieb.id_bodega
INNER JOIN Producto p ON ieb.codigobarras_producto = p.codigobarras
INNER JOIN DetalleCostoBodega dcb ON ieb.id_detallecostobodega = dcb.id
WHERE P.codigoBarras = 'X1' AND dcb.cantidadexistencias>0;

//CONSULTAS PUNTO 5

SELECT p.nombre AS nombreProducto, p.codigobarras, b.nombre AS bodega, s.nombre AS sucursal, pr.nombre AS proveedor, ieb.totalexistencia
FROM Producto p
INNER JOIN InfoExtraBodega ieb ON p.codigobarras = ieb.codigobarras_producto
INNER JOIN Bodega b ON ieb.id_bodega = b.id
INNER JOIN Sucursal s ON b.id_sucursal = s.id
INNER JOIN InfoExtraProveedor iep ON p.codigobarras = iep.codigobarras_producto
INNER JOIN Proveedor pr ON iep.nit_proveedor = pr.nit  
WHERE ieb.totalexistencia< ieb.nivelminimoreorden;

