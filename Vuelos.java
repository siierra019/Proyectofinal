package com.model;

public class Vuelos {
	private int nºvuelo;
	private int IDcompania;
	private String Clase;
	private String ASalida;
	private String  ALlegada;
	private String FSalida;
	private String FLlegada;
	private int Pviaje;
	private String Enlace;
	
	public Vuelos(int nºvuelo, int iDcompania, String clase, String aSalida, String aLlegada, String fSalida,
			String fLlegada, int pviaje, String enlace) {
		super();
		this.nºvuelo = nºvuelo;
		IDcompania = iDcompania;
		Clase = clase;
		ASalida = aSalida;
		ALlegada = aLlegada;
		FSalida = fSalida;
		FLlegada = fLlegada;
		Pviaje = pviaje;
		Enlace = enlace;
	}
	public Vuelos(String string, String string2, String string3, String string4, int int1, String string5, int int2,
			String string6, String string7) {
		// TODO Auto-generated constructor stub
	}
	public int getNºvuelo() {
		return nºvuelo;
	}
	public void setNºvuelo(int nºvuelo) {
		this.nºvuelo = nºvuelo;
	}
	public int getIDcompania() {
		return IDcompania;
	}
	public void setIDcompania(int iDcompania) {
		IDcompania = iDcompania;
	}
	public String getClase() {
		return Clase;
	}
	public void setClase(String clase) {
		Clase = clase;
	}
	public String getASalida() {
		return ASalida;
	}
	public void setASalida(String aSalida) {
		ASalida = aSalida;
	}
	public String getALlegada() {
		return ALlegada;
	}
	public void setALlegada(String aLlegada) {
		ALlegada = aLlegada;
	}
	public String getFSalida() {
		return FSalida;
	}
	public void setFSalida(String fSalida) {
		FSalida = fSalida;
	}
	public String getFLlegada() {
		return FLlegada;
	}
	public void setFLlegada(String fLlegada) {
		FLlegada = fLlegada;
	}
	public int getPviaje() {
		return Pviaje;
	}
	public void setPviaje(int pviaje) {
		Pviaje = pviaje;
	}
	public String getEnlace() {
		return Enlace;
	}
	public void setEnlace(String enlace) {
		Enlace = enlace;
	}
	

}
