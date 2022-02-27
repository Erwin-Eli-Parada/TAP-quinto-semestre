set search_path to manempsa;
select matricula,marca,modelo,Trabajadores.nombre,apellidos,Clientes.nombre,direccion,tipo,cantidad
from Coches natural join Trabajadores inner join Servicios on Trabajadores.DNI=Servicios.DNI inner join Clientes on Clientes.CIF=Servicios.CIF
where marca='CITROEN';