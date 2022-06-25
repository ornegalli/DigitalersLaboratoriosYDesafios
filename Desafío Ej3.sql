USE LIBRERIA;

ALTER TABLE AUTORES ADD Primary Key(Autor_ID);
ALTER TABLE VENTAS ADD Primary Key(Local_ID, Libro_ID);
ALTER TABLE LOCALES ADD Primary Key(Local_ID);
ALTER TABLE EDITORIALES ADD Primary Key(Editorial_ID);
ALTER TABLE LIBROS ADD Primary Key(Libro_ID, Editorial_ID);
ALTER TABLE LIBROAUTOR ADD Primary Key(Autor_ID, Libro_ID);
ALTER TABLE EMPLEADOS ADD Primary Key(Empleado_ID, Puesto_ID, Editorial_ID);
ALTER TABLE PUESTOS ADD Primary Key(Puesto_ID);

