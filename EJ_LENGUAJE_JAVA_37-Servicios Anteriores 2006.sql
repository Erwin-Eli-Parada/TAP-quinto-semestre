set search_path to manempsa;
set datestyle to sql,dmy;
select numero,fecha,tipo,cantidad
from Servicios
where Extract(Year from fecha)<2006;