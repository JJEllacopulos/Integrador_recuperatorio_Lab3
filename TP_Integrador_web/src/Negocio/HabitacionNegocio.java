package Negocio;

import java.util.List;

import Entidades.Habitacion;

public interface HabitacionNegocio {
	
	public int insert(Habitacion habitacion);
	public int delete(Habitacion habitacion_eliminar);
	public List<Habitacion> readAll();
	
}
