use Hoteleria;

-- Usuario

CALL PRO_ingresar_Usuario 
(
	'SabrinaLMS',
    '45672480',
    'Sabrina',
    'Rodriges',
    'dgjio5643',
    'sabrrinaLMS@gmail.com',
    'Mujer',
    '1975-06-04'
);

CALL PRO_ingresar_Usuario 
(
	'Ema1999',
    '48658604',
    'Emanuel',
    'Gomes',
    'Cairo99',
    'Ema1999@gmail.com',
    'Hombre',
    '1999-04-10'
);

CALL PRO_ingresar_Usuario 
(
	'Cristian',
    '79382950',
    'Cristian',
    'Garcia',
    'df8947ch',
    'Cristian@gmail.com',
    'Hombre',
    '1989-02-18'
);

-- Calidad de habitacion

CALL PRO_ingresar_Calidad_habitacion 
(
	'Tipo1',
    'Habitación individual',
    'Montada con una sola cama.'
);

CALL PRO_ingresar_Calidad_habitacion 
(
	'Tipo2',
    'Habitación doble',
    'Están equipadas con dos camas individuales o con una cama de matrimonio.'
);

CALL PRO_ingresar_Calidad_habitacion 
(
	'Tipo3',
    'Habitación con salón',
    'Disponen de un saloncito privado.'
);

CALL PRO_ingresar_Calidad_habitacion 
(
	'Tipo4',
    'Suite',
    'Conjunto de dos habitaciones, cada una de ellas con un respectivo vestidor y un cuarto de baño,
    además de un salón y el recibidor común. Puede tener además una pequeña cocina.'
);

CALL PRO_ingresar_Calidad_habitacion 
(
	'Tipo5',
    'Habitaciones para discapacitados',
    'Su diseño es cuidadoso y bonito pero adaptado a las necesidades especiales de los clientes.'
);

-- Habitaciones

CALL PRO_ingresar_Habitacion 
(
	'Tipo1',
    'vista al mar'
);

CALL PRO_ingresar_Habitacion 
(
	'Tipo1',
    'vista al mar'
);

CALL PRO_ingresar_Habitacion 
(
	'Tipo1',
    'vista a Av'
);

CALL PRO_ingresar_Habitacion 
(
	'Tipo2',
    'Excelente wifi'
);

CALL PRO_ingresar_Habitacion 
(
	'Tipo2',
    'Recien amueblado'
);

CALL PRO_ingresar_Habitacion 
(
	'Tipo2',
    'Vista al mar'
);

CALL PRO_ingresar_Habitacion 
(
	'Tipo3',
    'Vista interna'
);

CALL PRO_ingresar_Habitacion 
(
	'Tipo3',
    'Vista interna'
);

CALL PRO_ingresar_Habitacion 
(
	'Tipo3',
    'Vista al mar'
);

CALL PRO_ingresar_Habitacion 
(
	'Tipo4',
    'Excelente wifi'
);

CALL PRO_ingresar_Habitacion 
(
	'Tipo4',
    'Vista interna'
);

CALL PRO_ingresar_Habitacion 
(
	'Tipo5',
    'vista a Av'
);

CALL PRO_ingresar_Habitacion 
(
	'Tipo5',
    'vista a Av'
);

