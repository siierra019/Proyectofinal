package com.model;

public class Guias {
	
	private int IDguia;
	private String Nombre;
	private String Idioma;
	private String Pais;
	private int Telefono;
	private String Ciudad;
	private String Foto;
	public Guias(int iDguia, String nombre, String idioma, String pais, int telefono, String ciudad, String foto) {
		super();
		IDguia = iDguia;
		Nombre = nombre;
		Idioma = idioma;
		Pais = pais;
		Telefono = telefono;
		Ciudad = ciudad;
		Foto = foto;
	}
	public int getIDguia() {
		return IDguia;
	}
	public void setIDguia(int iDguia) {
		IDguia = iDguia;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getIdioma() {
		return Idioma;
	}
	public void setIdioma(String idioma) {
		Idioma = idioma;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	public int getTelefono() {
		return Telefono;
	}
	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public String getFoto() {
		return Foto;
	}
	public void setFoto(String foto) {
		Foto = foto;
	}
	

}
