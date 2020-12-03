package Presentaciones;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

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
		mnHabitaciones.add(mntmAgregar);
		
		JMenuItem mntmModificar = new JMenuItem("Modificar");
		mnHabitaciones.add(mntmModificar);
		
		JMenuItem mntmBorrar = new JMenuItem("Borrar");
		mnHabitaciones.add(mntmBorrar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mnHabitaciones.add(mntmListar);
		
		JMenu mnDisponibilidad = new JMenu("Disponibilidad");
		menuBar.add(mnDisponibilidad);
		
		JMenuItem mntmAgregar_1 = new JMenuItem("Agregar");
		mnDisponibilidad.add(mntmAgregar_1);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
