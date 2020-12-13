package Main;

import java.awt.EventQueue;

import Presentaciones.Ventana_principal;
import controlador.controlador;


public class Principal {
	
	public static void main(String[] args) {
		
		Ventana_principal vista = new Ventana_principal();
		controlador controlador = new controlador(vista);
		controlador.inicializar();
		
	}
	
}
