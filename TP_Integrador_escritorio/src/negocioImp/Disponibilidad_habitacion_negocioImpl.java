package negocioImp;

import Entidades.Disponibilidad_de_habitacion;
import dao.Disponibilidad_de_habitacion_dao;
import daoImp.Disponibilidad_de_habitacion_daoimp;
import negocio.Disponibilidad_habitacion_negocio;

public class Disponibilidad_habitacion_negocioImpl implements Disponibilidad_habitacion_negocio{
	Disponibilidad_de_habitacion_dao daoDisponibilidad = new Disponibilidad_de_habitacion_daoimp();
	@Override
	public int insert(Disponibilidad_de_habitacion disponibilidad_de_habitacion) {
		// TODO Auto-generated method stub
		int filas = 0;
		daoDisponibilidad.Refreshinsert(disponibilidad_de_habitacion);
		filas = daoDisponibilidad.insert(disponibilidad_de_habitacion);	
		return filas;
	}

}
