package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

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
    ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();
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
			String mensaje = "";
			boolean ingEmail = false;
			boolean ingUsuario = false;
			boolean ingDni = false;
			if(Integer.parseInt(request.getParameter("ddlSexo"))==1) {
				sexo = "F";
			}
			else {sexo = "M";}
			listaUsuario = negUsuario.Obtener_lista_usuarios();
			
			usuario.setFecha_nacimiento(request.getParameter("txtFechaNacimiento")); 
			usuario.setSexo(sexo);
			usuario.setNombre_usuario(request.getParameter("txtUsuario"));
			usuario.setDni_usuario(request.getParameter("txtDni"));
	        usuario.setNombre_real(request.getParameter("txtNombre"));
	        usuario.setApellido_real(request.getParameter("txtApellido"));
	       	usuario.setContrasena_usuario(request.getParameter("txtPassword"));
	        usuario.setEstado(true);
	        usuario.setEmail(request.getParameter("txtEmail"));
	        
	        
	        for (Usuario u : listaUsuario) {
				if(u.getNombre_usuario().equals(usuario.getNombre_usuario())) {
					ingUsuario = true;
				}
				if(u.getDni_usuario().equals(usuario.getDni_usuario())) {
					ingDni = true;
				}
				if(u.getEmail().equals(usuario.getEmail())) {
					ingEmail = true;
				}
			}
	        if(ingUsuario == false && ingDni == false && ingEmail == false)  {     
	       filas = negUsuario.insert(usuario);
	       request.setAttribute("filas", filas);
	        }else {
	        	mensaje = "Hay datos existentes. Por favor, si ya se encuentra registrado inicie sesión.";
	        	request.setAttribute("mensaje", mensaje);
	        }
	     
	        
			RequestDispatcher rd = request.getRequestDispatcher("/Registrarse.jsp");   
	        rd.forward(request, response);   
			 
		}
		
	}

}
