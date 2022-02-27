set search_path to manempsa;
select Servicios.fecha,cantidad,tipo,comentario,Trabajadores.nombre,Trabajadores.apellidos,Clientes.nombre
from Trabajadores inner join Servicios on Trabajadores.DNI=Servicios.DNI inner join Clientes on Servicios.CIF=Clientes.CIF
where Trabajadores.DNI='12.321.567-B';