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

	JButton btnAceptar;
	JComboBox cbCalidad = new JComboBox();
	JLabel lblDescripcion;



	/**
	 * Create the panel.
	 */
	public Habitaciones_agregar() {
		setLayout(null);
		
		
		cbCalidad.setBounds(139, 69, 230, 20);
		add(cbCalidad);
		
		JLabel lblCalidadhabitacion = new JLabel("Calidad de habitaci\u00F3n");
		lblCalidadhabitacion.setBounds(10, 72, 129, 14);
		add(lblCalidadhabitacion);
		
		textoDescripcion = new JTextField();
		textoDescripcion.setBounds(139, 114, 230, 90);
		add(textoDescripcion);
		textoDescripcion.setColumns(10);
		
		lblDescripcion = new JLabel("Descripci\u00F3n");
		lblDescripcion.setBounds(57, 115, 101, 14);
		add(lblDescripcion);
		
		btnAceptar = new JButton("Agregar");
		btnAceptar.setBounds(175, 215, 89, 23);
		add(btnAceptar);
		
		JLabel lblAgregarHabitacion = new JLabel("Agregar habitaci\u00F3n");
		lblAgregarHabitacion.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAgregarHabitacion.setBackground(Color.BLACK);
		lblAgregarHabitacion.setBounds(155, 27, 138, 20);
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
			cbCalidad.addItem(calidad_habitacion);
		}
		
	}
	public JLabel getLblDescripcion() {
		return lblDescripcion;
	}

	public void setLblDescripcion(JLabel lblDescripcion) {
		this.lblDescripcion = lblDescripcion;
	}
	JTextField textoDescripcion;
	public JTextField getTextoDescripcion() {
		return textoDescripcion;
	}

	public void setTextoDescripcion(JTextField textoDescripcion) {
		this.textoDescripcion = textoDescripcion;
	}


}
