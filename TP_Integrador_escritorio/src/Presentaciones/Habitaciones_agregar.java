package Presentaciones;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Entidades.Calidad_habitacion;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

public class Habitaciones_agregar extends JPanel {
	private JTextField textField;
	JButton btnAceptar;
	JComboBox cbCalidad = new JComboBox();



	/**
	 * Create the panel.
	 */
	public Habitaciones_agregar() {
		setLayout(null);
		
		
		cbCalidad.setBounds(150, 70, 230, 20);
		add(cbCalidad);
		
		JLabel lblCalidadhabitacion = new JLabel("Calidad de habitacion");
		lblCalidadhabitacion.setBounds(50, 70, 101, 14);
		add(lblCalidadhabitacion);
		
		textField = new JTextField();
		textField.setBounds(150, 113, 230, 90);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(50, 113, 101, 14);
		add(lblDescripcion);
		
		btnAceptar = new JButton("Agregar");
		btnAceptar.setBounds(150, 228, 89, 23);
		add(btnAceptar);
		
		JLabel lblAgregarHabitacion = new JLabel("Agregar habitacion");
		lblAgregarHabitacion.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAgregarHabitacion.setBackground(Color.BLACK);
		lblAgregarHabitacion.setBounds(150, 25, 138, 20);
		add(lblAgregarHabitacion);

	}

	public JButton getBtnAceptar() {
		return btnAceptar;
	}
	public JComboBox getCbCalidad() {
		return cbCalidad;
	}

	public void setCbCalidad(ArrayList<Calidad_habitacion> listaCalidad) {
		for (Calidad_habitacion calidad_habitacion : listaCalidad) {
			cbCalidad.addItem(calidad_habitacion.getNombre());
		}
		
	}
}
