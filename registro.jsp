<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <link href="registro.css" rel="stylesheet" />
    <title>Registro</title>
    <link rel="icon" type="image/png" href="b.png"/>
  </head>
  <body>
    <div class="container">
      <div class="backbox">
        <div class="loginMsg">
          <div class="textcontent">
            <p class="title">Ya tienes cuenta?</p>
            <p>Inicia sesi�n en nuestra web</p>
      <a href="login.jsp"> <button id="switch1">Iniciar sesi�n</button></a>
          </div>
        </div>

        <form class="was-validated" action="index.jsp">
      <div class="frontbox">
        <div class="login">
          <h2>Registro en Agencias ASI</h2>
          <div class="inputbox">
            <input type="text" name="nombre" placeholder="  NOMBRE COMPLETO" required pattern="[a-zA-ZñÑáéíóúÁÉÍÓÚ\s+]{2,50}">
            <input type="text" name="email" placeholder="  EMAIL" required pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$">
            <input type="password" name="password" placeholder="  PASSWORD">
          </div>
          <button type="submit">Iniciar</button>
        </div>

        </div>

        </form>
       </body>
       </html>
