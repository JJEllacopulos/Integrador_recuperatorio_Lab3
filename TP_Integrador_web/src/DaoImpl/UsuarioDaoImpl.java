package DaoImpl;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

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

}
