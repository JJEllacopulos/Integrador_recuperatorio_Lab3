package dao;

import java.util.List;

import Entidades.Disponibilidad_de_habitacion;


public interface Disponibilidad_de_habitacion_dao {
	
	public int insert(Disponibilidad_de_habitacion disponibilidad_de_habitacion);
	public List<Disponibilidad_de_habitacion> readAll();
	public int Refreshinsert(Disponibilidad_de_habitacion disponibilidad_de_habitacion);
	
}
