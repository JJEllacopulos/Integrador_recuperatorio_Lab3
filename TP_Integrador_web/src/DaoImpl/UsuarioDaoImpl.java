package DaoImpl;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import Dao.UsuarioDao;
import Entidades.Usuario;

public class UsuarioDaoImpl implements UsuarioDao  {
	
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "ROOT";
	private String dbName = "hoteleria";
	
	@Override
	public int insert(Usuario usuario) {
		
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
	
			 
			 CallableStatement cst = cn.prepareCall("CALL PRO_ingresar_Usuario(?,?,?,?,?,?,?,?)");
			 cst.setString(1, usuario.getNombre_usuario());
			 cst.setString(2, usuario.getDni_usuario());
			 cst.setString(3, usuario.getNombre_real());
			 cst.setString(4, usuario.getApellido_real());
			 cst.setString(5, usuario.getContrasena_usuario());
			 cst.setString(6, usuario.getEmail());
			 cst.setString(7, usuario.getSexo());
			 cst.setString(8, usuario.getFecha_nacimiento());
			 
	 
			 filas=cst.executeUpdate();
		  }
		  catch (Exception e) {
			e.printStackTrace();
		}

		  return filas;
	}

	@Override
	public Usuario Obtener_usuario(String nombreUsuario) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Usuario aux = new Usuario();

			Connection cn = null;
			
			try {
				
				cn = DriverManager.getConnection(host+dbName, user,pass);
				CallableStatement st = cn.prepareCall("CALL PRO_Buscar_Usuario(?)");
				 st.setString(1, nombreUsuario);
				 
				
				ResultSet resultado = st.executeQuery();

				while(resultado.next()){
					
					aux.setNombre_usuario(resultado.getString("nombre_usuario"));
					aux.setDni_usuario(resultado.getString("dni_usuario"));
					aux.setNombre_real(resultado.getString("nombre_real"));
					aux.setApellido_real(resultado.getString("apellido_real"));
					aux.setContrasena_usuario(resultado.getString("contraseña_usuario"));
					aux.setSexo(resultado.getString("sexo"));
					aux.setFecha_nacimiento(resultado.getString("fecha_nacimiento"));
					aux.setEmail(resultado.getString("email_usuario"));
					aux.setEstado(resultado.getBoolean("estado"));
					
				}
					
				
			}
			catch(Exception e) {
				
				e.printStackTrace();
				
			}
			
			return aux;
	}

	

}
