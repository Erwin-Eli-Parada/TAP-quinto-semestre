set search_path to manempsa;
select Servicios.fecha,cantidad,tipo,Trabajadores.DNI,Clientes.nombre,direccion
from Trabajadores inner join Servicios on Trabajadores.DNI=Servicios.DNI inner join Clientes on Servicios.CIF=Clientes.CIF
where direccion like 'C/Larga%';