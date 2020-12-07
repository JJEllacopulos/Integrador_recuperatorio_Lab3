create schema Hoteleria;

use Hoteleria;

create table Usuario
(
	nombre_usuario VARCHAR(25) NOT NULL,
	CONSTRAINT PK_Usuario PRIMARY KEY (nombre_usuario),

	dni_usuario VARCHAR(8) NOT NULL,
	nombre_real VARCHAR(50) NOT NULL,
	apellido_real VARCHAR(50) NOT NULL,
	CONSTRAINT UC_usuario UNIQUE (dni_usuario, nombre_real, apellido_real),
    
	contraseña_usuario VARCHAR(25) NOT NULL,
	cuil_usuario VARCHAR(11) NOT NULL,
	sexo VARCHAR(20) NOT NULL,
    
	fecha_nacimiento DATE NOT NULL,
    estado bit NOT NULL DEFAULT 1

);

create table Calidad_habitacion
(

	id_calidad_habitacion VARCHAR(5) NOT NULL,
	CONSTRAINT PK_Calidad_habitacion PRIMARY KEY (id_calidad_habitacion),
    
    nombre VARCHAR(50) NOT NULL,
    detalles VARCHAR(200) NOT NULL,
    estado bit NOT NULL DEFAULT 1

);

create table Habitacion
(

	id_habitacion INT NOT NULL AUTO_INCREMENT,
	CONSTRAINT PK_Habitacion PRIMARY KEY (id_habitacion),
    
    id_calidad_habitacion VARCHAR(5) NOT NULL,
    constraint PF_Habitacion_x_Calidad_habitacion foreign key (id_calidad_habitacion) 
	references Calidad_habitacion(id_calidad_habitacion),
    
    detalles VARCHAR(200) NOT NULL,
    estado bit NOT NULL DEFAULT 1

);

create table Disponivilidad_de_habitacion
(
	
    id_disponivilidad_de_habitacion INT NOT NULL AUTO_INCREMENT,
	CONSTRAINT PK_Reservacion_de_habitacion PRIMARY KEY (id_disponivilidad_de_habitacion),
	
    id_habitacion INT NOT NULL,
    constraint PF_Disponivilidad_de_habitacion_x_Habitacion foreign key (id_habitacion) 
	references Habitacion(id_habitacion),
	
    fecha_inicio DATE NOT NULL,
    fecha_final DATE NOT NULL,
    
    detalles VARCHAR(200) NOT NULL,
    reservacion bit NOT NULL DEFAULT 0,
    estado bit NOT NULL DEFAULT 1
    
);

create table Reservacion_de_habitacion
(
	
    id_disponivilidad_de_habitacion INT NOT NULL,
    constraint PF_Reservacion_de_habitacion_x_Habitacion foreign key (id_disponivilidad_de_habitacion) 
	references Disponivilidad_de_habitacion(id_disponivilidad_de_habitacion),
    
    nombre_usuario VARCHAR(25) NOT NULL,
    constraint PF_Reservacion_de_habitacion_x_Usuario foreign key (nombre_usuario) 
	references Usuario(nombre_usuario),
	
    CONSTRAINT PK_Reservacion_de_habitacion PRIMARY KEY (id_disponivilidad_de_habitacion, nombre_usuario)
    
);



