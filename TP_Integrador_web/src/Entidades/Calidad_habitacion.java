package Entidades;

public class Calidad_habitacion {
	
	private String id_calidad_habitacion;
	private String nombre;
	private String detalles;
	private boolean estado;
	
	public Calidad_habitacion() {
		
	}
	
	public Calidad_habitacion(String id_calidad_habitacion, String nombre, String detalles, boolean estado) {
		super();
		this.id_calidad_habitacion = id_calidad_habitacion;
		this.nombre = nombre;
		this.detalles = detalles;
		this.estado = estado;
	}

	public String getId_calidad_habitacion() {
		return id_calidad_habitacion;
	}

	public void setId_calidad_habitacion(String id_calidad_habitacion) {
		this.id_calidad_habitacion = id_calidad_habitacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
