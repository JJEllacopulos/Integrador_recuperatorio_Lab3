package Presentaciones;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Habitaciones_modificar extends JPanel {

	/**
	 * Create the panel.
	 */
	private JTextField textField;
	
	public Habitaciones_modificar() {
		
		setLayout(null);
		
		JLabel lblModificarHabitacion = new JLabel("Modificar habitacion");
		lblModificarHabitacion.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblModificarHabitacion.setBounds(150, 25, 146, 19);
		add(lblModificarHabitacion);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(150, 107, 28, 20);
		add(comboBox);
		
		JLabel lblCalidadhabitacion = new JLabel("Calidad_habitacion");
		lblCalidadhabitacion.setBounds(50, 110, 101, 14);
		add(lblCalidadhabitacion);
		
		textField = new JTextField();
		textField.setBounds(150, 154, 230, 90);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(50, 154, 101, 14);
		add(lblDescripcion);
		
		JButton btnAceptar = new JButton("Modificar");
		btnAceptar.setBounds(150, 266, 89, 23);
		add(btnAceptar);
		
		JLabel lblHabitacion = new JLabel("Habitacion");
		lblHabitacion.setBounds(50, 70, 70, 14);
		add(lblHabitacion);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(150, 70, 28, 20);
		add(comboBox_1);
		
		JLabel lblAgregarHabitacion = new JLabel("Agregar habitacion");
		
	}

}
