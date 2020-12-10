package dao;

import java.util.List;

import Entidades.Disponibilidad_de_habitacion;
import Entidades.Reserva_de_habitacion;

public interface Reserva_de_habitacion_dao {
	
	public int insert(Reserva_de_habitacion reserva_de_habitacion);
	public List<Reserva_de_habitacion> readAll();
	
}
