<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.model.Cliente"%>
<%@ page import="com.ies.baroja.Controller"%>
<%@ page import="java.util.LinkedList"%>

<!DOCTYPE html>
<html lang="es" dir="ltr">
  <head>
    <meta charset="utf-8">
    <link href="login.css" rel="stylesheet" />
    <title>AGENCIAS ASI</title>
    <link rel="icon" type="image/png" href="b.png"/>
  </head>
  <body>

    <div class="container">
      <div class="backbox">
        <div class="loginMsg">
          <div class="textcontent">
            <p class="title">¿No tienes cuenta?</p>
            <p>Registrate para poder viajar con Agencias ASI</p>
      <a href="registro.jsp"> <button id="switch1">Registrate</button></a>
          </div>
        </div>
        <form class="login-form" action="ServletForm" method="Post">
      <div class="frontbox">
        <div class="login">
          <h2>Inicio de sesión</h2>
          <div class="inputbox">
            <input type="email" required value="" class="form-control" id="email" name="email" placeholder="Correo electrónico"/>
     
      <input type="password" required value="" class="form-control" id="pwd" name="pwd"  placeholder="Contraseña"/>
          </div>
          <p>¿Has olvidado tu contraseña?</p>
           <p class="link"><a href="recu.jsp">Recuperala</a></p>
          <button>Iniciar</button>
        </div>
        </form>






  </body>
</html>





