/*Populate tabla departamentos*/
INSERT INTO departamentos (nombre) VALUES ('Santa Rosa');
INSERT INTO departamentos (nombre) VALUES ('San Martin');
INSERT INTO departamentos (nombre) VALUES ('Mendoza');
INSERT INTO departamentos (nombre) VALUES ('La Paz');
INSERT INTO departamentos (nombre) VALUES ('Godoy Cruz');
/*Populate tabla provincias*/
INSERT INTO provincias (nombre) VALUES ('Mendoza');
INSERT INTO provincias (nombre) VALUES ('La Pampa');
INSERT INTO provincias (nombre) VALUES ('San Juan');
INSERT INTO provincias (nombre) VALUES ('La Rioja');
INSERT INTO provincias (nombre) VALUES ('Cordoba');
/* Populate tabla paises*/
INSERT INTO paises (nombre) VALUES('Argentina');
INSERT INTO paises (nombre) VALUES('Colombia');
INSERT INTO paises (nombre) VALUES('Chile');
INSERT INTO paises (nombre) VALUES('Brasil');
INSERT INTO paises (nombre) VALUES('Bolivia');
/* Populate tabla direcciones*/
INSERT INTO direcciones (departamento_id, provincia_id, pais_id, create_at) VALUES(1,1,1,'2018-03-26');
INSERT INTO direcciones (departamento_id, provincia_id, pais_id, create_at) VALUES(2,2,2,'2011-03-16');
INSERT INTO direcciones (departamento_id, provincia_id, pais_id, create_at) VALUES(5,5,5,'2018-05-26');
INSERT INTO direcciones (departamento_id, provincia_id, pais_id, create_at) VALUES(3,3,3,'2017-03-04');
INSERT INTO direcciones (departamento_id, provincia_id, pais_id, create_at) VALUES(4,4,4,'2014-03-10');
/* Populate tabla hoteles */
INSERT INTO hoteles (nombre, calificacion, direccion_id, create_at) VALUES('Transilvania','2',1,'2018-03-06');
INSERT INTO hoteles (nombre, calificacion, direccion_id, create_at) VALUES('Palacio','3',2,'2018-03-06');
INSERT INTO hoteles (nombre, calificacion, direccion_id, create_at) VALUES('Tres pilares','5',3,'2018-03-06');
INSERT INTO hoteles (nombre, calificacion, direccion_id, create_at) VALUES('Palacio Won','4',4,'2018-03-06');
/* Populate tabla clientes */
INSERT INTO clientes (nombre, apellido, email, hotel_id, create_at) VALUES('Richard', 'Helm', 'richard.helm@gmail.com',1, '2018-02-10');
INSERT INTO clientes (nombre, apellido, email, hotel_id, create_at) VALUES('Ralph', 'Johnson', 'ralph.johnson@gmail.com',2, '2018-02-18');
INSERT INTO clientes (nombre, apellido, email, hotel_id, create_at) VALUES('John', 'Vlissides', 'john.vlissides@gmail.com',3, '2018-02-28');
INSERT INTO clientes (nombre, apellido, email, hotel_id, create_at) VALUES('Dr. James', 'Gosling', 'james.gosling@gmail.com',4, '2018-03-03');
INSERT INTO clientes (nombre, apellido, email, hotel_id, create_at) VALUES('Magma', 'Lee', 'magma.lee@gmail.com',1, '2018-03-04');
INSERT INTO clientes (nombre, apellido, email, hotel_id, create_at) VALUES('Tornado', 'Roe', 'tornado.roe@gmail.com',2, '2018-03-05');
INSERT INTO clientes (nombre, apellido, email, hotel_id, create_at) VALUES('Jade', 'Doe', 'jane.doe@gmail.com',3, '2018-03-06');


