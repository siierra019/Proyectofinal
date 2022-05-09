# Proyectofinal
Proyecto final conjunto


Proyecto https://github.com/siierra019/Proyectofinal

Nombre del proyecto : Agencias ASI. 
Componentes : Alejandro Asu , Ivan Ballestín , Alvaro Sierra. 
Breve descripción del proyecto: (Análisis de requisitos del sistema)
Nuestra idea es realizar una agencia de viajes que gestione los viajes de manera que puedas elegir si seleccionar paquetes (vuelo, hotel, guías…), seleccionar tú cada cosa individualmente…También te avisará de posibles ofertas de vuelo en caso de ya haber volado con nuestra agencia, por si te pueden llegar a interesar. 
Almacenes (tablas, ficheros…) y atributos de cada almacén: 
Clientes(DNI, nombre, dirección, CP, teléfono, mail, contraseña) Compañías (Nombre, teléfono, calidad, vuelos) 
Vuelos(número de vuelo, clase, salida, fecha salida, destino, fecha de llegada) Hoteles (Nombre, calidad, teléfono, web, dirección)
Guías (Nombre, idiomas, país, teléfono)






















Diagrama de pantallas(Provisional):

0.Index: Esta será la página de inicio donde se podrá ver la temática de la página, los vuelos , hoteles ofertas , etc.

1.Login: Aquí podrás iniciar sesión si ya tienes cuenta.
1.1 Registrarse:En esta página necesitas meter el correo electrónico para crearte una cuenta en nuestra página web. 
1.2 Recuperar contraseña: Página única y exclusiva para recuperar la contraseña mediante un correo electrónico.

2.Viajes: Esta será la página donde encontraras toda la disponibilidad de viajes y vuelos de nuestras agencia.

3.Hoteles: Aquí aparecerán todos los hoteles que tenemos disponibles desde el más caro al más barato .

4.Guías: Aqui apareceran todos los guias disponibles para explorar el lugar más fondo
5. Alquiler de vehículos (direcciona a una página de alquiler, tipo northgate)

6.Paquetes: Aquí encontrarás paquetes de viaje para que no tengas que 
preocuparte de nada y además es más barato.
6.1 Escapadas (Subtipo de paquete)
6.2 Aventuras (Subtipo de paquete)

7. Perfil: Esta será la página donde  verás todos los datos que has metido ,tienes la posibilidad de modificar los datos como correo , dirección.

8. Pagos: Es la última página donde terminarás la compra .  


Diagrama de pantallas
Trabajo equipo Inazuma


Hoja de seguimiento del trabajo realizado 

https://app.smartsheet.com/sheets/9gHQJ8v7qRcvg22HcmXww25cX5gwcvJ38Mjj5wf1?view=grid

Modelo entidad relación


Creación de tablas en SQL

CREATE TABLE Compañía
(
Vuelos varchar(255),
Calidad varchar(255),
Curso varchar(255),
Telefono int,
Hora int,
Nombre varchar(255)
);

CREATE TABLE Hoteles
(
Telefono int,
Nombre varchar(255),
Calidad varchar(255),
Web varchar(255),
Direccion varchar(255)
);

CREATE TABLE Clientes(
	DNI nvarchar(9),
	Nombre nvarchar(50),
	Apellido nvarchar(50),
	Dirección nvarchar(50),
	Teléfono int,
	mail nvarchar(50));

CREATE TABLE Guías(
	Nombre nvarchar(50),
	Idiomas nvarchar(50),
	País nvarchar(50),
	Teléfono int);


CREATE TABLE Vuelos(
	id int,
	númerovuelo int,
	salida nvarchar,
	fechasalida date,
	llegada nvarchar,
	fechallegada date);
