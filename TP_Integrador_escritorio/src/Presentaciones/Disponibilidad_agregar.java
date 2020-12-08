package Presentaciones;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Disponibilidad_agregar extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Disponibilidad_agregar() {
		setLayout(null);
		
		JLabel lblAgregarDisponivilidad = new JLabel("Agregar disponivilidad");
		lblAgregarDisponivilidad.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAgregarDisponivilidad.setBounds(150, 25, 156, 19);
		add(lblAgregarDisponivilidad);
		
		JLabel lblHabitacion = new JLabel("Habitacion");
		lblHabitacion.setBounds(50, 70, 69, 14);
		add(lblHabitacion);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(150, 70, 28, 20);
		add(comboBox);
		
		JLabel lblFechaDeInicio = new JLabel("Fecha de inicio");
		lblFechaDeInicio.setBounds(50, 113, 81, 14);
		add(lblFechaDeInicio);
		
		JLabel lblFechaDeFinal = new JLabel("Fecha de final");
		lblFechaDeFinal.setBounds(50, 152, 81, 14);
		add(lblFechaDeFinal);
		
		JComboBox cb_dia_inicio = new JComboBox();
		cb_dia_inicio.setBounds(150, 110, 28, 20);
		add(cb_dia_inicio);
		
		JComboBox cb_mes_inicio = new JComboBox();
		cb_mes_inicio.setBounds(207, 110, 28, 20);
		add(cb_mes_inicio);
		
		JComboBox cb_ano_inicio = new JComboBox();
		cb_ano_inicio.setBounds(259, 110, 28, 20);
		add(cb_ano_inicio);
		
		JComboBox cb_dia_final = new JComboBox();
		cb_dia_final.setBounds(150, 149, 28, 20);
		add(cb_dia_final);
		
		JComboBox cb_mes_final = new JComboBox();
		cb_mes_final.setBounds(207, 149, 28, 20);
		add(cb_mes_final);
		
		JComboBox cb_ano_final = new JComboBox();
		cb_ano_final.setBounds(259, 149, 28, 20);
		add(cb_ano_final);
		
		JLabel lblDetalles = new JLabel("Detalles");
		lblDetalles.setBounds(50, 190, 46, 14);
		add(lblDetalles);
		
		textField = new JTextField();
		textField.setBounds(149, 187, 213, 59);
		add(textField);
		textField.setColumns(10);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(150, 266, 89, 23);
		add(btnAgregar);

	}

}
