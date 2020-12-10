package daoImp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import Entidades.Calidad_habitacion;
import Entidades.Disponibilidad_de_habitacion;
import Entidades.Reserva_de_habitacion;
import Entidades.Usuario;
import dao.Disponibilidad_de_habitacion_dao;
import dao.Reserva_de_habitacion_dao;

public class Reserva_de_habitacion_daoimp implements Reserva_de_habitacion_dao{
	
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "ROOT";
	private String dbName = "hoteleria";
	
	public int insert(Reserva_de_habitacion reserva_de_habitacion) {
		
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
			
			 
			 CallableStatement cst = cn.prepareCall("CALL PRO_ingresar_Reservacion_de_habitacion(?,?)");
			 cst.setInt(1, reserva_de_habitacion.getId_reserva_de_habitacion());
			 cst.setString(2, reserva_de_habitacion.getNombre_usuario());
			 
	 
			 filas=cst.executeUpdate();
		  }
		  catch (Exception e) {
			e.printStackTrace();
		}

		  return filas;
	}
	
	public ArrayList<Reserva_de_habitacion> readAll() {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Reserva_de_habitacion> x = new ArrayList<Reserva_de_habitacion>();
			
			Connection cn = null;
			
			try {
				
				cn = DriverManager.getConnection(host+dbName, user,pass);
				CallableStatement st = cn.prepareCall("CALL PRO_Listar_Reservacion_de_habitacion()");
				
				
				ResultSet resultado = st.executeQuery();
				while(resultado.next()){
					
					
					Reserva_de_habitacion aux = new Reserva_de_habitacion();
					aux.setId_reserva_de_habitacion(resultado.getInt("id_disponivilidad_de_habitacion"));
					aux.setNombre_usuario(resultado.getString("nombre_usuario"));
					
					x.add(aux);
					
				}
				
			}
			catch(Exception e) {
				
				e.printStackTrace();
				
			}
			
			return x;
			
		}


	
}
