package daoImp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import Entidades.Disponibilidad_de_habitacion;
import Entidades.Reserva_de_habitacion;
import dao.Disponibilidad_de_habitacion_dao;


public class Disponibilidad_de_habitacion_daoimp implements Disponibilidad_de_habitacion_dao{
	
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "ROOT";
	private String dbName = "hoteleria";
	
	public int insert(Disponibilidad_de_habitacion disponibilidad_de_habitacion) {
		
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
			
			 
			 CallableStatement cst = cn.prepareCall("CALL PRO_ingresar_Disponivilidad_de_habitacion(?,?,?,?)");
			 cst.setInt(1, disponibilidad_de_habitacion.getId_habitacion());
			 cst.setDate(2, (Date) disponibilidad_de_habitacion.getFecha_inicio());
			 cst.setDate(3, (Date) disponibilidad_de_habitacion.getFecha_final());
			 cst.setString(4, disponibilidad_de_habitacion.getDetalles());
	 
			 filas=cst.executeUpdate();
		  }
		  catch (Exception e) {
			e.printStackTrace();
		}

		  return filas;
	}
	
	public ArrayList<Disponibilidad_de_habitacion> readAll() {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Disponibilidad_de_habitacion> x = new ArrayList<Disponibilidad_de_habitacion>();
			
			Connection cn = null;
			
			try {
				
				cn = DriverManager.getConnection(host+dbName, user,pass);
				CallableStatement st = cn.prepareCall("CALL PRO_Listar_Disponivilidad_de_habitacion()");
				
				
				ResultSet resultado = st.executeQuery();
				while(resultado.next()){
					
					
					Disponibilidad_de_habitacion aux = new Disponibilidad_de_habitacion();
					aux.setId_reserva_de_habitacion(resultado.getInt("id_disponivilidad_de_habitacion"));
					aux.setId_habitacion(resultado.getInt("id_habitacion"));
					aux.setFecha_inicio(resultado.getDate("fecha_inicio"));
					aux.setFecha_final(resultado.getDate("fecha_final"));
					aux.setDetalles(resultado.getString("detalles"));
					aux.setReservacion(resultado.getBoolean("reservacion"));
					aux.setEstado(resultado.getBoolean("estado"));
					
					x.add(aux);
					
				}
				
			}
			catch(Exception e) {
				
				e.printStackTrace();
				
			}
			
			return x;
			
		}
	
}
