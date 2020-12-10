package Negocio;

import Entidades.Usuario;

public interface UsuarioNegocio {
	public int insert(Usuario usuario);
	public Usuario Obtener_usuario(String nombreUsuario);
}
