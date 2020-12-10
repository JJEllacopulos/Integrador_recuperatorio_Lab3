package Dao;

import Entidades.Usuario;

public interface UsuarioDao {
	public int insert(Usuario usuario);
	public Usuario Obtener_usuario (String nombreUsuario);
}
