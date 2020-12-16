package Presentaciones;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Entidades.Calidad_habitacion;

public class Habitaciones_modificar extends JPanel {

	/**
	 * Create the panel.
	 */
	
	
	JButton btnAceptar;
	JComboBox comboBoxCalidad = new JComboBox();
	JTextField textNroHabitacion = new JTextField();
	public Habitaciones_modificar() {
		
		setLayout(null);
		
		JLabel lblModificarHabitacion = new JLabel("Modificar habitacion");
		lblModificarHabitacion.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblModificarHabitacion.setBounds(150, 25, 146, 19);
		add(lblModificarHabitacion);
		
		
		comboBoxCalidad.setBounds(150, 107, 230, 20);
		add(comboBoxCalidad);
		
		JLabel lblCalidadhabitacion = new JLabel("Calidad habitacion");
		lblCalidadhabitacion.setBounds(23, 110, 117, 14);
		add(lblCalidadhabitacion);
		
		textDetalle = new JTextField();
		textDetalle.setBounds(150, 154, 230, 90);
		add(textDetalle);
		textDetalle.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(39, 155, 101, 14);
		add(lblDescripcion);
		
		btnAceptar = new JButton("Modificar");
		btnAceptar.setBounds(225, 255, 89, 23);
		add(btnAceptar);
		
		JLabel lblHabitacion = new JLabel("Nro de Habitacion");
		lblHabitacion.setBounds(39, 70, 101, 14);
		add(lblHabitacion);
		
		textNroHabitacion = new JTextField();
		textNroHabitacion.setBounds(150, 67, 86, 20);
		add(textNroHabitacion);
		textNroHabitacion.setColumns(10);
		
		JLabel lblAgregarHabitacion = new JLabel("Agregar habitacion");
		
	}
	private JTextField textDetalle;
	public JTextField getTextDetalle() {
		return textDetalle;
	}
	public void setTextDetalle(JTextField textDetalle) {
		this.textDetalle = textDetalle;
	}
	
	public JTextField getTextNroHabitacion() {
		return textNroHabitacion;
	}
	public void setTextNroHabitacion(JTextField textNroHabitacion) {
		this.textNroHabitacion = textNroHabitacion;
	}
	public JButton getBtnAceptar() {
		return btnAceptar;
	}
	public void setBtnAceptar(JButton btnAceptar) {
		this.btnAceptar = btnAceptar;
	}
	public JComboBox getComboBoxCalidad() {
		return comboBoxCalidad;
	}
	public void setComboBoxCalidad(ArrayList<Calidad_habitacion> listaCalidad) {
		for (Calidad_habitacion calidad_habitacion : listaCalidad) {
			comboBoxCalidad.addItem(calidad_habitacion);
		}
	}
}
