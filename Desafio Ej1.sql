CREATE DATABASE BONUS_TRACK;
USE BONUS_TRACK;
/* CREATE TABLE AGENDA(
IDContacto int PRIMARY KEY,
Nombre varchar(20) NOT NULL,
Apellido varchar(15) NOT NULL,
Domicilio varchar(50),
Telefono int NOT NULL
);
*/
SHOW tables from BONUS_TRACK;
DESC AGENDA;
ALTER TABLE AGENDA ADD COLUMN Mail varchar(50) NOT NULL;

INSERT INTO AGENDA 
VALUES  (1, 'Carlos', 'Vives', 'San Juan 233', 351345678, 'carlosvives@gmail.com'),
		(2, 'Pedro', 'Gómez', 'Salta 2436', 35678893, 'pedrogomez@hotmail.com'),
        (3, 'Juana', 'López', 'Misiones 12', 35678934, 'juanilopez@gmail.com'),
        (4, 'Martina', 'Suárez', 'Tucuman 985', 35412732, 'martisuarez@hotmail.com');
