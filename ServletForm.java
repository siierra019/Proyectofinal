package com.ies.baroja;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bbdd.ConexionBBDD;
import com.model.Cliente;

import java.sql.Connection;
import java.sql.Date;
/**
 * Servlet implementation class ServletForm
 */
@WebServlet("/ServletForm")
public class ServletForm extends HttpServlet {
private static final long serialVersionUID = 1L;

/**
* @see HttpServlet#HttpServlet()
*/
public ServletForm() {
super();
// TODO Auto-generated constructor stub
}



/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
*      response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

try {


		
	
if (request.getParameter("email") != null )  {

loginUsuario(request, response);


}else if (request.getParameter("cerrarSesion") != null)
{

	// Mostramos que se ha producido un error
	cerrarSesion(request, response);
	}







} catch (Exception ex) {
System.out.println("Error en servlet");
ex.printStackTrace();
mostrarError(response);
}
}



/* protected void doPost2(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

try {


	
	
	 1- recogida de datos 
	Cliente Client = new
	Cliente(request.getParameter("Nombre"), request.getParameter("Mail"), request.getParameter("Contraseña"));
	 2- Insertar jugador en la base de datos 
	boolean bRes = Controller.insertarcliente(Client);
	3- Mostrar resultado por pantalla 
	if (bRes) {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<HTML>\n" + "<HEAD><TITLE>Página de JAGD</TITLE>" + " <meta charset=\"utf-8\">\r\n" + " <meta name=\"viewport\"content=\"width=device-width, initial-scale=1\">\r\n" + " <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n" + " <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></ script>\r\n" + "</HEAD>\n" + "<BODY>\n" + "<div class=\"container mt-3\">\n" + "<h2 class=\"text-success\">Jugador insertado correctamente<h2>\n" + "<ul class=\"list-group\"> \n" + " <LI class=\"list-group-item\">nombre: " + Client.getNombre() +  	"</UL>\n" + 		"</div></BODY></HTML>");
			out.close();

	} else {
		// Mostramos que se ha producido un error
		mostrarError(response);
		}
	

} catch (Exception ex) {
System.out.println("Error en servlet");
ex.printStackTrace();
mostrarError(response);
}
}

*/

public static void cerrarSesion(HttpServletRequest request, HttpServletResponse response)
throws Exception{

HttpSession sesion = request.getSession();

sesion.removeAttribute("email");
response.sendRedirect("index2.jsp");


		
}


private static void loginUsuario(HttpServletRequest request, HttpServletResponse response) throws Exception {

HttpSession sesion = request.getSession();
String usu, pass;
String sEmail = request.getParameter("email");
String sPwd = request.getParameter("pwd");
// deber�amos buscar el usuario en la base de datos, pero
//ponemos un ejemplo en el mismo c�digo
if ((sEmail.equals("asi@gmail.com") && sPwd.equals("admin"))  ) {
// si coincide email y password y adem�s no hay sesi�n iniciada
sesion.setAttribute("email", sEmail);
// redirijo a p�gina con informaci�n de login exitoso
response.sendRedirect("index.jsp");
} else if (sEmail.equals("admin@gmail.com") && sPwd.equals("admin")) {
	
	sesion.setAttribute("email", sEmail);
	response.sendRedirect("mantenimiento.jsp");
} else {
	
// l�gica para login inv�lido
mostrarError(response);



}



}





private static void mostrarError(HttpServletResponse response) throws IOException {
response.setContentType("text/html");

PrintWriter out = response.getWriter();

out.print(
		 "<!DOCTYPE html>\r\n"
		+ "<html lang=\"es\" dir=\"ltr\">\r\n"
		+ "  <head>\r\n"
		+ "    <meta charset=\"utf-8\">\r\n"
		+ "    <link href=\"login.css\" rel=\"stylesheet\" />\r\n"
		+ "    <title>AGENCIAS ASI</title>\r\n"
		+ "  </head>\r\n"
		+ "  <body>\r\n"
		+ "\r\n"
		+ "    <div class=\"container\">\r\n"
		+ "      <div class=\"backbox\">\r\n"
		+ "        <div class=\"loginMsg\">\r\n"
		+ "          <div class=\"textcontent\">\r\n"
		+ "            <p class=\"title\">¿No tienes cuenta?</p>\r\n"
		+ "            <p>Registrate para poder viajar con Agencias ASI</p>\r\n"
		+ "      <a href=\"registro.jsp\"> <button id=\"switch1\">Registrate</button></a>\r\n"
		+ "          </div>\r\n"
		+ "        </div>\r\n"
		+ "        <form class=\"login-form\" action=\"ServletForm\" method=\"post\">\r\n"
		+ "      <div class=\"frontbox\">\r\n"
		+ "        <div class=\"login\">\r\n"
		+ "          <h2>Inicio de sesión</h2>\r\n"
		+ "          <div class=\"inputbox\">\r\n"
		+ "            <input type=\"email\" required value=\"\" class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Correo electrónico\"/>\r\n"
		+ "     \r\n"
		+ "      <input type=\"password\" required value=\"\" class=\"form-control\" id=\"pwd\" name=\"pwd\"  placeholder=\"Contraseña\"/>\r\n"
		+ "          </div>\r\n"
		+ "           <p style=\"color: red;\">*Usuario o contraseña erróneos*</p>\r\n"
		+ "          <p>¿Has olvidado tu contraseña?</p>\r\n"
		+ "           <p class=\"link\"><a href=\"recu.jsp\">Recuperala</a></p>\r\n"
		+ "          <button>Iniciar</button>\r\n"
		+ "        </div>\r\n"
		+ "        </form>\r\n"
		+ "\r\n"
		+ "\r\n"
		+ "\r\n"
		+ "\r\n"
		+ "\r\n"
		+ "\r\n"
		+ "  </body>\r\n"
		+ "</html>\r\n"
		+ "");


out.close();

}

}