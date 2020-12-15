package negocioImp;

import java.util.ArrayList;

import Entidades.Calidad_habitacion;
import dao.Calidad_habitacion_dao;
import dao.HabitacionDao;
import daoImp.Calidad_habitacion_Dao_Impl;
import daoImp.HabitacionDaoImpl;
import negocio.Calidad_habitacion_Negocio;

public class Calidad_habitacion_NegocioImpl implements Calidad_habitacion_Negocio{
	Calidad_habitacion_dao DaoCalidad = new Calidad_habitacion_Dao_Impl();
	@Override
	public ArrayList<Calidad_habitacion> readAll() {
		// TODO Auto-generated method stub
		ArrayList<Calidad_habitacion> lista_calidad_habitacion = new ArrayList<Calidad_habitacion>();
		lista_calidad_habitacion = DaoCalidad.readAll();
		return lista_calidad_habitacion;
	}

}
