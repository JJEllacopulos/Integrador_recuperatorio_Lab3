package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import Entidades.Calidad_habitacion;
import Entidades.Habitacion;
import Presentaciones.Disponibilidad_agregar;
import Presentaciones.Habitaciones_agregar;
import Presentaciones.Habitaciones_borrar;
import Presentaciones.Habitaciones_listar;
import Presentaciones.Habitaciones_modificar;
import Presentaciones.Ventana_principal;
import Main.Principal;
import negocio.Calidad_habitacion_Negocio;
import negocio.HabitacionNegocio;
import negocioImp.Calidad_habitacion_NegocioImpl;
import negocioImp.HabitacionNegocioImpl;


public class controlador implements ActionListener{
	
	private Ventana_principal ventana_principal;
	private Habitaciones_agregar habitaciones_agregar;
	private Habitaciones_borrar habitaciones_borrar;
	private Habitaciones_listar habitaciones_listar;
	private Habitaciones_modificar habitaciones_modificar;
	private Disponibilidad_agregar disponibilidad_agregar;
	private HabitacionNegocio negHabitacion = new HabitacionNegocioImpl();
	private Calidad_habitacion_Negocio negCalidad = new Calidad_habitacion_NegocioImpl();
	
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
	}
	
	
	public void  EventoClickMenu_habitacion_agregar(ActionEvent a)
	{		
		ArrayList<Calidad_habitacion> listaCalidad = new ArrayList<Calidad_habitacion>();
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
	{		
		ventana_principal.getContentPane().removeAll();
		ventana_principal.getContentPane().add(habitaciones_listar);
		ventana_principal.getContentPane().repaint();
		ventana_principal.getContentPane().revalidate();
	}
	
	public void  EventoClickMenu_habitaciones_modificar(ActionEvent a)
	{		
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
