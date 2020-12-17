package Negocio;

import java.util.ArrayList;

import Entidades.Usuario;

public interface UsuarioNegocio {
	public int insert(Usuario usuario);
	public Usuario Obtener_usuario(String nombreUsuario);
	public ArrayList<Usuario> Obtener_lista_usuarios();
}
