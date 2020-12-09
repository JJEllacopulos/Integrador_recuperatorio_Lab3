use Hoteleria;

-- Usuario

DELIMITER $$
	CREATE PROCEDURE PRO_ingresar_Usuario(

		ing_nombre_usuario VARCHAR(25),
        ing_dni_usuario VARCHAR(8),
		ing_nombre_real VARCHAR(50),
		ing_apellido_real VARCHAR(50),
		ing_contraseña_usuario VARCHAR(25),
		ing_email_usuario VARCHAR(11),
		ing_sexo VARCHAR(20),
		ing_fecha_nacimiento DATE
		
        )
		
	BEGIN

		INSERT INTO Usuario (nombre_usuario, dni_usuario, nombre_real, apellido_real, contraseña_usuario, 
        email_usuario, sexo, fecha_nacimiento)
		SELECT ing_nombre_usuario, ing_dni_usuario, ing_nombre_real, ing_apellido_real, ing_contraseña_usuario, 
        ing_email_usuario, ing_sexo, ing_fecha_nacimiento;
		
	END$$

DELIMITER $$
    CREATE PROCEDURE PRO_Buscar_Usuario(
	
		ing_nombre_usuario VARCHAR(25)
        
		)
    
	BEGIN
	
		SELECT * FROM direccion WHERE nombre_usuario = ing_nombre_usuario AND estado = 1;
	

END$$

-- Calidad_habitacion

DELIMITER $$
	CREATE PROCEDURE PRO_ingresar_Calidad_habitacion(

		ing_id_calidad_habitacion VARCHAR(5),
		ing_nombre VARCHAR(50),
		ing_detalles VARCHAR(200)
		
        )
		
	BEGIN

		INSERT INTO Calidad_habitacion(id_calidad_habitacion, nombre, detalles)
		SELECT ing_id_calidad_habitacion, ing_nombre, ing_detalles;
		
	END$$
    
-- Habitacion

DELIMITER $$
	CREATE PROCEDURE PRO_ingresar_Habitacion(

		ing_id_calidad_habitacion VARCHAR(5),
		ing_detalles VARCHAR(200)
		
        )
		
	BEGIN

		INSERT INTO Habitacion (id_calidad_habitacion, detalles)
		SELECT ing_id_calidad_habitacion, ing_detalles;
		
	END$$
    
DELIMITER $$
    CREATE PROCEDURE PRO_Modificar_Habitacion(
		
        ing_id_habitacion INT,
		ing_id_calidad_habitacion VARCHAR(5),
		ing_detalles VARCHAR(200)
		
		)
    
	BEGIN
	
	IF EXISTS(SELECT * FROM Habitacion WHERE id_habitacion = ing_id_habitacion AND estado = 1) THEN
		
		Update Habitacion Set id_calidad_habitacion = ing_id_calidad_habitacion, detalles = ing_detalles Where id_habitacion = ing_id_habitacion;
        
	END IF;

END$$

DELIMITER $$
    CREATE PROCEDURE PRO_Buscar_Habitacion(
	
		ing_id_habitacion INT
        
		)
    
	BEGIN
	
		SELECT * FROM Habitacion WHERE id_habitacion = ing_id_habitacion AND estado = 1;
	

END$$

DELIMITER $$
    CREATE PROCEDURE PRO_Listar_Habitacion(
        
		)
    
	BEGIN
	
		SELECT * FROM Habitacion;
	

END$$

-- Disponivilidad_de_habitacion

DELIMITER $$
	CREATE PROCEDURE PRO_ingresar_Disponivilidad_de_habitacion(

		ing_id_habitacion INT,
		ing_fecha_inicio DATE,
		ing_fecha_final DATE,
		ing_detalles VARCHAR(200)
		
        )
		
	BEGIN

		INSERT INTO Disponivilidad_de_habitacion (id_habitacion, nombre_usuario, fecha_inicio, fecha_final, detalles)
		SELECT ing_id_habitacion, ing_nombre_usuario, ing_fecha_inicio, ing_fecha_final, ing_detalles;
		
	END$$
    
-- Reservacion_de_habitacion

DELIMITER $$
	CREATE PROCEDURE PRO_ingresar_Reservacion_de_habitacion(

		ing_id_disponivilidad_de_habitacion INT,
		ing_nombre_usuario VARCHAR(25)
		
        )
		
	BEGIN

		INSERT INTO Reservacion_de_habitacion(id_disponivilidad_de_habitacion, nombre_usuario)
		SELECT ing_id_disponivilidad_de_habitacion, ing_nombre_usuario;
		
	END$$

