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
		lblModificarHabitacion.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblModificarHabitacion.setBounds(221, 37, 206, 19);
		add(lblModificarHabitacion);
		
		
		comboBoxCalidad.setBounds(197, 110, 230, 20);
		add(comboBoxCalidad);
		
		JLabel lblCalidadhabitacion = new JLabel("Calidad habitacion");
		lblCalidadhabitacion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCalidadhabitacion.setBounds(60, 110, 117, 14);
		add(lblCalidadhabitacion);
		
		textDetalle = new JTextField();
		textDetalle.setBounds(197, 148, 230, 90);
		add(textDetalle);
		textDetalle.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDescripcion.setBounds(60, 155, 101, 14);
		add(lblDescripcion);
		
		btnAceptar = new JButton("Modificar");
		btnAceptar.setBounds(261, 249, 89, 23);
		add(btnAceptar);
		
		JLabel lblHabitacion = new JLabel("Nro de Habitacion");
		lblHabitacion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHabitacion.setBounds(60, 79, 123, 14);
		add(lblHabitacion);
		
		textNroHabitacion = new JTextField();
		textNroHabitacion.setBounds(197, 77, 86, 20);
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
