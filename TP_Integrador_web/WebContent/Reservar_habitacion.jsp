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

<title>Reservar Habitacion</title>

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
	
<div class="form-row mt-5">
    <div class="col-6">
    <input type="text" class="form-control formu" placeholder="Seleccionar Fecha de Check-in" onfocus="(this.type='date')" onblur="(this.type='text')" name="txtFechaCheckIn" required>
  </div>
    <div class="col-6">
     <input type="text" class="form-control formu" placeholder="Seleccionar Fecha de Check-out" onfocus="(this.type='date')" onblur="(this.type='text')" name="txtFechaCheckOut" required>
  </div>
      </div>	
      
 <form action="ServletsReserva" method="post"> 
  <input type="submit"  class="btn btn-success mt-5 centrar" value="Buscar Disponibilidad" name="btnDisponibilidad">
 <%
	
	ArrayList<Habitacion> lista = new ArrayList<Habitacion>();
	

	lista = (ArrayList<Habitacion>)request.getAttribute("Disponibilidad");
	
	%>
 <div class="container">
<table class="table ">
  <thead class="thead-light">
    <tr>
    <th scope="col">Movimiento</th>
      <th scope="col">Fecha</th>
      <th scope="col">Monto</th>
 <%  int i=1;
 
 if(lista!=null){
		 for(Habitacion e : lista)
	{
 
%>     
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>HOLA1</td>
      <td>HOLA2</td>


         <td class="text-danger"><b>$<%= e.getId_habitacion() %></b></td>
    
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