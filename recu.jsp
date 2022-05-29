<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es" dir="ltr">
  <head>
    <meta charset="utf-8">
    <link href="recu.css" rel="stylesheet" />
    <title>AGENCIAS ASI</title>
    <link rel="icon" type="image/png" href="b.png"/>
  </head>
  <body>

    <div class="container">
      <div class="backbox">
        <div class="loginMsg">
          <div class="textcontent">
            <p class="title">Recuperación de contraseña</p>
            <p>Danos tu correo y te mandaremos un mail para el reseteo</p>
            <p>Si no se te olvido, vuelve al login</p>
      <a href="login.jsp"> <button id="switch1">Volver al login</button></a>
          </div>
        </div>
        <form class="was-validated" action="principal.jsp">
      <div class="frontbox">
        <div class="login">
          <h2>Recuperacion de contraseña</h2>
          <div class="inputbox">
            <input type="text" name="email" placeholder="  EMAIL PARA RESETEO" required pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$">

          </div>
          <button>Iniciar</button>
        </div>
        </form>

  </body>
</html>
