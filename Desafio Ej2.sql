CREATE DATABASE LIBRERIA;
USE LIBRERIA;

CREATE TABLE AUTORES(
Autor_ID varchar(11),
Apellido varchar(40),
Nombre varchar(20),
Telefono varchar(12),
Direccion varchar(40),
Ciudad varchar(20),
Provincia char(2),
C_Postal char(5),
Estado tinyint(1)
);

CREATE TABLE VENTAS(
Local_ID char(4),
Factura_Nro varchar(20),
Fecha datetime,
Cantidad smallint,
Forma_Pago varchar(12),
Libro_ID varchar(6)
);

CREATE TABLE LOCALES(
Local_ID char(4),
Nombre varchar(40),
Direccion varchar(40),
Ciudad varchar(20),
Provincia char(2),
C_Postal char(5)
);

CREATE TABLE EDITORIALES(
Editorial_ID char(4),
Nombre varchar(40),
Ciudad varchar(20),
Provincia char(2),
País varchar(30)
);

CREATE TABLE LIBROS(
Libro_ID varchar(6),
Título varchar(80),
Categoría char(12),
Editorial_ID char(4),
Precio double,
Comentarios varchar(200),
Fecha_Publicacion datetime
);

CREATE TABLE LIBROAUTOR(
Autor_ID varchar(11),
Libro_ID varchar(6)
);

CREATE TABLE EMPLEADOS(
Empleado_ID char(9),
Nombre varchar(20),
Apellido varchar(30),
Puesto_ID smallint,
Editorial_ID char(4),
Fecha_Ingreso datetime
);

CREATE TABLE PUESTOS(
Puesto_ID smallint,
Descripcion varchar(50)
);
