package daoImp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import Entidades.Calidad_habitacion;
import dao.Calidad_habitacion_dao;;

public class Calidad_habitacion_Dao_Impl implements Calidad_habitacion_dao{
	
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "ROOT";
	private String dbName = "hoteleria";
	
	public ArrayList<Calidad_habitacion> readAll() {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<Calidad_habitacion> x = new ArrayList<Calidad_habitacion>();
			
			Connection cn = null;
			
			try {
				
				cn = DriverManager.getConnection(host+dbName, user,pass);
				CallableStatement st = cn.prepareCall("CALL PRO_Listar_Calidad_habitacion()");
				
				
				ResultSet resultado = st.executeQuery();
				while(resultado.next()){
					
					
					Calidad_habitacion aux = new Calidad_habitacion();
					aux.setId_calidad_habitacion(resultado.getString("id_calidad_habitacion"));
					aux.setNombre(resultado.getString("nombre"));
					aux.setDetalles(resultado.getString("detalles"));
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
