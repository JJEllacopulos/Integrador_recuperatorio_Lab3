package daoImp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import Entidad.Cuenta;
import Entidades.Habitacion;
import dao.HabitacionDao;

public class HabitacionDaoImpl implements HabitacionDao {
	
}
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "ROOT";
	private String dbName = "hoteleria";
	@Override
	public int insert(Habitacion habitacion) {
		// TODO Auto-generated method stub
	
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			int	filas = 0;
				Connection cn = null;
				  try
				  {
					 cn = DriverManager.getConnection(host+dbName, user,pass);
/*
					 CallableStatement cst = cn.prepareCall("CALL PRO_ingresar_cuenta(?,?,?,?,?,?)");
					 cst.setString(1, cuenta.getCbu_cuenta() ); 
					 cst.setString(2, cuenta.getNombre_usuario());
					 cst.setString(3, cuenta.getTipo_Cuenta() );//cuenta.getTipo_Cuenta()
					 cst.setString(4, cuenta.getFecha_creacion()); 
					 cst.setDouble(5, cuenta.getSaldo()); 
					 cst.setString(6, cuenta.getAlias()); 
					 
*/

					 filas=cst.executeUpdate();
				  }
				  catch (Exception e) {
					e.printStackTrace();
				}
	
		return 0;
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
