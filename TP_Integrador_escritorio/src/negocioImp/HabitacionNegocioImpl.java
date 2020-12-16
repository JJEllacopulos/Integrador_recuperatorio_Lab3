package negocioImp;

import java.util.ArrayList;
import java.util.List;

import Entidades.Habitacion;
import dao.HabitacionDao;
import daoImp.HabitacionDaoImpl;
import negocio.HabitacionNegocio;

public class HabitacionNegocioImpl implements HabitacionNegocio{
	HabitacionDao habitacionDao = new HabitacionDaoImpl();
	List<Habitacion> habitacion = new ArrayList<Habitacion>();
	@Override
	public int insert(Habitacion habitacion) {
		// TODO Auto-generated method stub
		int filas = 0;
		filas = habitacionDao.insert(habitacion);
		
		return filas;
	}

	@Override
	public int delete(Habitacion habitacion_eliminar) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Habitacion> readAll() {
		// TODO Auto-generated method stub
		habitacion = habitacionDao.readAll();
		
		return habitacion;
	}

	@Override
	public int modify(Habitacion habitacion) {
		// TODO Auto-generated method stub
		int filas = 0;
		filas = habitacionDao.modify(habitacion);
		return filas;
	}

	

	

}
