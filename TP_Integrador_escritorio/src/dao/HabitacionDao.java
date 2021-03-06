package dao;
import java.util.List;

import Entidades.Habitacion;

public interface HabitacionDao {
	
	public int insert(Habitacion habitacion);
	public int modify(Habitacion habitacion);
	public int delete(String id);
	public List<Habitacion> readAll();

}
