<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Barra</title>
<style>
.margen{
margin-left: 70%;
}
</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand text-light" href="#">TuReserva.com</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav margen">
       
           <li class="nav-item">
          <a href="Login.jsp"class="nav-link text-light" href="#">Iniciar Sesión</a>
        </li>
             <li class="nav-item">
          <a class="nav-link text-light" href="ServletsLogin?btnRegistrarse=1">Registrarse</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
</body>
</html>