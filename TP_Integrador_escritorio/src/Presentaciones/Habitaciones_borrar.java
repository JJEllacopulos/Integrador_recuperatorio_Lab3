package Presentaciones;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class Habitaciones_borrar extends JPanel {
	private JTextField textNroHabitacion;
	JButton btnBorrar;
	
	
	
	/**
	 * Create the panel.
	 */
	public Habitaciones_borrar() {
		setLayout(null);
		
		JLabel lblBorrarHabitacion = new JLabel("Borrar habitacion");
		lblBorrarHabitacion.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblBorrarHabitacion.setBounds(196, 31, 170, 14);
		add(lblBorrarHabitacion);
		
		JLabel lblHabitacion = new JLabel("Nro Habitacion");
		lblHabitacion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHabitacion.setBounds(111, 149, 90, 14);
		add(lblHabitacion);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(211, 197, 89, 23);
		add(btnBorrar);
		
		textNroHabitacion = new JTextField();
		textNroHabitacion.setBounds(211, 147, 97, 20);
		add(textNroHabitacion);
		textNroHabitacion.setColumns(10);
		
		

	}
	public JTextField getTextNroHabitacion() {
		return textNroHabitacion;
	}


	public void setTextNroHabitacion(JTextField textNroHabitacion) {
		this.textNroHabitacion = textNroHabitacion;
	}


	public JButton getBtnBorrar() {
		return btnBorrar;
	}


	public void setBtnBorrar(JButton btnBorrar) {
		this.btnBorrar = btnBorrar;
	}


}
