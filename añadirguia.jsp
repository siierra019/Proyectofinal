<!DOCTYPE html>
<html lang="en">

<head>
  <title>Bootstrap Example</title>
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
       visibility: hidden;
    }


    .marco2 {

      border: none;
margin-top: 1%;
margin-left: 10%;
margin-right: 10%;
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
  position:fixed;   
  bottom: 0px;

}
  </style>
<link rel="icon" type="image/png" href="b.png"/>
</head>
<%
		HttpSession misesion = request.getSession();

		String email = (String) misesion.getAttribute("email");

		
			
			out.print("<br><b>Hola </b>" + email);
	
		%>
<header>
    <div class="container-fluid pt-3 pb-2 text-white text-center" id="encabezado">
      <h2>Agencias ASI</h2>
      <nav class="navbar navbar-toggleable-md navbar-light bg-faded" style="visibility: hidden;">




      <!--parte izquierda-menÃº-->
      <button id="botonperfil" type="button" class="btn float-left text-white btn-danger" data-bs-toggle="offcanvas" data-bs-target="#offcanvasMenus"><span class="navbar-toggler-icon"></span></button>
      <div class="offcanvas offcanvas-start navbar-light text-center" id="offcanvasMenus" style="width: 200px; ">
        <!--botÃ³n close menÃº-->
        <div class="border-bottom p-3 mb-3 shadow-sm">
          <button type="button" class="btn-close float-end text-white" data-bs-dismiss="offcanvas" aria-label="Close">
          </button>

        </div>

        <!--menÃº navbar-->

        <br>
        <!--primer enlace-->
        <a href="login.html" class="link-dark rounded">Iniciar Sesión</a>



      </div>


    <nav class="navbar navbar-expand-sm bg-red navbar-dark">
        <ul class="navbar-nav">
      
          <li class="nav-item">
            <a href="index.jsp" class="nav-link ">Inicio</a>
          </li>
          <li class="nav-item">
            <a href="Vuelo.jsp" class="nav-link btn-cursor">Vuelos</a>
          </li>
          <li class="nav-item">
            <a href="Hoteles.jsp" class="nav-link btn-cursor2">Hoteles</a>
          </li>
          <li class="nav-item">
            <a href="guias.jsp" class="nav-link btn-cursor3">Guias</a>
          </li>
          <li class="nav-item">
            <a href="paquetes.jsp" class="nav-link btn-cursor4">Paquetes</a>
          </li>
        </nav>
        
      </div>




</header>


		
<body>

<br>
<div class="marco2">
<br><br><br>
<h2>AÑADIR GUIA</h2>
<br><br>

  <form action="mantenimiento.jsp" style="padding-left: 10%; padding-right: 10%;">

 <div class="input-group mb-3" style="background-color: white;">


      <span class="input-group-text">IDGuia</span>
      <input type="text" class"form-control">
        <span class="input-group-text">Nombre</span>
      <input type="text" class"form-control">

    </div>

    <div class="input-group mb-3" style="background-color: white;">
      <span class="input-group-text">Idioma</span>
      <input type="text" class"form-control">
        <span class="input-group-text">País</span>
      <input type="text" class"form-control">

    </div>

    <div class="input-group mb-3" style="background-color: white;">


      <span class="input-group-text">Teléfono</span>
      <input type="text" class"form-control">

    </div>
    
        <div class="input-group mb-3" style="background-color: white;">


      <span class="input-group-text">Ciudad</span>
      <input type="text" class"form-control">

    </div>
        <div class="input-group mb-3" style="background-color: white;">


      <span class="input-group-text">Enlace</span>
      <input type="text" class"form-control">

    </div>

    <button type="submit" class="btn btn-danger">Siguiente</button>

  </form>
<br><br><br><br>
</div>

<div class="disclaimer text-black"> <a title="" target="_blank" href="politica.html" style="color: black;"><b>Política de privacidad</b></a></div>



</body>

<footer>
<br>
<p>agenciasasi@gmail.com</P>
<br>
</footer>

</html>
