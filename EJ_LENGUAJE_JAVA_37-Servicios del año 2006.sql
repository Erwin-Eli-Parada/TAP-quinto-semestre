set search_path to manempsa;
select Servicios.fecha,cantidad,tipo,comentario,Trabajadores.apellidos,Clientes.nombre,Clientes.CIF
from Trabajadores inner join Servicios on Trabajadores.DNI=Servicios.DNI inner join Clientes on Servicios.CIF=Clientes.CIF
where Extract(year from Servicios.fecha)=2006;