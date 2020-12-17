<%@page import="Entidades.Usuario"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="javax.servlet.RequestDispatcher"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.margen{
margin-left: 42%;
}
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu</title>
</head>
<body>
<% 
Usuario usuario = new Usuario();
if((Usuario)session.getAttribute("userSession") == null){
	
	RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");   
    rd.forward(request, response); 

}else
{
	usuario = (Usuario)session.getAttribute("userSession");


%>
 
<nav class="navbar navbar-expand-lg navbar-light bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand text-light" href="#">TuReserva.com</a>
          
          <a class="nav-link active text-light ml-5" aria-current="page" href="#">Usuario: <b><%=usuario.getNombre_usuario() %></b></a>
     
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav margen">
         <li class="nav-item">
          <a class="nav-link active text-light" aria-current="page" href="#">Inicio</a>
        </li>
         <li class="nav-item">
          <a class="nav-link text-light" href="ServletsReserva?link_1=1">Reservar habitación</a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-light" href="ServletsReserva?link_2=1">Mis Reservas</a>
        </li>
           <li class="nav-item">
          <a class="nav-link text-light" href="#">Mis datos</a>
        </li>
             <li class="nav-item">
          <a class="nav-link text-light" href="#">Cerrar sesión</a>
        </li>
      </ul>
    </div>
    <%}%>
  </div>
</nav>
</body>
</html>