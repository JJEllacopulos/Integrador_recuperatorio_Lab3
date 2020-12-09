package Entidades;

import java.util.Date;

public class Usuario {
	
	private String nombre_usuario;
	private String dni_usuario;
	private String nombre_real;
	private String apellido_real;
	private String contrasena_usuario;
	private String email;
	private String sexo;
	private String fecha_nacimiento;
	private boolean estado;
	
	public Usuario() {
		
	}
	
	public Usuario(String nombre_usuario, String dni_usuario, String nombre_real, String apellido_real,
					String contrasena_usuario, String email, String sexo, String fecha_nacimiento, 
					boolean estado) {
		super();
		this.nombre_usuario = nombre_usuario;
		this.dni_usuario = dni_usuario;
		this.nombre_real = nombre_real;
		this.apellido_real = apellido_real;
		this.contrasena_usuario = contrasena_usuario;
		this.email = email;
		this.sexo = sexo;
		this.fecha_nacimiento = fecha_nacimiento;
		this.estado = estado;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getDni_usuario() {
		return dni_usuario;
	}

	public void setDni_usuario(String dni_usuario) {
		this.dni_usuario = dni_usuario;
	}

	public String getNombre_real() {
		return nombre_real;
	}

	public void setNombre_real(String nombre_real) {
		this.nombre_real = nombre_real;
	}

	public String getApellido_real() {
		return apellido_real;
	}

	public void setApellido_real(String apellido_real) {
		this.apellido_real = apellido_real;
	}

	public String getContrasena_usuario() {
		return contrasena_usuario;
	}

	public void setContrasena_usuario(String contrasena_usuario) {
		this.contrasena_usuario = contrasena_usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}
