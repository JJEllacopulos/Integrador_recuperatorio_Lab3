package daoImp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Entidades.Calidad_habitacion;
import Entidades.Habitacion;
import dao.HabitacionDao;

public class HabitacionDaoImpl implements HabitacionDao {
	

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

					 CallableStatement cst = cn.prepareCall("CALL PRO_ingresar_Habitacion(?,?)");
					 cst.setString(1, habitacion.getId_calidad_habitacion());
					 cst.setString(2, habitacion.getDetalles());
			 
					 filas=cst.executeUpdate();
				  }
				  catch (Exception e) {
					e.printStackTrace();
				}
	
		return filas;
	}
	
	public int modify(Habitacion habitacion) {
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

					 CallableStatement cst = cn.prepareCall("CALL PRO_Modificar_Habitacion(?,?,?)");
					 cst.setString(1, habitacion.getId_habitacion());
					 cst.setString(2, habitacion.getId_calidad_habitacion());
					 cst.setString(3, habitacion.getDetalles());
			 
					 filas=cst.executeUpdate();
				  }
				  catch (Exception e) {
					e.printStackTrace();
				}
	
		return filas;
	}

	@Override
	public int delete(Habitacion habitacion_eliminar) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Habitacion> readAll() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<Habitacion> x = new ArrayList<Habitacion>();
			
			Connection cn = null;
			
			try {
				
				cn = DriverManager.getConnection(host+dbName, user,pass);
				CallableStatement st = cn.prepareCall("CALL PRO_Listar_Habitacion()");
				
				
				ResultSet resultado = st.executeQuery();
				while(resultado.next()){
					
					
					Habitacion aux = new Habitacion();
					aux.setId_habitacion(resultado.getString("id_habitacion"));
					aux.setDetalles(resultado.getString("detalles"));
					aux.setId_calidad_habitacion((resultado.getString("detalles")));
			
					x.add(aux);
					
				}
				
			}
			catch(Exception e) {
				
				e.printStackTrace();
				
			}
			
			return x;
	}

}
