<%@page import="java.util.ArrayList"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="javax.servlet.RequestDispatcher"%>
<%@page import="Entidades.Disponibilidad_de_habitacion"%>
<%@page import="Entidades.Habitacion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://code.jquery.com/jquery-3.1.1.min.js">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
 	
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

<title>Mis Resvas</title>

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
.table
 	{
 	margin: 50px;
 	}
</style>
</head>


<body>

<jsp:include page="MenuCliente.jsp"></jsp:include>

	<form action="ServletsReserva" method="post">
	
 <div class="container">
<div class="form-row mt-4">
  
 <%
	
	ArrayList<Disponibilidad_de_habitacion> lista1 = new ArrayList<Disponibilidad_de_habitacion>();
	

	lista1 = (ArrayList<Disponibilidad_de_habitacion>)request.getAttribute("MisReservas");
	
	%>
 <div class="container">
<table class="table ">
  <thead class="thead-light">
    <tr>
    <th scope="col">Habitacion</th>
      <th scope="col">Tipo</th>
      <th scope="col">Detalles</th>
      <th scope="col">Check-in</th>
      <th scope="col">Check-out</th>
 <%  
 
 if(lista1!=null){
		 for(Disponibilidad_de_habitacion e : lista1)
	{
 
%>     
    </tr>
  </thead>
  <tbody>
    <tr>
      <td class="text"><b><%= e.getId_habitacion() %> <input type="hidden" name="id_hab" value="<%= e.getId_habitacion() %>"></b></td>
      <td class="text"><b><%= e.getNombre_usuario() %></b></td>
      <td class="text"><b><%= e.getDetalles() %></b></td>
      <td class="text"><b><%= e.getFecha_inicio() %></b></td>
       <td class="text"><b><%= e.getFecha_final() %></b></td>
      <td></td> 
    </tr>

     <% } }%>
  </tbody>
</table>


   <script>
   $('.alert').alert()

 </script>
</div>
 </form>
  
</body>
</html>