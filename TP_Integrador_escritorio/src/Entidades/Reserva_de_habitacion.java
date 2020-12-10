package Entidades;

import java.util.Date;

public class Reserva_de_habitacion {
	
	private int id_reserva_de_habitacion;
	private String nombre_usuario;
	
	public Reserva_de_habitacion() {
		
	}
	
	public Reserva_de_habitacion(int id_reserva_de_habitacion, String nombre_usuario) {
		super();
		this.id_reserva_de_habitacion = id_reserva_de_habitacion;
		this.nombre_usuario = nombre_usuario;
	}

	public int getId_reserva_de_habitacion() {
		return id_reserva_de_habitacion;
	}

	public void setId_reserva_de_habitacion(int id_reserva_de_habitacion) {
		this.id_reserva_de_habitacion = id_reserva_de_habitacion;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	
	
	
}
