package NegocioImpl;

import Entidades.Disponibilidad_de_habitacion;

import java.util.ArrayList;

import Dao.Disponibilidad_de_habitacion_dao;
import DaoImpl.Disponibilidad_de_habitacion_daoimp;
import Negocio.Disponibilidad_habitacion_Negocio;

public class Disponibilidad_habitacion_NegocioImpl implements Disponibilidad_habitacion_Negocio{
    Disponibilidad_de_habitacion_dao daoDisponibilidad = new Disponibilidad_de_habitacion_daoimp();
    @Override
    public int insert(Disponibilidad_de_habitacion disponibilidad_de_habitacion) {
        // TODO Auto-generated method stub
        int filas = 0;
        filas = daoDisponibilidad.insert(disponibilidad_de_habitacion);
        disponibilidad_de_habitacion.setId_reserva_de_habitacion(daoDisponibilidad.IdRes());
        daoDisponibilidad.reserva(disponibilidad_de_habitacion);
        return filas;
    }
	@Override
	public ArrayList<Disponibilidad_de_habitacion> MisRes(String usu) {		
		return daoDisponibilidad.MisRes(usu);
	}

}
