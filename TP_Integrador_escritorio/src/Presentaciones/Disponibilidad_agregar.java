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
		lblAgregarDisponivilidad.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblAgregarDisponivilidad.setBounds(194, 22, 178, 19);
		add(lblAgregarDisponivilidad);
		
		JLabel lblHabitacion = new JLabel("Nro Habitacion");
		lblHabitacion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHabitacion.setBounds(51, 74, 108, 14);
		add(lblHabitacion);
		
		JLabel lblFechaDeInicio = new JLabel("Fecha de inicio");
		lblFechaDeInicio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFechaDeInicio.setBounds(51, 113, 96, 14);
		add(lblFechaDeInicio);
		
		JLabel lblFechaDeFinal = new JLabel("Fecha de final");
		lblFechaDeFinal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFechaDeFinal.setBounds(51, 152, 96, 14);
		add(lblFechaDeFinal);
		
		JLabel lblDetalles = new JLabel("Detalles");
		lblDetalles.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDetalles.setBounds(71, 190, 61, 14);
		add(lblDetalles);
		
		detallesHabitacion = new JTextField();
		detallesHabitacion.setBounds(169, 190, 213, 59);
		add(detallesHabitacion);
		detallesHabitacion.setColumns(10);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(246, 277, 89, 23);
		add(btnAgregar);
		
		
		fechaInicio.setBounds(169, 113, 154, 20);
		add(fechaInicio);
		
		
		fechaFinal.setBounds(169, 152, 154, 20);
		add(fechaFinal);
		
		nroHabitacion = new JTextField();
		nroHabitacion.setBounds(169, 72, 86, 20);
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
