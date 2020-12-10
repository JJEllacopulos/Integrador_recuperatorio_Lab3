package Presentaciones;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

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
	
	public Ventana_principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnHabitaciones = new JMenu("Habitaciones");
		menuBar.add(mnHabitaciones);
		
		JMenuItem mntmAgregar = new JMenuItem("Agregar");
		mntmAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				Habitaciones_agregar hab_agr = new Habitaciones_agregar();
				
				contentPane.add(hab_agr);
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});
		mnHabitaciones.add(mntmAgregar);
		
		JMenuItem mntmModificar = new JMenuItem("Modificar");
		mntmModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				Habitaciones_modificar hab_mod = new Habitaciones_modificar();
				
				contentPane.add(hab_mod);
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});
		mnHabitaciones.add(mntmModificar);
		
		JMenuItem mntmBorrar = new JMenuItem("Borrar");
		mntmBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				Habitaciones_borrar hab_borrar = new Habitaciones_borrar();
				
				contentPane.add(hab_borrar);
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});
		mnHabitaciones.add(mntmBorrar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				Habitaciones_listar hab_listar = new Habitaciones_listar();
				
				contentPane.add(hab_listar);
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});
		mnHabitaciones.add(mntmListar);
		
		JMenu mnDisponibilidad = new JMenu("Disponibilidad");
		menuBar.add(mnDisponibilidad);
		
		JMenuItem mntmAgregar_1 = new JMenuItem("Agregar");
		mntmAgregar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				Disponibilidad_agregar dis_agregar = new Disponibilidad_agregar();
				
				contentPane.add(dis_agregar);
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});
		mnDisponibilidad.add(mntmAgregar_1);
		
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.white);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
