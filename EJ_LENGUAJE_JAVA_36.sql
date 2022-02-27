create schema CONTROLVEN authorization postgres;
set search_path to controlven;
set datestyle to sql,dmy;

create table Cliente(
CIF varchar(20) primary key,
nombre varchar(20),
ciudad varchar(25),
telefono int
);

create table Comercial(
id_comercial varchar(20) primary key,
nombre varchar(20),
apellido varchar(50),
movil int
);

create table Venta(
id_venta varchar(20) primary key,
unidades int,
nombre_producto varchar(20),
forma_pago varchar(20),
precio_p int,
fecha date,
cliente varchar(20) references Cliente(CIF),
comercial varchar(20) references Comercial(id_comercial)
);

insert into Cliente values
('A12345678','EjCompany','Oaxaca',95123841),
('B87654321','Pepe y asociados','Jalisco',96245233),
('F34543941','compañía en blanco','Veracruz',97274622);

insert into Comercial values 
('ppp343','pedro','perez perez',95347285),
('jmh231','juan','martinez hernandez',95337275),
('psa827','pablo','sosa alavez',97138527);

insert into Venta values
('Mi233',5,'misiles','cheque',40000,'24-08-2020','A12345678','ppp343'),
('Ru332',3,'ruedas','cheque',1500,'23-04-2020','B87654321','jmh231'),
('Mo456',10,'motores','efectivo',35000,'11-07-2020','F34543941','psa827');


create schema TRASPORTES authorization postgres;
set search_path to trasportes;
set datestyle to sql,dmy;

create table Camion(
modelo varchar(20),
marca varchar(20),
año_compra int,
matricula varchar(20) primary key
);

create table Conductor(
nombre varchar(20),
apellidos varchar(25),
movil int,
sueldo int,
id_conductor varchar(20) primary key
);

create table Cliente(
nombre varchar(20),
direccion varchar(20),
telefono int,
CIF varchar(20) primary key
);

create table Transporte(
peso int,
material varchar(20),
fecha date,
ciudad_origen varchar(20),
ciudad_destino varchar(20),
id_trasnporte varchar(20) primary key,
conductor varchar(20) references Conductor(id_conductor),
camion varchar(20) references Camion(matricula),
cliente varchar(20) references Cliente(CIF)
); 

insert into Camion values
('nisan','a-600',2010,'3685 HDF'),
('nisan','7-bcs',2014,'7286 HFU'),
('mustang','sdas-90',2015,'1456 JFT');

insert into Conductor values
('juan','martinez juarez',95123841,3000,'jmj800'),
('pedro','sanchez reyes',96245234,2600,'psr729'),
('pablo','perez hernandez',97274628,2800,'pph765');

insert into Cliente values
('EjCompany','av.universidad 800',95578841,'A12345678'),
('Pepe y asociados','calle vuelta 78',96262734,'B87654321'),
('compañía en blanco','calle salazar 08',97201828,'F34543941');

insert into Transporte values
(54,'plastico','12-08-2020','puebla','san luis potosi','p374','jmj800','3685 HDF','A12345678'),
(47,'hierro','17-05-2020','oaxaca de juarez','s.f. campeche','k937','psr729','7286 HFU','B87654321'),
(81,'papel','27-11-2020','guadalajara','Xicohténcatl','p373','pph765','1456 JFT','F34543941');


create schema MEDICIONES authorization postgres;
set search_path to mediciones;
set datestyle to sql,dmy;

create table Terreno(
propietario varchar(20),
tel_propietario int,
hectareas int,
DNI varchar(20),
id_terreno varchar(20) primary key
);

create table Quimico(
nombre varchar(20),
telefono int,
apellidos varchar(25),
id_quimico varchar(20) primary key
);

create table Informe(
nombre_empresa varchar(20),
fecha_info date,
conclusiones varchar(100),
id_informe varchar(20) primary key
);

create table Medicion(
humedad int,
comentario varchar(20),
fecha date,
temperatura int,
hora time,
id_medicion varchar(20) primary key,
quimico varchar(20) references Quimico(id_quimico),
terreno varchar(20) references Terreno(id_terreno),
informe varchar(20) references Informe(id_informe)
);

insert into Terreno values
('alejandro',95123841,2,'apf18372831','th209'),
('gabriel',96245234,5,'gyf93274722','th582'),
('marisol',97274628,8,'mpf6382y73','th864');

insert into Quimico values
('pablo',95123841,'perez gomez','ppg002'),
('laura',96245234,'sanchez sanchez','lss289'),
('manolo',97274628,'olivares vazques','mov827');

insert into Informe values
('bimbo','12-08-2020','buen terreno','inf09'),
('mc donals','17-05-2020','no es lo suficiente','inf19'),
('fempsa','27-11-2020','esta listado','inf25');

insert into Medicion values
(25,'poco humedo','12-08-2020',23,'13:00:00','ph001','ppg002','th209','inf09'),
(34,'termino medio','17-05-2020',34,'07:00:00','ph002','lss289','th582','inf19'),
(50,'normal','27-11-2020',18,'23:30:00','ph003','mov827','th864','inf25');


create schema HOTEL authorization postgres;
set search_path to hotel;
set datestyle to sql,dmy;

create table Cliente(
nombre varchar(20),
apellidos varchar(25),
pais varchar(20),
DNI varchar(20) primary key
);

create table Habitacion(
precio int,
numero_camas int,
numero int primary key
);

create table Reserva(
tipo_pago varchar(20),
cheking date,
checkout date,
habitacion int references Habitacion(numero),
cliente varchar(20) references Cliente(DNI)
);

insert into Cliente values
('pablo','martinez suarez','Argentina','sump231244'),
('juan','hernandez lopez','Mexico','lphj212432'),
('pedro','lopez lopez','Mexico','lolp312456');

insert into Habitacion values
(500,2,1),
(700,3,2),
(550,2,3);

insert into Reserva values
('tarjeta','26-12-2020','27/12/2020',1,'sump231244'),
('efectivo','23-05-2020','24-05-2020',3,'lphj212432'),
('efectivo','06-09-2020','08/09/2020',3,'lolp312456');

create schema TALLER authorization postgres;
set search_path to taller;
set datestyle to sql,dmy;

create table Mecanico(
nombre varchar(20),
apellido varchar(20),
telefono int,
id_mecanico varchar(20) primary key
);

create table Coche(
marcha varchar(20),
modelo varchar(20),
matricula varchar(20) primary key
);

create table Reparacion(
coste int,
horas int,
coche varchar(20) references Coche(matricula),
mecanico varchar(20) references Mecanico(id_mecanico)
);

insert into Mecanico values
('juan' ,'martinez juarez',95123841,'Mejmj12'),
('pedro','sanchez reyes',96245234,'Mepsr13'),
('pablo','perez hernandez',97274628,'Mepph14');

insert into Coche values
('a-678','nisan','3685 HDF'),
('827B','ferrari','7286 HFU'),
('7364C','ferrari','1456 JFT');

insert into Reparacion values
(500,2,'3685 HDF','Mejmj12'),
(200,3,'7286 HFU','Mejmj12'),
(110,6,'1456 JFT','Mepph14');