
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu principal</title>
</head>
<body>
<jsp:include page="Barra_inicio.jsp"></jsp:include>


    <div class="container Concreto ">        
    <div class="jumbotron Presentacion">
        <h1 class=" text-light">¡Hola!</h1>
        <p class="lead text-light">¡Estás a pocos clicks de reservar tu habitación! Registrate o iniciá sesión si ya tenés tu cuenta.</p>
        <p>
            <a href="Login.jsp" class="btn btn-primary btn-lg">Iniciar Sesión &raquo;</a>
            <a href="ServletsLogin?btnRegistrarse=1"  class="btn btn-info btn-lg">Registrarse &raquo;</a>
        </p>
        
        </div>
        </div>

<script>

</script>
</body>
</html>