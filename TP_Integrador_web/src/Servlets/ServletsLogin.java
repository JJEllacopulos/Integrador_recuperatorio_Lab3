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
import Negocio.UsuarioNegocio;
import NegocioImpl.UsuarioNegocioImpl;

/**
 * Servlet implementation class ServletsLogin
 */
@WebServlet("/ServletsLogin")
public class ServletsLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsuarioNegocio negUsuario = new UsuarioNegocioImpl();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletsLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		if(request.getParameter("btnRegistrarse")!=null) {
			RequestDispatcher rd = request.getRequestDispatcher("/Registrarse.jsp");   
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

		if(request.getParameter("btnRegistrarse")!=null) {
			RequestDispatcher rd = request.getRequestDispatcher("/Registrarse.jsp");   
	        rd.forward(request, response); 
		}	
					
		if(request.getParameter("btnAceptar")!=null){
			RequestDispatcher rd = request.getRequestDispatcher("/Registrarse.jsp");   
			String usuarioNombre = request.getParameter("txtNombreUsuario");
			String password = request.getParameter("txtPassword");
			usuario = negUsuario.Obtener_usuario(usuarioNombre);
			String mensajeError = "";

		
		if(usuario.getContrasena_usuario()!=null) {
			if(usuario.getContrasena_usuario().equals(password)) {
					
				
					session.setAttribute("userSession", usuario);
					rd = request.getRequestDispatcher("/Inicio.jsp");
				
				}
			else {	
			    mensajeError = "Contraseña invalida, vuelva a intentar.";
				rd = request.getRequestDispatcher("/Login.jsp");

					}
		}else {		
			
			mensajeError = "El nombre de usuario no existe, ingese uno correcto.";
			rd = request.getRequestDispatcher("/Login.jsp");	
					
				}
				request.setAttribute("mensajeError", mensajeError);
				rd.forward(request, response);		
				}
	
	
}
	}
