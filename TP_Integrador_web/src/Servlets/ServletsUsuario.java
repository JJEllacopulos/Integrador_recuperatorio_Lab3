package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entidades.Usuario;
import Negocio.UsuarioNegocio;
import NegocioImpl.UsuarioNegocioImpl;

/**
 * Servlet implementation class ServletsUsuario
 */
@WebServlet("/ServletsUsuario")
public class ServletsUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsuarioNegocio negUsuario = new UsuarioNegocioImpl();
    Usuario usuario = new Usuario();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletsUsuario() {
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
		if(request.getParameter("btnAceptar")!=null) {
			String sexo;
			int filas = 0;
			
			if(Integer.parseInt(request.getParameter("ddlSexo"))==1) {
				sexo = "F";
			}
			else {sexo = "M";}
			
			usuario.setFecha_nacimiento(request.getParameter("txtFechaNacimiento")); 
			usuario.setSexo(sexo);
			usuario.setNombre_usuario(request.getParameter("txtUsuario"));
			usuario.setDni_usuario(request.getParameter("txtDni"));
	        usuario.setNombre_real(request.getParameter("txtNombre"));
	        usuario.setApellido_real(request.getParameter("txtApellido"));
	       	usuario.setContrasena_usuario(request.getParameter("txtPassword"));
	        usuario.setEstado(true);
	        usuario.setEmail(request.getParameter("txtEmail"));

	               
	       filas = negUsuario.insert(usuario);

	        request.setAttribute("filas", filas);
			RequestDispatcher rd = request.getRequestDispatcher("/Registrarse.jsp");   
	        rd.forward(request, response);   
			 
		}
		
	}

}
