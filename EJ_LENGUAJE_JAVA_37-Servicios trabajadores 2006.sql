set search_path to manempsa;
select Servicios.fecha,cantidad,tipo,nombre,apellidos,Trabajadores.fecha as fecha_entrada
from Trabajadores inner join Servicios on Trabajadores.DNI=Servicios.DNI 
where Extract(year from Trabajadores.fecha)>=2006;