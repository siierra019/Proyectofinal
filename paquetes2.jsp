
































<!DOCTYPE html>
<html lang="en">

<head>
  <title>Paquetes </title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
    <style>
    html {
      background-image: url("https://images.alphacoders.com/102/1020613.jpg");
      background-attachment: fixed;
      background-position: center center;
      background-size: cover;
    }

    body {
      font-family: 'Roboto', sans-serif;
      background-image: url("https://images.alphacoders.com/102/1020613.jpg");
      background-attachment: fixed;
      background-position: center center;
      background-size: cover;
    }

    .btn-cursor {

  cursor: url("https://img.icons8.com/ios-filled/50/ffffff/airplane-mode-on.png"), auto;
  }

  .btn-cursor2 {

  cursor: url("https://img.icons8.com/ios-filled/50/ffffff/5-star-hotel--v2.png"), auto;
  }

  .btn-cursor3 {

  cursor: url("https://img.icons8.com/ios-filled/50/ffffff/tourist-male.png"), auto;
  }

  .btn-cursor4 {

  cursor: url("https://img.icons8.com/ios-filled/50/ffffff/cardboard-box.png"), auto;
  }





    div {
      float: center;
      background-color: #CB1F1F;
    }

    .footer,
    .generic-footer {
      margin-bottom: 98px
    }

    @media (min-width:374px) {

      .footer,
      .generic-footer {
        margin-bottom: 78px
      }
    }

    @media (min-width:546px) {

      .footer,
      .generic-footer {
        margin-bottom: 56px
      }
    }

    @media (min-width:1055px) {

      .footer,
      .generic-footer {
        margin-bottom: 0
      }
    }

    .disclaimer {
      position: fixed;
      z-index: 9999999;
      bottom: 0;
      right: 0;
      border-top: 2px solid #ff5c62;
      text-align: center;
      font-size: 14px;
      font-weight: 400;
      background-color: #fff;
      padding: 5px 10px 5px 10px
    }

    .disclaimer a:hover {
      text-decoration: underline
    }

    @media (min-width:1052px) {
      .disclaimer {
        text-align: right;
        border-left: 2px solid red;
        border-top-left-radius: 10px
      }
    }

    @media (min-width:1920px) {
      .disclaimer {
        width: 60%
      }
    }

    #botonperfil {
      background-color: #CB1F1F;
      border: 2px solid white;
      border-radius: 10px;
      margin-left: 10px;
      margin-top: 8px;
      position: fixed;
    }


    .marco2 {

      border: none;
margin-top: 60px;
margin-left: 120px;
margin-right: 120px;
border: 3px solid #CB1F1F;
      border-radius: 30px;
      background-color: white;
      text-align: center;
    }

  }

    #encabezado {
      position: absolute;
    }
    header nav{
      text-align: center;
      display: inline-flex;
      padding-left: 5px;
      padding-right: 5px;
  margin: 0 auto;
      display: inline-block;
    }


    /*#h5 {
    color: #CB1F1F;
    background-color: white;
    margin-top: 5px;
    margin-bottom: 40px;
    margin-right: 0px;
    margin-left: 0px;
    padding-bottom: 5px;
    padding-top: 5px;
  }
*/

footer {
   text-align: center;
  padding: 3px;
  background-color:   #CB1F1F;
  color: white;
  width: 100%;
  margin-top: 10%;
  
  bottom: 0px;
}


  .paquetes{
      background-color:#f8f8f8;
      text-align: left;
      border: 3px solid #CB1F1F;
      border-radius: 20px;
      padding: 10px;
      margin-right: 20%;
      margin-left: 20%;
      margin-top: 30px;

    }
    .paquetes img{
      width: 100px;
      length: 100px;

    }
    
  </style>
<link rel="icon" type="image/png" href="b.png"/>
</head>
<header>
    <div class="container-fluid pt-3 pb-2 text-white text-center" id="encabezado">
      <h2>Agencias ASI</h2>
      <nav class="navbar navbar-toggleable-md navbar-light bg-faded">




      <!--parte izquierda-menÃº-->
      <button id="botonperfil" type="button" class="btn float-left text-white btn-danger" data-bs-toggle="offcanvas" data-bs-target="#offcanvasMenus"><span class="navbar-toggler-icon"></span></button>
      <div class="offcanvas offcanvas-start navbar-light text-center" id="offcanvasMenus" style="width: 200px;">
        <!--botÃ³n close menÃº-->
        <div class="border-bottom p-3 mb-3 shadow-sm">
          <button type="button" class="btn-close float-end text-white" data-bs-dismiss="offcanvas" aria-label="Close">
          </button>

        </div>

        <!--menÃº navbar-->

        <br>
        <!--primer enlace-->
        <a href="login.jsp" class="link-dark rounded">Iniciar Sesión</a>



      </div>


      <nav class="navbar navbar-expand-sm bg-red navbar-dark">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a href="index.jsp" class="nav-link">Inicio</a>
          </li>
          <li class="nav-item">
            <a href="Vuelo.jsp" class="nav-link btn-cursor">Vuelos</a>
          </li>
          <li class="nav-item">
            <a href="Hoteles.jsp" class="nav-link btn-cursor2">Hoteles</a>
          </li>
          <li class="nav-item">
            <a href="guias.jsp" class="nav-link btn-cursor3">Guías</a>
          </li>
          <li class="nav-item">
            <a href="paquetes.jsp" class="nav-link btn-cursor4 active">Paquetes</a>
          </li>
          </ul>
        </nav>
      </div>




</header>

<br>
<br><br>
<body>

<div class="paquetes">
<h3>Escapadas</h3>
<h5>Nuestro producto estrella, una escapada romántica para dos personas</h5>
<a href="escapadas2.jsp"><img class="paquetes" src="https://images.pexels.com/photos/8231230/pexels-photo-8231230.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940" alt="images">
</a>
</div>
<br>
<div class="paquetes">
<h3>Aventuras</h3>
<h5>Si quieres vivir una aventura como es debido, este es tu sitio, con mas de 5 tipos disponibles en nuestra web</h5>

  <a href="aventuras2.jsp"><img class="paquetes" src="https://images.pexels.com/photos/6156358/pexels-photo-6156358.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500" alt="images">
</a>

</div>



  


</body>
<footer>
<br>
<p>agenciasasi@gmail.com</p>
<br>
</footer>
</html>















