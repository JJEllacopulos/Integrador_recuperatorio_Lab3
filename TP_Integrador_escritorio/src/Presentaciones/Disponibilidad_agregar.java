package Presentaciones;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;

public class Disponibilidad_agregar extends JPanel {
	private JTextField detallesHabitacion;
	private JTextField nroHabitacion;
	JButton btnAgregar;
	JDateChooser fechaInicio = new JDateChooser();
	JDateChooser fechaFinal = new JDateChooser();
	/**
	 * Create the panel.
	 */
	public Disponibilidad_agregar() {
		setLayout(null);
		
		JLabel lblAgregarDisponivilidad = new JLabel("Agregar disponibilidad");
		lblAgregarDisponivilidad.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAgregarDisponivilidad.setBounds(150, 25, 156, 19);
		add(lblAgregarDisponivilidad);
		
		JLabel lblHabitacion = new JLabel("Nro Habitacion");
		lblHabitacion.setBounds(23, 70, 108, 14);
		add(lblHabitacion);
		
		JLabel lblFechaDeInicio = new JLabel("Fecha de inicio");
		lblFechaDeInicio.setBounds(35, 113, 96, 14);
		add(lblFechaDeInicio);
		
		JLabel lblFechaDeFinal = new JLabel("Fecha de final");
		lblFechaDeFinal.setBounds(35, 152, 96, 14);
		add(lblFechaDeFinal);
		
		JLabel lblDetalles = new JLabel("Detalles");
		lblDetalles.setBounds(35, 190, 61, 14);
		add(lblDetalles);
		
		detallesHabitacion = new JTextField();
		detallesHabitacion.setBounds(149, 187, 213, 59);
		add(detallesHabitacion);
		detallesHabitacion.setColumns(10);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(217, 257, 89, 23);
		add(btnAgregar);
		
		
		fechaInicio.setBounds(152, 113, 154, 20);
		add(fechaInicio);
		
		
		fechaFinal.setBounds(152, 152, 154, 20);
		add(fechaFinal);
		
		nroHabitacion = new JTextField();
		nroHabitacion.setBounds(153, 67, 86, 20);
		add(nroHabitacion);
		nroHabitacion.setColumns(10);
		
		

	}
	public JTextField getDetallesHabitacion() {
		return detallesHabitacion;
	}
	public void setDetallesHabitacion(JTextField detallesHabitacion) {
		this.detallesHabitacion = detallesHabitacion;
	}
	public JTextField getNroHabitacion() {
		return nroHabitacion;
	}
	public void setNroHabitacion(JTextField nroHabitacion) {
		this.nroHabitacion = nroHabitacion;
	}
	public JButton getBtnAgregar() {
		return btnAgregar;
	}
	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}
	public JDateChooser getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(JDateChooser fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public JDateChooser getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(JDateChooser fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
}
