package Presentaciones;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class Habitaciones_agregar extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Habitaciones_agregar() {
		setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(150, 70, 28, 20);
		add(comboBox);
		
		JLabel lblCalidadhabitacion = new JLabel("Calidad_habitacion");
		lblCalidadhabitacion.setBounds(50, 70, 101, 14);
		add(lblCalidadhabitacion);
		
		textField = new JTextField();
		textField.setBounds(150, 113, 230, 90);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(50, 113, 101, 14);
		add(lblDescripcion);
		
		JButton btnAceptar = new JButton("Agrerar");
		btnAceptar.setBounds(150, 228, 89, 23);
		add(btnAceptar);
		
		JLabel lblAgregarHabitacion = new JLabel("Agregar habitacion");
		lblAgregarHabitacion.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAgregarHabitacion.setBackground(Color.BLACK);
		lblAgregarHabitacion.setBounds(150, 25, 138, 20);
		add(lblAgregarHabitacion);

	}
}
