package com.model;

public class Cliente {
	private int DNI;
	private String Nombre ;
	private String Apellido;
	private String Direccion;
	private int CP;
	private int Telefono;
	private String mail;
	private String contraseña;
	
	
	
	
	
	public Cliente( String nombre, String mail, String contraseña) {
		super();
		
		Nombre = nombre;
		this.mail = mail;
		this.contraseña = contraseña;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
	
	

}
