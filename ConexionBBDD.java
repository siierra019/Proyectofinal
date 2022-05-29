package com.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Cliente;
import com.model.Guias;
import com.model.Hoteles;
import com.model.Vuelos;


/**
 * Clase que centraliza los m�todos de acceso a BBDD
 * 
 * @author JAGD
 * @since 27/05/2021
 */

public class ConexionBBDD {

	Connection conexion; 
	int port = 3306;
	String host= "localhost";
	String db  = "agencia";
	String user="root";
	String password="";

	String url = String.format("jdbc:mysql://%s:%d/%s?useSSL=false", host, port, db);

	public void conectar() throws SQLException {
		conexion =  DriverManager.getConnection(url, user, password);
	}	
	 

	public void desconectar() {
		try {
			conexion.close();
		} catch (SQLException sqlex) {
			System.out.println("Error: " + sqlex.getMessage());
		}
	}

	public ResultSet ejecutarSentencia(String sentencia) {
		System.out.println("dEBE LLEGAR A EJECUTAR SENTENCIA");
		ResultSet rsResultado = null;
		try {
			System.out.println("Ejecutando: " + sentencia);
			PreparedStatement prepStatement = conexion.prepareStatement(sentencia);
			rsResultado = prepStatement.executeQuery();
			
		} catch (SQLException sqlex) {
			System.out.println("Error: " + sqlex.getMessage());
		}
		return rsResultado;
	}
	
	public int insertarVuelo(String sentencia, String sMatricula, String sMarca, String sModelo) {
		int iRes=0;
		try {
			System.out.println("Ejecutando: " + sentencia);
			PreparedStatement prepStatement = conexion.prepareStatement(sentencia);
			prepStatement.setString(1,sMatricula);
			prepStatement.setString(2,sMarca);
			prepStatement.setString(3,sModelo);
			iRes =  prepStatement.executeUpdate();
		} catch (SQLException sqlex) {
			System.out.println("Error: " + sqlex.getMessage());
		}
		return iRes;
	}
	
	public int insertar(Vuelos vuelos) {
		int iRes=0;
		String sInsert ="insert into vuelos (Nºvuelos, IDcompania, Clase, ASalida, ALlegada, FSalida, FLlegada, Pviaje, Enlace) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
		System.out.println("Ejecutando: " + sInsert);
		System.out.println("datos: " + vuelos);
		PreparedStatement prepStatement =
		conexion.prepareStatement(sInsert);
		
		prepStatement.setInt(1, vuelos.getNºvuelo());
		
		prepStatement.setInt(2, vuelos.getIDcompania());
		
		prepStatement.setString(3, vuelos.getClase());
		prepStatement.setString(4,vuelos.getASalida());
		prepStatement.setString(5,vuelos.getALlegada());
		prepStatement.setString(6, vuelos.getFSalida());
		prepStatement.setString(7, vuelos.getFLlegada());
		
		prepStatement.setInt(8, vuelos.getPviaje());
	
		prepStatement.setString(9, vuelos.getEnlace());
		
		
		
		
		
		iRes = prepStatement.executeUpdate();
		} catch (SQLException sqlex) {
		System.out.println("Error: " + sqlex.getMessage());
		sqlex.printStackTrace();
		}
		return iRes;
		}





	public ResultSet ejecutarConsulta(String sConsulta) {
		// TODO Auto-generated method stub
		return null;
	}


	public int insertarVuelo(Vuelos vuelo) {
		// TODO Auto-generated method stub
		return 0;
	}


	public int insertarHoteles(Hoteles hoteles) {
		// TODO Auto-generated method stub
		return 0;
	}


	public int insertarGuias(Guias guias) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public int insertarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}

}
