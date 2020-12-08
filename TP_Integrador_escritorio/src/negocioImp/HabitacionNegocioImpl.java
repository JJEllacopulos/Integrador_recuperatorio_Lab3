package negocioImp;

import java.util.List;

import Entidades.Habitacion;
import dao.HabitacionDao;
import daoImp.HabitacionDaoImpl;
import negocio.HabitacionNegocio;

public class HabitacionNegocioImpl implements HabitacionNegocio{
	HabitacionDao habitacionDao = new HabitacionDaoImpl();
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
		return null;
	}

	

	

}
