# ApiREST EMPRESA
EJERCICIO 3 BYTES SW
Desarrollar un servicio REST en Java para el CRUD de una entidad “empresa” con los siguientes campos: Id, nombre, numero de NIT, fecha de fundación y dirección. Usar MySQL como base de datos. Anexar: Un documento con las rutas disponibles con su REST API y archivo texto con instrucciones para ejecutar el proyecto, así como el esquema de base de datos y el script para crearla que haya utilizado, que corresponden al ejercicio.
RECOMEDACIONES: 
a) Utilizar Maven para el manejo de dependencias 
b) Utilizar Spark para facilitar el desarrollo, quede a su criterio usar otra librería como Spring, JPA, etc. 
c) Si no se siente cómodo desarrollando un REST puede crear un CRUD en consola.


# Descripcion 
El proyecto esta creado en IDE IntelliJ con las dependencias de Spring Devtools, MySql, JPA y Spring Web. El Proyecto puede ingresar, listar, actualizar y borrar los datos dentro de la base de datos asignada, la cual esta adjunta dentro de la carpeta del proyecto, el archivo de application.properties está configurado con el nombre de la base de datos y con el usuario por defecto root y sin contraseña. El consumo de la API ha sido probado desde POSTMAN.

# Funcionamiento
Inserción de Datos
La ruta: localhost:8080/empresa/save guardamos los datos con el siguiente JSON
Dentro de este JSON no va el id ya que este es auto incrementable. Utiliza el método POST.
{
    "nombre":"Byte SW",
    "nit":"0607-181115-001-5",
    "fecha_fundacion":"2020-11-18",
    "direccion":"El Salvador,Ilopango"
    }

    

Listado de Datos
La ruta: localhost:8080/empresa/ listamos nuestros objetos, utiliza el método get
La ruta: localhost:8080/empresa/{id} listamos nuestros objetos, pero por id, utiliza el método get

Actualización de Datos
La ruta: localhost:8080/empresa/update actualizamos nuestros datos para esto debemos de agregar el id que deseamos actualizar, utiliza el método put
Ejemplo:
{
    "id":1,
    "nombre":"Carlos INC",
    "nit":"0607-181115-001-5",
    "fecha_fundacion":"2020-11-18",
    "direccion":"El Salvador"
    }

Eliminación de Datos
La ruta: localhost:8080/empresa/delete/{id} Elimina un objeto utilizando el id, utiliza el método delete.

# Base de datos
create database empresa;

use empresa;

create table data_empresa(

 	id int auto_increment primary key,
 	nombre varchar(250),
 	nit varchar(17),
 	fecha_fundacion date,
 	direccion varchar(250));
