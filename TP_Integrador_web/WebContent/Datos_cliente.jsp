<%@page import="Entidades.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Datos de usuario</title>
<style>
.centrar {
  margin: auto;
  margin-top:5%;
	margin-left:40%;
  display: block;
ml-2
}
</style>
</head>
<body>

<jsp:include page="MenuCliente.jsp"></jsp:include>
<%
if((Usuario)session.getAttribute("userSession") != null){
	Usuario usuario = new Usuario();
	
	usuario = (Usuario)session.getAttribute("userSession");
	%>


	<div class="container centrar">
    <div class="row">
      <label class="text-dark fw-bold centrar">Nombre de usuario: </label><label class="text-success fw-bold centrar ml-2"><%= usuario.getNombre_usuario()%></label>
    </div>
    <div class="row">
         <label class="text-dark fw-bold centrar">Email: </label><label class="text-success fw-bold ml-2 centrar"><%= usuario.getEmail()%></label>
   
    </div>

    <div class="row">
       <label class="text-dark fw-bold centrar">Dni: </label><label class="text-success fw-bold ml-2 centrar"><%=usuario.getDni_usuario()%></label>
    
    </div>
    <div class="row">
<label class="text-dark fw-bold centrar">Apellido: </label><label class="text-success fw-bold ml-2 centrar"><%=usuario.getApellido_real()%></label>
			
    </div>

   <div class="row">
   <label class="text-dark fw-bold centrar">Nombre: </label><label class="text-success fw-bold ml-2 centrar"><%=usuario.getNombre_real()%></label>
   
    </div>
    <div class="row">
       <label class="text-dark fw-bold  centrar">Género: </label><label class="text-success fw-bold centrar ml-2"><%=usuario.getSexo()%></label>
   
   </div>
 
    <div class="row">
       <label class="text-dark fw-bold centrar">Fecha nacimiento: </label><label class="text-success fw-bold centrar ml-2"><%=usuario.getFecha_nacimiento()%></label>
    </div>
    

<%}%>
  </div>
</body>
</html>
