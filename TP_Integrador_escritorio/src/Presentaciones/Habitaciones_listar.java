package Presentaciones;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Entidades.Habitacion;
import negocio.HabitacionNegocio;
import negocioImp.HabitacionNegocioImpl;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;
import javax.swing.JTextField;

public class Habitaciones_listar extends JPanel {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private HabitacionNegocio hNeg = new HabitacionNegocioImpl();
		private ArrayList<Habitacion> habitacionEnTabla = new ArrayList<Habitacion>();	
		
		private JTable tablaHabitacion;

		public JTable getTablaPersonas() {
			return tablaHabitacion;
		}
		public void setTablaHabitacion(JTable tablaHabitacion) {
			this.tablaHabitacion = tablaHabitacion;
		}
		public DefaultTableModel getModelHabitacion() {
			return modelHabitacion;
		}
		public void setModelHabitacion(DefaultTableModel modelHabitacion) {
			this.modelHabitacion = modelHabitacion;
		}
		public String[] getNombreColumnas() {
			return nombreColumnas;
		}
		public void setNombreColumnas(String[] nombreColumnas) {
			this.nombreColumnas = nombreColumnas;
		}



		private DefaultTableModel modelHabitacion;
		private String[] nombreColumnas = {"N�mero","Detalle"};


			public Habitaciones_listar() {
				setLayout(null);
				
				JScrollPane spHabitacion = new JScrollPane();
				spHabitacion.setBounds(37, 76, 413, 163);
				this.add(spHabitacion);
			    
			    
				modelHabitacion = new DefaultTableModel(null,nombreColumnas);
				tablaHabitacion = new JTable(modelHabitacion);
				
				tablaHabitacion.getColumnModel().getColumn(0).setPreferredWidth(103);
				tablaHabitacion.getColumnModel().getColumn(0).setResizable(false);
				tablaHabitacion.getColumnModel().getColumn(1).setPreferredWidth(100);
				tablaHabitacion.getColumnModel().getColumn(1).setResizable(false);
				
				spHabitacion.setViewportView(tablaHabitacion);
				
				JLabel lblListaDeHabitaciones = new JLabel("Lista de habitaciones");
				lblListaDeHabitaciones.setFont(new Font("Times New Roman", Font.BOLD, 18));
				lblListaDeHabitaciones.setBounds(163, 23, 172, 14);
				add(lblListaDeHabitaciones);
				refrescarTabla();
					
			}
			
			public void refrescarTabla()
			{
				this.habitacionEnTabla = (ArrayList<Habitacion>) hNeg.readAll();
				llenarTabla(this.habitacionEnTabla);
			}

			public void llenarTabla(ArrayList<Habitacion> habitacionEnTabla) {
				this.getModelHabitacion().setRowCount(0); //Para vaciar la tabla
				this.getModelHabitacion().setColumnCount(0);
				this.getModelHabitacion().setColumnIdentifiers(this.getNombreColumnas());
				
				for (Habitacion h : habitacionEnTabla)
				{
					String detalles = h.getDetalles();
					String id = h.getId_habitacion();
					String idCalidad = h.getId_calidad_habitacion();
					Object[] fila = { id, detalles};
					this.getModelHabitacion().addRow(fila);
				
				}
				
			}
		}