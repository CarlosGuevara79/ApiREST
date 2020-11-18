create database empresa;

use empresa;

create table data_empresa(

 	id int auto_increment primary key,
 	nombre varchar(250),
 	nit varchar(17),
 	fecha_fundacion date,
 	direccion varchar(250)
 
);

