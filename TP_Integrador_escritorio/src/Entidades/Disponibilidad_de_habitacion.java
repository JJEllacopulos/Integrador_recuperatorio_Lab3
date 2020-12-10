package Entidades;

import java.util.Date;

public class Disponibilidad_de_habitacion {
	
	private int id_reserva_de_habitacion;
	private int id_habitacion;
	private String nombre_usuario;
	private Date fecha_inicio;
	private Date fecha_final;
	private String detalles;
	private Boolean estado;
	private Boolean reservacion;
	
	public Disponibilidad_de_habitacion() {
		
	}

	public Disponibilidad_de_habitacion(int id_reserva_de_habitacion, int id_habitacion, String nombre_usuario,
			Date fecha_inicio, Date fecha_final, String detalles, Boolean estado, Boolean reservacion) {
		super();
		this.id_reserva_de_habitacion = id_reserva_de_habitacion;
		this.id_habitacion = id_habitacion;
		this.nombre_usuario = nombre_usuario;
		this.fecha_inicio = fecha_inicio;
		this.fecha_final = fecha_final;
		this.detalles = detalles;
		this.estado = estado;
		this.reservacion = reservacion;
	}

	public int getId_reserva_de_habitacion() {
		return id_reserva_de_habitacion;
	}

	public void setId_reserva_de_habitacion(int id_reserva_de_habitacion) {
		this.id_reserva_de_habitacion = id_reserva_de_habitacion;
	}

	public int getId_habitacion() {
		return id_habitacion;
	}

	public void setId_habitacion(int id_habitacion) {
		this.id_habitacion = id_habitacion;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_final() {
		return fecha_final;
	}

	public void setFecha_final(Date fecha_final) {
		this.fecha_final = fecha_final;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Boolean getReservacion() {
		return reservacion;
	}

	public void setReservacion(Boolean reservacion) {
		this.reservacion = reservacion;
	}

	
	
}
