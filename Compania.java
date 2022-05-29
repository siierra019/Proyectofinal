package com.model;

public class Compania {
private int IDcompania;
private String Nombrecompania;
private int telefonos;
private String calidad;
private String vuelos;
private String mail;
public Compania(int iDcompania, String nombrecompania, int telefonos, String calidad, String vuelos, String mail) {
	super();
	IDcompania = iDcompania;
	Nombrecompania = nombrecompania;
	this.telefonos = telefonos;
	this.calidad = calidad;
	this.vuelos = vuelos;
	this.mail = mail;
}
public int getIDcompania() {
	return IDcompania;
}
public void setIDcompania(int iDcompania) {
	IDcompania = iDcompania;
}
public String getNombrecompania() {
	return Nombrecompania;
}
public void setNombrecompania(String nombrecompania) {
	Nombrecompania = nombrecompania;
}
public int getTelefonos() {
	return telefonos;
}
public void setTelefonos(int telefonos) {
	this.telefonos = telefonos;
}
public String getCalidad() {
	return calidad;
}
public void setCalidad(String calidad) {
	this.calidad = calidad;
}
public String getVuelos() {
	return vuelos;
}
public void setVuelos(String vuelos) {
	this.vuelos = vuelos;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}

}
