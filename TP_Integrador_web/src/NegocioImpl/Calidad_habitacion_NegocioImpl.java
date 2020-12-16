package NegocioImpl;

import java.util.ArrayList;

import Entidades.Calidad_habitacion;
import Dao.Calidad_habitacion_dao;
import Dao.HabitacionDao;
import DaoImpl.Calidad_habitacion_Dao_Impl;
import DaoImpl.HabitacionDaoImpl;
import Negocio.Calidad_habitacion_Negocio;

public class Calidad_habitacion_NegocioImpl implements Calidad_habitacion_Negocio{
	Calidad_habitacion_dao DaoCalidad = new Calidad_habitacion_Dao_Impl();
	@Override
	public ArrayList<Calidad_habitacion> readAll() {
		// TODO Auto-generated method stub
		ArrayList<Calidad_habitacion> lista_calidad_habitacion = new ArrayList<Calidad_habitacion>();
		lista_calidad_habitacion = DaoCalidad.readAll();
		return lista_calidad_habitacion;
	}
	@Override
	public ArrayList<Calidad_habitacion> ListarDispo(String F1, String F2, String nomb) {
		ArrayList<Calidad_habitacion> lista_calidad_habitacion = new ArrayList<Calidad_habitacion>();
		lista_calidad_habitacion = DaoCalidad.ListarDispo(F1,F2,nomb);
		return lista_calidad_habitacion;
	}

}
