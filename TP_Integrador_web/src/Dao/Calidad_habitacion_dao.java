package Dao;

import java.util.ArrayList;

import Entidades.Calidad_habitacion;

public interface Calidad_habitacion_dao {
	
	public ArrayList<Calidad_habitacion> readAll();
	public ArrayList<Calidad_habitacion> ListarDispo(String F1, String F2, String nomb);
	
}
