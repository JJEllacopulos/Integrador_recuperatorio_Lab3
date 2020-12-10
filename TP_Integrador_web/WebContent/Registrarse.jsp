<%@page import="java.util.ArrayList"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="javax.servlet.RequestDispatcher"%>
<%@page import="Entidades.Usuario"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://code.jquery.com/jquery-3.1.1.min.js">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
 	
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

<title>Alta de cliente</title>

<style>

.formu{
	width:50%;
	  margin: auto;
	  margin-top:3px;
  display: block;
}
.centrar {
  margin: auto;
  display: block;
}
</style>
</head>
<body>



<% 


if(request.getAttribute("filas")!=null){
	

int filas = (int)request.getAttribute("filas");

	

if(filas > 0){%>
<div id="hola" class="alert alert-primary alert-dismissible fade show" role="alert">
  <strong>Hola!</strong> Se creó el usuario correctamente.
  <button type="button" class="close" data-dismiss="alert" aria-label="Close">
    <span aria-hidden="true">&times;</span>
  </button>
</div>
<% }}%>
<div class="container mt-5">

<h1 class="text-primary text-center">Registrarse</h1>
<form action="ServletsUsuario" method="post">
 <div class="form-row mt-4">

    <div class="col">
<% if(request.getAttribute("usuario")!=null){
	Usuario usuario = new Usuario();
	usuario = (Usuario)request.getAttribute("usuario");
%>	

    	      <input type="text" class="form-control formu" value="<%=usuario.getNombre_usuario()%>" name="txtUsuario" placeholder="Nombre de usuario" maxlength="20" title="Ingrese un usuario valido" required>
<%} %>    	
    </div>
    </div>
     <div class="form-row mt-4">

    <div class="col">

      <input type="password" class="form-control formu" name="txtPassword" placeholder="Contraseña" minlength="4" maxlength="20" title="Ingrese una contraseña valida" required>
    	
    </div>
    </div>
         <div class="form-row mt-4">

    <div class="col">

      <input type="email" class="form-control formu" name="txtEmail" placeholder="Email" required>
    	
    </div>
    </div>
    <div class="form-row mt-4">

    <div class="col">

      <input type="text" title="Ingrese un DNI valido "   class="form-control formu" name="txtDni" placeholder="Dni" pattern="[0-9]{6,8}" required>
    	
    </div>
    </div>
    
    <div class="form-row mt-4">

    <div class="col">

     <input type="text" class="form-control formu" name="txtApellido" placeholder="Apellido" title="Ingrese un apellido valido" pattern="[a-zA-Záéíóú,. '-]{2,49}" required>
    	
    </div>
    </div>    
    
     <div class="form-row mt-4">

    <div class="col">

     <input type="text" class="form-control formu" name="txtNombre" placeholder="Nombre" title="Ingrese un nombre valido" pattern="[a-zA-Záéíóú,. '-]{2,49}" required>
    	
    </div>
    </div>
    
  <div class="form-row mt-4">
    <div class="col">

		<select class="form-control formu" name="ddlSexo">
        <option selected>Seleccionar genero...</option>
        <option value=2>Masculino</option>
        <option value=1>Femenino</option>
     	 </select>    	
    </div>
    </div>

      <div class="form-row mt-4">

    <div class="col">

      <input type="text" class="form-control formu" placeholder="Seleccionar Fecha de nacimiento" onfocus="(this.type='date')" onblur="(this.type='text')" name="txtFechaNacimiento" required>
    	
    </div>
    </div>  

      <input type="submit"  class="btn btn-success mt-3 centrar" value="Confirmar" name="btnAceptar">
  
</form>

   <script>
   $('.alert').alert()

 </script>

</div>
</body>
</html>