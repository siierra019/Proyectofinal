package com.model;

public class Hoteles {
private int IDhotel;
private int Telefono;
private String Calidad;
private String Mail;
private String Direccion;
private String Nombre ;
private String Enlace ;
public Hoteles(int iDhotel, int telefono, String calidad, String mail, String direccion, String nombre) {
	super();
	IDhotel = iDhotel;
	Telefono = telefono;
	Calidad = calidad;
	Mail = mail;
	Direccion = direccion;
	Nombre = nombre;
}
public int getIDhotel() {
	return IDhotel;
}
public void setIDhotel(int iDhotel) {
	IDhotel = iDhotel;
}
public int getTelefono() {
	return Telefono;
}
public void setTelefono(int telefono) {
	Telefono = telefono;
}
public String getCalidad() {
	return Calidad;
}
public void setCalidad(String calidad) {
	Calidad = calidad;
}
public String getMail() {
	return Mail;
}
public void setMail(String mail) {
	Mail = mail;
}
public String getDireccion() {
	return Direccion;
}
public void setDireccion(String direccion) {
	Direccion = direccion;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getEnlace() {
	return Enlace;
}
public void setEnlace(String enlace) {
	Enlace = enlace;
}
public Hoteles(int iDhotel, int telefono, String calidad, String mail, String direccion, String nombre, String enlace) {
	super();
	IDhotel = iDhotel;
	Telefono = telefono;
	Calidad = calidad;
	Mail = mail;
	Direccion = direccion;
	Nombre = nombre;
	Enlace = enlace;
}



}
