package Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entidades.Calidad_habitacion;
import Entidades.Usuario;
import Negocio.Calidad_habitacion_Negocio;
import Negocio.HabitacionNegocio;
import NegocioImpl.Calidad_habitacion_NegocioImpl;
import NegocioImpl.HabitacionNegocioImpl;
//import Entidades.Disponibilidad_de_habitacion;

/**
 * Servlet implementation class ServletsReserva
 */
@WebServlet("/ServletsReserva")
public class ServletsReserva extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	HabitacionNegocio HabNeg = new HabitacionNegocioImpl();
	Calidad_habitacion_Negocio CalidadNeg = new Calidad_habitacion_NegocioImpl();
	ArrayList<Calidad_habitacion> CalHab = new ArrayList<Calidad_habitacion>();
	ArrayList<Calidad_habitacion> CalHab2 = new ArrayList<Calidad_habitacion>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletsReserva() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	    HttpSession session = request.getSession();
	    Usuario usuario = new Usuario();
	  //  Disponibilidad_de_habitacion dispo = new Disponibilidad_de_habitacion();
	    
	    if(request.getParameter("btnDisponibilidad")!=null) {
	    	 
	    	CalHab= CalidadNeg.readAll();
	    	request.setAttribute("CalidadHabitacion", CalHab);

	    	CalHab2 = CalidadNeg.ListarDispo(request.getParameter("txtFechaCheckIn"),request.getParameter("txtFechaCheckOut"),request.getParameter("ddl_Calidad_Habitacion"));
	    	 	    	
	    	String F1=request.getParameter("txtFechaCheckIn");
	    	String F2=request.getParameter("txtFechaCheckOut");
	    	
	    	request.setAttribute("Fecha1", F1 );
	    	request.setAttribute("Fecha2", F2 );
	    	
	    	request.setAttribute("Disponibilidad", CalHab2 );
	    	
	    	    	
			RequestDispatcher rd = request.getRequestDispatcher("/Reservar_habitacion.jsp");   
	        rd.forward(request, response); 
		}
	    
	    if(request.getParameter("btnCarga")!=null) {
	    	 
	    	CalHab= CalidadNeg.readAll();
	    	request.setAttribute("CalidadHabitacion", CalHab);

			RequestDispatcher rd = request.getRequestDispatcher("/Reservar_habitacion.jsp");   
	        rd.forward(request, response); 
		}
	    
	    if(request.getParameter("btn_SeleccionHabitacion")!=null) {
	    	 
	    	
		}
	    
	}

}
