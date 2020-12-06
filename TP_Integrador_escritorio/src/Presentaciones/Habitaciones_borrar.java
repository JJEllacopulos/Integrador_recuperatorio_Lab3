package Presentaciones;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class Habitaciones_borrar extends JPanel {
	
	
	
	/**
	 * Create the panel.
	 */
	public Habitaciones_borrar() {
		setLayout(null);
		
		JLabel lblBorrarHabitacion = new JLabel("Borrar habitacion");
		lblBorrarHabitacion.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblBorrarHabitacion.setBounds(150, 25, 127, 14);
		add(lblBorrarHabitacion);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(150, 70, 28, 20);
		add(comboBox);
		
		JLabel lblHabitacion = new JLabel("Habitacion");
		lblHabitacion.setBounds(50, 70, 90, 14);
		add(lblHabitacion);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(150, 119, 89, 23);
		add(btnBorrar);
		
		

	}

}
