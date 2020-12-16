package Entidades;

public class Habitacion {
	
	private String id_habitacion;
	private String id_calidad_habitacion;
	private String detalles;
	private boolean estado;
	
	public Habitacion() {
		
	}
	
	public Habitacion(String id_habitacion, String id_calidad_habitacion, String detalles, boolean estado) {
		super();
		this.id_habitacion = id_habitacion;
		this.id_calidad_habitacion = id_calidad_habitacion;
		this.detalles = detalles;
		this.estado = estado;
	}

	public String getId_habitacion() {
		return id_habitacion;
	}

	public void setId_habitacion(String id) {
		this.id_habitacion = id;
	}

	public String getId_calidad_habitacion() {
		return id_calidad_habitacion;
	}

	public void setId_calidad_habitacion(String id_calidad_habitacion) {
		this.id_calidad_habitacion = id_calidad_habitacion;
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
