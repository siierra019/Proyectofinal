package com.ies.baroja;

import java.util.LinkedList;

import com.bbdd.ConexionBBDD;
import com.model.Cliente;
import com.model.Guias;
import com.model.Hoteles;
import com.model.Vuelos;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller {

	/**
	 * @return
	 * @getJugadores
	 * @author Ivan
	 *
	 */

	
	
	public static boolean insertarJugador(Cliente client) {
		boolean bRes = true;
		// Primero conectamos a la BBDD
		ConexionBBDD miConexion = new ConexionBBDD();
		try {
		miConexion.conectar();
		int iRes = miConexion.insertarCliente(client);
		System.out.println("Resultado de insertar el jugador="+iRes);
		} catch (SQLException sqlex) {
		System.out.println("Error: " + sqlex.getMessage());
		sqlex.printStackTrace();
		bRes = false;
		} finally {
		miConexion.desconectar();
		}
		return bRes;
		}

	
	public static LinkedList<Vuelos> getVuelosTotal() {
// Objeto con la lista de los jugadores.

		Vuelos miVuelos = null;
		ConexionBBDD miConn = new ConexionBBDD();
		LinkedList<Vuelos> listaDeVuelos = new LinkedList<Vuelos>();
		try {


			String sConsulta = "Select * from vuelos ;";
			miConn.conectar();
			ResultSet rsResultado = miConn.ejecutarSentencia(sConsulta);
			
			if (rsResultado != null) {
				System.out.println("Llega aqui dentro");
				while (rsResultado.next()) {
					miVuelos = new Vuelos(rsResultado.getInt("Nºvuelos"), rsResultado.getInt("IDcompania"),
							rsResultado.getString("Clase"), rsResultado.getString("ASalida"),rsResultado.getString("ALlegada"),
							rsResultado.getString("FSalida"), rsResultado.getString("FLlegada"),
							rsResultado.getInt("Pviaje"), rsResultado.getString("Enlace"));
					listaDeVuelos.add(miVuelos);
				}
			} else {
				System.out.println("Error no hay datos");
			}

		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
		} finally {
			miConn.desconectar();
		}
		return listaDeVuelos;
	}

	
	
	
	
	
	
	

	
	
	
	
	public static boolean insertarVuelos(Vuelos vuelo) {
		boolean bRes = true;
		/** 1-conectar a la BBDD **/
		ConexionBBDD miConn = new ConexionBBDD();

		try {

			/** 2-obtener conexion **/
			miConn.conectar();
			/** 3-insertar jugador **/
			int iRes = miConn.insertarVuelo(vuelo);
			System.out.println("Resultado de insertar jugador= " + iRes);
		} catch (SQLException sqlex) {
			System.out.println("Error***" + sqlex.getMessage());
			sqlex.printStackTrace();
		} finally {
// Desconectar la BBDD
			miConn.desconectar();
			System.out.println("Desconectado");

			class TestModel {
				public void main(String[] args) {
					System.out.println("Inicio TestModel");
					LinkedList<Vuelos> lista = Controller.getVuelosTotal();
				}
			}
		}
		return bRes;
	}

	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static LinkedList<Hoteles> getHotelesTotal() {
// Objeto con la lista de los jugadores.

		Hoteles mihoteles = null;
		ConexionBBDD miConn = new ConexionBBDD();
		LinkedList<Hoteles> listaDeHoteles = new LinkedList<Hoteles>();
		try {


			String sConsulta = "Select * from hoteles ;";
			miConn.conectar();
			ResultSet rsResultado = miConn.ejecutarSentencia(sConsulta);
			
			if (rsResultado != null) {
				System.out.println("Llega aqui dentro");
				while (rsResultado.next()) {
					mihoteles = new Hoteles(rsResultado.getInt("IDhotel"), rsResultado.getInt("Telefono"),
							rsResultado.getString("Calidad"),rsResultado.getString("Mail"),
							 rsResultado.getString("Dirección"), rsResultado.getString("Nombre"),
							 rsResultado.getString("Enlace"));
					listaDeHoteles.add(mihoteles);
				}
			} else {
				System.out.println("Error no hay datos");
			}

		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
		} finally {
			miConn.desconectar();
		}
		return listaDeHoteles;
	}

	public static boolean insertarHoteles(Hoteles hoteles) {
		boolean bRes = true;
		/** 1-conectar a la BBDD **/
		ConexionBBDD miConn = new ConexionBBDD();

		try {

			/** 2-obtener conexion **/
			miConn.conectar();
			/** 3-insertar jugador **/
			int iRes = miConn.insertarHoteles(hoteles);
			System.out.println("Resultado de insertar jugador= " + iRes);
		} catch (SQLException sqlex) {
			System.out.println("Error***" + sqlex.getMessage());
			sqlex.printStackTrace();
		} finally {
// Desconectar la BBDD
			miConn.desconectar();
			System.out.println("Desconectado");

			class TestModel {
				public void main(String[] args) {
					System.out.println("Inicio TestModel");
					LinkedList<Hoteles> lista = Controller.getHoteles();
				}
			}
		}
		return bRes;
	}

	public static LinkedList<Hoteles> getHoteles() {
		
		// TODO Auto-generated method stub
		return null;
	} 
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	public static LinkedList<Guias> getGuiasTotal() {
		// Objeto con la lista de los jugadores.

				Guias miguia = null;
				ConexionBBDD miConn = new ConexionBBDD();
				LinkedList<Guias> listaDeGuias = new LinkedList<Guias>();
				try {


					String sConsulta = "Select * from guias ;";
					miConn.conectar();
					ResultSet rsResultado = miConn.ejecutarSentencia(sConsulta);
					
					if (rsResultado != null) {
						System.out.println("Llega aqui dentro");
						while (rsResultado.next()) {
							miguia = new Guias(rsResultado.getInt("IDGUIA"), rsResultado.getString("Nombre"),
									rsResultado.getString("Idioma"),rsResultado.getString("País"),
									 rsResultado.getInt("Telefono"), rsResultado.getString("Ciudad"),
									 rsResultado.getString("Foto"));
							listaDeGuias.add(miguia);
						}
					} else {
						System.out.println("Error no hay datos");
					}

				} catch (SQLException sqlex) {
					sqlex.printStackTrace();
				} finally {
					miConn.desconectar();
				}
				return listaDeGuias;
			}

			public static boolean insertarGuias(Guias guias) {
				boolean bRes = true;
				/** 1-conectar a la BBDD **/
				ConexionBBDD miConn = new ConexionBBDD();

				try {

					/** 2-obtener conexion **/
					miConn.conectar();
					/** 3-insertar jugador **/
					int iRes = miConn.insertarGuias(guias);
					System.out.println("Resultado de insertar jugador= " + iRes);
				} catch (SQLException sqlex) {
					System.out.println("Error***" + sqlex.getMessage());
					sqlex.printStackTrace();
				} finally {
		// Desconectar la BBDD
					miConn.desconectar();
					System.out.println("Desconectado");

					class TestModel {
						public  void main(String[] args) {
							System.out.println("Inicio TestModel");
							LinkedList<Guias> lista = Controller.getGuias();
						}
					}
				}
				return bRes;
			}

			public static LinkedList<Guias> getGuias() {
				
				// TODO Auto-generated method stub
				return null;
			} 

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static LinkedList<Cliente> getClienteTotal() {
	// Objeto con la lista de los jugadores.

			Cliente micliente = null;
			ConexionBBDD miConn = new ConexionBBDD();
			LinkedList<Cliente> listaDeCliente = new LinkedList<Cliente>();
			try {


				String sConsulta = "Select * from cliente ;";
				miConn.conectar();
				ResultSet rsResultado = miConn.ejecutarSentencia(sConsulta);
				
				if (rsResultado != null) {
					System.out.println("Llega aqui dentro");
					while (rsResultado.next()) {
						micliente = new Cliente(rsResultado.getString("Nombre"),
								 rsResultado.getString("Mail"),
								 rsResultado.getString("Contraseña"));
						listaDeCliente.add(micliente);
					}
				} else {
					System.out.println("Error no hay datos");
				}

			} catch (SQLException sqlex) {
				sqlex.printStackTrace();
			} finally {
				miConn.desconectar();
			}
			return listaDeCliente;
		}

		public static boolean insertarcliente(Cliente cliente) {
			boolean bRes = true;
			/** 1-conectar a la BBDD **/
			ConexionBBDD miConn = new ConexionBBDD();

			try {

				/** 2-obtener conexion **/
				miConn.conectar();
				/** 3-insertar jugador **/
				int iRes = miConn.insertarCliente(cliente);
				System.out.println("Resultado de insertar jugador= " + iRes);
			} catch (SQLException sqlex) {
				System.out.println("Error***" + sqlex.getMessage());
				sqlex.printStackTrace();
			} finally {
	// Desconectar la BBDD
				miConn.desconectar();
				System.out.println("Desconectado");

				class TestModel {
					public  void main(String[] args) {
						System.out.println("Inicio TestModel");
						LinkedList<Cliente> lista = Controller.getCliente();
					}
				}
			}
			return bRes;
		}

		public static LinkedList<Cliente> getCliente() {
			
			// TODO Auto-generated method stub
			return null;
		} 
		}
