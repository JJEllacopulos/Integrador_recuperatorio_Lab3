package Dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;


import Entidades.Usuario;

public interface UsuarioDao {
	public int insert(Usuario usuario);
	public Usuario Obtener_usuario (String nombreUsuario);
	public ArrayList<Usuario> Obtener_lista_usuarios();
	

}
