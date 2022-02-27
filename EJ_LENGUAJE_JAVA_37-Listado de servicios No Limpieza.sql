set search_path to manempsa;
select numero,cantidad,tipo,comentario
from Servicios
where tipo='Fontaneria' or tipo='Electricidad';
