package NegocioImpl;

import Dao.UsuarioDao;
import DaoImpl.UsuarioDaoImpl;
import Entidades.Usuario;
import Negocio.UsuarioNegocio;

public class UsuarioNegocioImpl implements UsuarioNegocio {
	UsuarioDao usuarioDao = new UsuarioDaoImpl();
	@Override
	public int insert(Usuario usuario) {
		// TODO Auto-generated method stub
		int filas = 0;
		filas = usuarioDao.insert(usuario);
		return filas;
	}
	
}
