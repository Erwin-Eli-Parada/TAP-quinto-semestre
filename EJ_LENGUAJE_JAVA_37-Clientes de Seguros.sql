set search_path to manempsa;
select CIF,nombre,direccion
from Clientes
where nombre like 'Seguros%';