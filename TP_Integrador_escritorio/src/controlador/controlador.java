package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import Entidades.Calidad_habitacion;
import Entidades.Disponibilidad_de_habitacion;
import Entidades.Habitacion;
import Presentaciones.Disponibilidad_agregar;
import Presentaciones.Habitaciones_agregar;
import Presentaciones.Habitaciones_borrar;
import Presentaciones.Habitaciones_listar;
import Presentaciones.Habitaciones_modificar;
import Presentaciones.Ventana_principal;
import Main.Principal;
import negocio.Calidad_habitacion_Negocio;
import negocio.Disponibilidad_habitacion_negocio;
import negocio.HabitacionNegocio;
import negocioImp.Calidad_habitacion_NegocioImpl;
import negocioImp.Disponibilidad_habitacion_negocioImpl;
import negocioImp.HabitacionNegocioImpl;


public class controlador implements ActionListener{
	
	private Ventana_principal ventana_principal;
	private Habitaciones_agregar habitaciones_agregar;
	private Habitaciones_borrar habitaciones_borrar;
	private Habitaciones_listar habitaciones_listar;
	private Habitaciones_modificar habitaciones_modificar;
	private Disponibilidad_agregar disponibilidad_agregar;
	Calidad_habitacion calidad = new Calidad_habitacion();
	Habitacion habitacion = new Habitacion();
	Disponibilidad_de_habitacion disponibilidad = new Disponibilidad_de_habitacion();
	Disponibilidad_habitacion_negocio negDisponibilidad = new Disponibilidad_habitacion_negocioImpl();
	private HabitacionNegocio negHabitacion = new HabitacionNegocioImpl();
	private Calidad_habitacion_Negocio negCalidad = new Calidad_habitacion_NegocioImpl();
	ArrayList<Calidad_habitacion> listaCalidad = new ArrayList<Calidad_habitacion>();
	String mensaje = "";
	
	public controlador(Ventana_principal vista) {
		
		this.ventana_principal = vista;
		this.habitaciones_agregar = new Habitaciones_agregar();
		this.habitaciones_borrar = new Habitaciones_borrar();
		this.habitaciones_listar = new Habitaciones_listar();
		this.habitaciones_modificar = new Habitaciones_modificar();
		this.disponibilidad_agregar = new Disponibilidad_agregar();
		
		this.ventana_principal.getMntmAgregar_hab().addActionListener(a->EventoClickMenu_habitacion_agregar(a));
		this.ventana_principal.getMntmBorrar().addActionListener(a->EventoClickMenu_habitaciones_borrar(a));
		this.ventana_principal.getMntmListar().addActionListener(a->EventoClickMenu_habitaciones_listar(a));
		this.ventana_principal.getMntmModificar().addActionListener(a->EventoClickMenu_habitaciones_modificar(a));
		this.ventana_principal.getMntmAgregar_dis().addActionListener(a->EventoClickMenu_disponibilidad_agregar(a));
		
		this.habitaciones_agregar.getBtnAceptar().addActionListener(a->EventoClick_Agregar_Aceptar(a));
		this.habitaciones_modificar.getBtnAceptar().addActionListener(a->EventoClick_Modificar_Aceptar(a));
		this.habitaciones_borrar.getBtnBorrar().addActionListener(a->EventoClick_Borrar_Aceptar(a));
		this.disponibilidad_agregar.getBtnAgregar().addActionListener(a->EventoClick_Aceptar_AgregarDisponibilidad(a));
	}
	
	
	public void  EventoClickMenu_habitacion_agregar(ActionEvent a)
	{		
		
		listaCalidad = negCalidad.readAll();
		ventana_principal.getContentPane().removeAll();
		this.habitaciones_agregar.setCbCalidad(listaCalidad);
		ventana_principal.getContentPane().add(habitaciones_agregar);
		ventana_principal.getContentPane().repaint();
		ventana_principal.getContentPane().revalidate();
	}
	
	public void  EventoClickMenu_habitaciones_borrar(ActionEvent a)
	{		
		ventana_principal.getContentPane().removeAll();
		ventana_principal.getContentPane().add(habitaciones_borrar);
		ventana_principal.getContentPane().repaint();
		ventana_principal.getContentPane().revalidate();
	}
	
	public void  EventoClickMenu_habitaciones_listar(ActionEvent a)
	{		this.habitaciones_listar.refrescarTabla();
		ventana_principal.getContentPane().removeAll();
		ventana_principal.getContentPane().add(habitaciones_listar);
		ventana_principal.getContentPane().repaint();
		ventana_principal.getContentPane().revalidate();
	}
	
	public void  EventoClickMenu_habitaciones_modificar(ActionEvent a)
	{	listaCalidad = negCalidad.readAll();
		this.habitaciones_modificar.setComboBoxCalidad(listaCalidad);
		ventana_principal.getContentPane().removeAll();
		ventana_principal.getContentPane().add(habitaciones_modificar);
		ventana_principal.getContentPane().repaint();
		ventana_principal.getContentPane().revalidate();
	}
	
	public void  EventoClickMenu_disponibilidad_agregar(ActionEvent a)
	{	

		ventana_principal.getContentPane().removeAll();
		ventana_principal.getContentPane().add(disponibilidad_agregar);
		ventana_principal.getContentPane().repaint();
		ventana_principal.getContentPane().revalidate();
	}
	public void EventoClick_Agregar_Aceptar(ActionEvent a) {
		
		calidad = (Calidad_habitacion)this.habitaciones_agregar.getCbCalidad().getSelectedItem();
		String descripcion = this.habitaciones_agregar.getTextoDescripcion().getText();
		if(!descripcion.equals("")  || calidad.getId_calidad_habitacion().equals("") ) {
		habitacion.setDetalles(descripcion);
		habitacion.setId_calidad_habitacion(calidad.getId_calidad_habitacion());
		if(negHabitacion.insert(habitacion)>0) {
			mensaje = "Se agregó correctamente";
		}
		}else {
			mensaje = "Por favor, verifique los datos cargados.";
		}
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public void EventoClick_Modificar_Aceptar(ActionEvent a) {
		
	calidad = (Calidad_habitacion)this.habitaciones_modificar.getComboBoxCalidad().getSelectedItem();
	String descripcion = this.habitaciones_modificar.getTextDetalle().getText();
	if(!descripcion.equals("")  || calidad.getId_calidad_habitacion().equals("") ) {
	String id = this.habitaciones_modificar.getTextNroHabitacion().getText();
	
	habitacion.setId_habitacion(id);
	habitacion.setDetalles(descripcion);
	habitacion.setId_calidad_habitacion(calidad.getId_calidad_habitacion());
	
	if(negHabitacion.modify(habitacion)>0) {
		mensaje = "Se modificó correctamente";
	}else {
		mensaje = "Error al intentar modificar";
	}
	}
	else {
		mensaje = "Verifique los datos";
	}
	JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public void EventoClick_Borrar_Aceptar(ActionEvent a) {
		String id = this.habitaciones_borrar.getTextNroHabitacion().getText();
		if(id!= "") {
			if(negHabitacion.delete(id)>0) {
				mensaje = "Se eliminó correctamente";
			}else {
				mensaje = "Error al eliminar, verifique el ID.";
			}
		}
		else {
			mensaje = "Tiene que cargar el Id que desea eliminar.";
		}
		JOptionPane.showMessageDialog(null, mensaje);
	}
	public void EventoClick_Aceptar_AgregarDisponibilidad(ActionEvent a) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	

		if(!((disponibilidad_agregar.getFechaInicio().getDate() == null) ||
				(disponibilidad_agregar.getFechaFinal().getDate() == null) ||
				disponibilidad_agregar.getDetallesHabitacion().getText().equals("") || 
				disponibilidad_agregar.getNroHabitacion().getText().equals(""))) {
			
			String fechaInicio = sdf.format(disponibilidad_agregar.getFechaInicio().getDate());
			String fechaFinal = sdf.format(disponibilidad_agregar.getFechaFinal().getDate());
			String detalle = disponibilidad_agregar.getDetallesHabitacion().getText();
			String nroHabitacion = disponibilidad_agregar.getNroHabitacion().getText();
			
			disponibilidad.setFecha_inicio(fechaInicio);
			disponibilidad.setFecha_final(fechaFinal);
			disponibilidad.setDetalles(detalle);
			disponibilidad.setId_habitacion(nroHabitacion);			
			
			if(negDisponibilidad.insert(disponibilidad)>0) {
				mensaje = "Se agregó la disponibilidad correctamente";
			}else {
				mensaje = "Por favor, ingrese un número de habitación existente.";
			}
			
		}else {
			mensaje = "Por favor, complete todos los campos.";
		}
			
		JOptionPane.showMessageDialog(null, mensaje);	
		
	}
	public void inicializar()
	{
		this.ventana_principal.setVisible(true);;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
