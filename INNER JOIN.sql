SELECT c.codigo, c.fecha, p.codigo, p.nombre, c.entrada_kg, p.precio_compra, p.precio_venta,
c.total_compra, c.observaciones
FROM add_products p
INNER JOIN compras c
ON p.codigo = c.codigo;