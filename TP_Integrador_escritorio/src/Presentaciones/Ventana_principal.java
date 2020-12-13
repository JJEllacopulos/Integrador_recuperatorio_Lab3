package Presentaciones;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.MenuBar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana_principal extends JFrame {

	private JPanel contentPane;
	
	private JMenuBar menuBar;
	private JMenu mnHabitaciones;
	private JMenu mnDisponibilidad;
	private JMenuItem mntmAgregar_hab;
	private JMenuItem mntmModificar;
	private JMenuItem mntmBorrar;
	private JMenuItem mntmListar;
	private JMenuItem mntmAgregar_dis;
	
	public Ventana_principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnHabitaciones = new JMenu("Habitaciones");
		menuBar.add(mnHabitaciones);
		
		mntmAgregar_hab = new JMenuItem("Agregar");
		/*mntmAgregar_hab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				Habitaciones_agregar hab_agr = new Habitaciones_agregar();
				
				contentPane.add(hab_agr);
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});*/
		mnHabitaciones.add(mntmAgregar_hab);
		
		mntmModificar = new JMenuItem("Modificar");
		/*mntmModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				Habitaciones_modificar hab_mod = new Habitaciones_modificar();
				
				contentPane.add(hab_mod);
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});*/
		mnHabitaciones.add(mntmModificar);
		
		mntmBorrar = new JMenuItem("Borrar");
		/*mntmBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				Habitaciones_borrar hab_borrar = new Habitaciones_borrar();
				
				contentPane.add(hab_borrar);
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});*/
		mnHabitaciones.add(mntmBorrar);
		
		mntmListar = new JMenuItem("Listar");
		/*mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				Habitaciones_listar hab_listar = new Habitaciones_listar();
				
				contentPane.add(hab_listar);
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});*/
		mnHabitaciones.add(mntmListar);
		
		mnDisponibilidad = new JMenu("Disponibilidad");
		menuBar.add(mnDisponibilidad);
		
		mntmAgregar_dis = new JMenuItem("Agregar");
		/*mntmAgregar_dis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				Disponibilidad_agregar dis_agregar = new Disponibilidad_agregar();
				
				contentPane.add(dis_agregar);
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});*/
		mnDisponibilidad.add(mntmAgregar_dis);
		
		
		/*
		contentPane = new JPanel();
		contentPane.setBackground(Color.white);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		*/
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}

	public JMenu getMnHabitaciones() {
		return mnHabitaciones;
	}

	public void setMnHabitaciones(JMenu mnHabitaciones) {
		this.mnHabitaciones = mnHabitaciones;
	}

	public JMenu getMnDisponibilidad() {
		return mnDisponibilidad;
	}

	public void setMnDisponibilidad(JMenu mnDisponibilidad) {
		this.mnDisponibilidad = mnDisponibilidad;
	}

	public JMenuItem getMntmAgregar_hab() {
		return mntmAgregar_hab;
	}

	public void setMntmAgregar_hab(JMenuItem mntmAgregar_hab) {
		this.mntmAgregar_hab = mntmAgregar_hab;
	}

	public JMenuItem getMntmModificar() {
		return mntmModificar;
	}

	public void setMntmModificar(JMenuItem mntmModificar) {
		this.mntmModificar = mntmModificar;
	}

	public JMenuItem getMntmBorrar() {
		return mntmBorrar;
	}

	public void setMntmBorrar(JMenuItem mntmBorrar) {
		this.mntmBorrar = mntmBorrar;
	}

	public JMenuItem getMntmListar() {
		return mntmListar;
	}

	public void setMntmListar(JMenuItem mntmListar) {
		this.mntmListar = mntmListar;
	}

	public JMenuItem getMntmAgregar_dis() {
		return mntmAgregar_dis;
	}

	public void setMntmAgregar_dis(JMenuItem mntmAgregar_dis) {
		this.mntmAgregar_dis = mntmAgregar_dis;
	}

	
	
	
	
}
