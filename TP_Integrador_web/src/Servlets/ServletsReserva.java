package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entidades.Usuario;
//import Negocio.HabitacionNegocio;
//import NegocioImpl.HabitacionNegocioImpl;
//import Entidades.Disponibilidad_de_habitacion;

/**
 * Servlet implementation class ServletsReserva
 */
@WebServlet("/ServletsReserva")
public class ServletsReserva extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	//HabitacionNegocio HabNeg = new HabitacionNegocioImpl();
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
	    	    	
	    	
	    //	session.setAttribute("Disponibilidad", HabNeg.readAll());
	    	
			RequestDispatcher rd = request.getRequestDispatcher("/Reservar_habitacion.jsp");   
	        rd.forward(request, response); 
		}
	    
	    
	    
	}

}
