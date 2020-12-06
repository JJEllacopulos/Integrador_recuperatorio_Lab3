package Presentaciones;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;

public class Habitaciones_listar extends JPanel {

	/**
	 * Create the panel.
	 */
	public Habitaciones_listar() {
		setLayout(null);
		
		JLabel lblListarHabitaciones = new JLabel("Listar habitaciones");
		lblListarHabitaciones.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblListarHabitaciones.setBounds(150, 25, 132, 14);
		add(lblListarHabitaciones);
		
		JList list = new JList();
		list.setBounds(40, 60, 335, 198);
		add(list);

	}
}
