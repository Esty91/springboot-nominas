package com.companyname.nominas.servicio;

import java.util.List;

import com.companyname.nominas.modelo.Empleado;

import java.io.Serializable;

public interface EmpleadoManager extends Serializable {

	public List<Empleado> mostrarEmpleados();

	public List<Empleado> buscarEmpleadoPorDni(Empleado oEmpleado);

	public List<Empleado> buscarEmpleadoPorNombre(Empleado oEmpleado);

	public List<Empleado> buscarEmpleadoPorSexo(Empleado oEmpleado);

	public List<Empleado> buscarEmpleadoPorCategoria(Empleado oEmpleado);

	public List<Empleado> buscarEmpleadoPorAnios(Empleado oEmpleado);

	public boolean modificarEmpleado(Empleado oEmpleado, Empleado oEmpleadoModificado);

}