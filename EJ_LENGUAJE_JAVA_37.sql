create schema MANEMPSA authorization postgres;
set search_path to manempsa;
set datestyle to sql,dmy;

create table Trabajadores(
DNI varchar(20) primary key,
nombre varchar(20),
apellidos varchar(20),
sueldo int,
fecha date,
matricula varchar(20)
);

create table Coches(
matricula varchar(20) primary key,
marca varchar(20),
modelo varchar(20),
anio int,
DNI varchar(20) references Trabajadores(DNI)
);

create table Clientes(
CIF varchar(20) primary key,
nombre varchar(20),
direccion varchar(20),
tfno1 bigint,
rfno2 bigint
);

create table Servicios(
numero int primary key,
fecha date,
tipo varchar(20),
cantidad int,
comentario varchar(20),
DNI varchar(20) references Trabajadores(DNI),
CIF varchar(20) references Clientes(CIF)
);

insert into Trabajadores values
('12.321.567-B','Juan','Perez',1120,'04-05-2002','4433-ABB'),
('21.123.123-A','Ana','Ruiz',1200,'02-03-2002','3322-ASR'),
('22.333.444-C','Francisco','Lopez',1000,'01-06-2006','1144-BBB');

insert into Coches values
('1144-BBB','CITROEN','C3',2005,'22.333.444-C'),
('3322-ASR','SEAT','Ibiza',2000,'21.123.123-A'),
('4433-ABB','CITROEN','Saxo',2001,'12.321.567-B');

insert into Clientes values
('B11223212','Seguros Segasa','C/Ancha 2',956344344,629234323),
('B22334466','Academia La Plata','C/La Plata 10',956302323,null),
('B33221111','Papeleria Cuatro','C/Larga 8',956305060,null),
('B44556666','Seguros Cruces','C/Lealas 5',956309020,633212342),
('B44557777','AcademiaPinturaLaVid','C/Cerezas 7',956101010,600121212),
('B55112233','Papeleria Boligrafo','Parque Atlantic',null,670787878),
('B55334433','Seguros La Paz','C/Larga 3',956202020,null);

insert into Servicios values
(1,'12-04-2004','Limpieza',300,null,'21.123.123-A','B11223212'),
(2,'22-05-2005','Fontaneria',238,'Arreglo tuberias','12.321.567-B','B22334466'),
(3,'21-12-2005','Electricidad',130,'Revision Cableado','21.123.123-A','B33221111'),
(4,'10-11-2006','Fontaneria',250,null,'12.321.567-B','B11223212'),
(5,'03-06-2006','Fontaneria',214,'Desatascos Servicio','21.123.123-A','B55112233'),
(6,'12-06-2006','Limpieza',265,'Limpieza cristales','22.333.444-C','B55334433'),
(7,'20-07-2006','Limpieza',170,null,'12.321.567-B','B44556666'),
(8,'01-08-2006','Electricidad',160,'Recambio paneles','22.333.444-C','B44557777'),
(9,'05-08-2006','Limpieza',250,'Limpieza fachada','12.321.567-B','B44556666'),
(10,'08-08-2006','Fontaneria',265,null,'12.321.567-B','B44557777'),
(11,'09-08-2006','Limpieza',139,'Limpieza cristales','22.333.444-C','B44556666');
