set search_path to manempsa;
select matricula,marca,modelo,nombre,apellidos
from Trabajadores natural join Coches
where marca='SEAT';