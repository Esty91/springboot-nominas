package com.companyname.nominas.modelo;
import java.io.Serializable;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	public Empleado() {
		super();
	}


	public Empleado(String dni, String nombre, byte categoria, byte anio, String sexo) {
		this.dni = dni;
		this.nombre = nombre;
		this.categoria = categoria;
		this.anio = anio;
		this.sexo = sexo;
	}
	@Id
	@Column(name = "dni")
	private String dni;
	
	private String nombre;
	private byte categoria;
	private byte anio;
	private String sexo;
	


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public byte getCategoria() {
		return categoria;
	}


	public void setCategoria(byte categoria) {
		this.categoria = categoria;
	}


	public byte getAnio() {
		return anio;
	}


	public void setAnio(byte anio) {
		this.anio = anio;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", categoria=" + categoria + ", anio=" + anio + ", sexo="
				+ sexo + "]";
	}

	
	

}