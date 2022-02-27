set search_path to manempsa;
select CIF,nombre,direccion,rfno2
from Clientes
where nombre like 'Academia%' or nombre like 'Papeleria%';