<%@page import="java.util.ArrayList"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="javax.servlet.RequestDispatcher"%>
<%@page import="Entidades.Calidad_habitacion"%>
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
	<form action="ServletsReserva" method="post">
<div class="form-row mt-4">
    <div class="col-8">
    <%if (request.getAttribute("Fecha1")!=null ) { %>
    
 <h6>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Check-in:</h6>
 <input type="text" class="form-control formu" value="<%=request.getAttribute("Fecha1")%>" placeholder="<%=request.getAttribute("Fecha1")%>" onfocus="(this.type='date')" onblur="(this.type='text')" name="txtFechaCheckIn" required>
    
     <input type="hidden" class="form-control" value="<%=request.getAttribute("Fecha1")%>" name="Fecha1" >
    <%} 
    else {%>
   <h6>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Check-in:</h6> 
   <input type="text" class="form-control formu" placeholder="Seleccionar Fecha de Check-in" onfocus="(this.type='date')" onblur="(this.type='text')" name="txtFechaCheckIn" required>
    <%} %>
  </div>
    
  <div class="col-3">
  <h6>Tipo Habitacion:</h6>
   <select name="ddl_Calidad_Habitacion" class="form-control">

	 <%
	 ArrayList<Calidad_habitacion> lista = new ArrayList<Calidad_habitacion>();
		lista = (ArrayList<Calidad_habitacion>)request.getAttribute("CalidadHabitacion");
		
		 if(lista!=null)
			 for(Calidad_habitacion e : lista)
			{	
	%>	
	<option value="<%=e.getNombre() %>"><%=e.getNombre()%></option>
		<% } %>
		
		
		</select>
		 </div>
		 <div class="col-8">
		 <%if (request.getAttribute("Fecha2")!=null ) { %>	
		 <h6>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Check-Out:</h6>
		 <input type="text" class="form-control formu" value="<%=request.getAttribute("Fecha2")%>" placeholder="<%=request.getAttribute("Fecha2")%>" onfocus="(this.type='date')" onblur="(this.type='text')" name="txtFechaCheckOut" required >
    	
		 <input type="hidden" class="form-control" value="<%=request.getAttribute("Fecha2")%>" name="Fecha2" >
    <%} 
		 else{%>
    <h6>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Check-Out:</h6> 
    <input type="text" class="form-control formu" placeholder="Seleccionar Fecha de Check-out" onfocus="(this.type='date')" onblur="(this.type='text')" name="txtFechaCheckOut" required >
     <%} %>
  </div>
      </div>	
      <input type="submit"  class="btn btn-danger mt-5 centrar" value="Cargar" name="btnCarga">
   <input type="submit"  class="btn btn-success mt-5 centrar" value="Buscar Disponibilidad" name="btnDisponibilidad">
 <%
	
	ArrayList<Calidad_habitacion> lista1 = new ArrayList<Calidad_habitacion>();
	

	lista1 = (ArrayList<Calidad_habitacion>)request.getAttribute("Disponibilidad");
	
	%>
 <div class="container">
<table class="table ">
  <thead class="thead-light">
    <tr>
    <th scope="col">Habitacion</th>
      <th scope="col">Tipo</th>
      <th scope="col">Detalles</th>
 <%  
 
 if(lista1!=null){
		 for(Calidad_habitacion e : lista1)
	{
 
%>     
    </tr>
  </thead>
  <tbody>
    <tr>
      <td class="text"><b><%= e.getId_calidad_habitacion() %></b></td>
      <td class="text"><b><%= e.getNombre() %></b></td>
       <td class="text"><b><%= e.getDetalles() %></b></td>
    <td> <button type="submit" class="btn btn-primary btnDD" name="btn_SeleccionHabitacion" >Reservar</button> </td>
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