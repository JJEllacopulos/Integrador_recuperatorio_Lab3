<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu cliente</title>
<style>
.margen{
margin-left: 70%;
}
    .jumbotron {
      padding: 4rem 2rem;
      margin-bottom: 2rem;
      background-color: var(--bs-light);
      border-radius: .3rem;  
    }
    .Presentacion{
        /*margin-left:10%;
   margin-right: 100px;*/
   		margin-top:100px;
       background-color:#1D043B;
       border-radius: 15px;
       
    }
</style>
</head>
<body>
<jsp:include page="MenuCliente.jsp"></jsp:include>
    <div class="container Concreto ">        
    <div class="jumbotron Presentacion">
        <h1 class=" text-light">¡Hola!</h1>
        <p class="lead text-light">A continuación podrás reservar habitaciones y visualizar tus datos.</p>
        <p>
            <a href="ServletsReserva?link_1=1" class="btn btn-success btn-lg">Reservar habitación&raquo;</a>
            <a href="ServletsReserva?btnVerReservas=1"  class="btn btn-info btn-lg">Ver reservas &raquo;</a>
            <a href="ServletsUsuario?btnVerDatos=1"  class="btn btn-primary btn-lg">Mis datos &raquo;</a>
            <a href="ServletsLogin?btnCerrarSesion=1"  class="btn btn-danger btn-lg">Cerrar sesión &raquo;</a>
        </p>
        
        </div>
        </div>
</body>
</html>