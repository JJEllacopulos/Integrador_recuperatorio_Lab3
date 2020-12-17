package Servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entidades.Calidad_habitacion;
import Entidades.Disponibilidad_de_habitacion;
import Entidades.Usuario;
import Negocio.Calidad_habitacion_Negocio;
import Negocio.HabitacionNegocio;
import Negocio.Disponibilidad_habitacion_Negocio;
import NegocioImpl.Disponibilidad_habitacion_NegocioImpl;
import NegocioImpl.Calidad_habitacion_NegocioImpl;
import NegocioImpl.HabitacionNegocioImpl;


/**
 * Servlet implementation class ServletsReserva
 */
@WebServlet("/ServletsReserva")
public class ServletsReserva extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Date Hoy = java.sql.Date.valueOf("2020-12-17");  
	HabitacionNegocio HabNeg = new HabitacionNegocioImpl();
	Calidad_habitacion_Negocio CalidadNeg = new Calidad_habitacion_NegocioImpl();
	ArrayList<Calidad_habitacion> CalHab = new ArrayList<Calidad_habitacion>();
	ArrayList<Calidad_habitacion> CalHab2 = new ArrayList<Calidad_habitacion>();
	Disponibilidad_habitacion_Negocio dispoNeg = new Disponibilidad_habitacion_NegocioImpl();
	ArrayList<Disponibilidad_de_habitacion> MisRes = new ArrayList<Disponibilidad_de_habitacion>();
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
		Usuario usuario = new Usuario();
		HttpSession session = request.getSession();
		
	    if(request.getParameter("link_1")!=null) {
	    	
	    	CalHab= CalidadNeg.readAll();
	    	request.setAttribute("CalidadHabitacion", CalHab);

			RequestDispatcher rd = request.getRequestDispatcher("/Reservar_habitacion.jsp");   
	        rd.forward(request, response); 
		}
	    
	    	if(request.getParameter("link_2")!=null) {
	    		
	    		usuario= (Usuario)session.getAttribute("userSession");
	    		
	    		MisRes = dispoNeg.MisRes(usuario.getNombre_usuario());
	    		request.setAttribute("MisReservas", MisRes);
	    		
			RequestDispatcher rd = request.getRequestDispatcher("/MisReservas.jsp");   
	        rd.forward(request, response); 
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	    HttpSession session = request.getSession();
	    Usuario usuario = new Usuario();
	    Disponibilidad_de_habitacion dispo = new Disponibilidad_de_habitacion();
	    Disponibilidad_habitacion_Negocio NegDispo = new Disponibilidad_habitacion_NegocioImpl();
	    
	    if(request.getParameter("btnDisponibilidad")!=null) {
	    	 
	    	CalHab= CalidadNeg.readAll();
	    	request.setAttribute("CalidadHabitacion", CalHab);
	    	 	    	
	    	String F1=request.getParameter("txtFechaCheckIn");
	    	String F2=request.getParameter("txtFechaCheckOut");
	    	
	    	Date fecha1 = java.sql.Date.valueOf(F1);
	    	Date fecha2 = java.sql.Date.valueOf(F2);
	    	

	    	if (fecha1.before(fecha2) && fecha1.after(Hoy) ) {
	    		
	        CalHab2 = CalidadNeg.ListarDispo(request.getParameter("txtFechaCheckIn"),request.getParameter("txtFechaCheckOut"),request.getParameter("ddl_Calidad_Habitacion"));	    	
	    	request.setAttribute("Disponibilidad", CalHab2 );
	    	
	    	}
	    		    	
	    	request.setAttribute("Fecha1", F1 );
	    	request.setAttribute("Fecha2", F2 );
	    	
			RequestDispatcher rd = request.getRequestDispatcher("/Reservar_habitacion.jsp");   
	        rd.forward(request, response); 
		}
	    

	    if(request.getParameter("btn_SeleccionHabitacion")!=null) {
	    	 	    		    	
	    	String F1=request.getParameter("Fecha1");
	    	String F2=request.getParameter("Fecha2");	    	

	    	usuario= (Usuario)session.getAttribute("userSession");
	    	
	    	dispo.setId_habitacion(Integer.parseInt(request.getParameter("id_hab")));
	    	dispo.setFecha_inicio(F1);
	    	dispo.setFecha_final(F2);
	    	dispo.setNombre_usuario(usuario.getNombre_usuario());
	    	dispo.setDetalles("Reserva");
	    	
	    	NegDispo.insert(dispo);
	    		    	
	    	RequestDispatcher rd = request.getRequestDispatcher("/MisReservas.jsp");   
	        rd.forward(request, response); 
	    	
		}
	    
	}

}
