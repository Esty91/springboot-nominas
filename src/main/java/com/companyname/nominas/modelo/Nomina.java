package com.companyname.nominas.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nomina")
public class Nomina {

	@Id
	@Column(name = "dni")
	private String dni;

	@Column(name = "sueldo")
	private float sueldo;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	private static final int SALARIO_BASE[] = { 50000, 70000, 90000, 110000, 130000, 150000, 170000, 190000, 210000,
			230000 };

	private static final float INCENTIVO_ANIO = 5000;

	public static float setSalaryDB(byte bCategoria, byte bAnio) {
		float fSueldo = -1;
		if (bCategoria == -1) {
			bCategoria = 1;
		}

		if (bAnio == -1) {
			bAnio = 0;
		}
		fSueldo = (float) SALARIO_BASE[bCategoria - 1] + (float) INCENTIVO_ANIO * bAnio;

		return fSueldo;
	}
}