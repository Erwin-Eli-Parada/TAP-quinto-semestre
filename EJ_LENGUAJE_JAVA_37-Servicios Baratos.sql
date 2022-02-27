set search_path to manempsa;
select numero,tipo,cantidad,comentario
from Servicios
where cantidad<180;