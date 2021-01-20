package com.companyname.nominas.repositorio;

import java.util.List;

import com.companyname.nominas.modelo.Empleado;


public interface EmpleadoDao {

	public boolean aniadirEmpleado(Empleado oEmpleado1);

	public List<Empleado> mostrarEmpleados();

	public List<Empleado> buscarEmpleadoPorDni(Empleado oEmpleado);

	public List<Empleado> buscarEmpleadoPorNombre(Empleado oEmpleado);

	public List<Empleado> buscarEmpleadoPorSexo(Empleado oEmpleado);

	public List<Empleado> buscarEmpleadoPorCategoria(Empleado oEmpleado);

	public List<Empleado> buscarEmpleadoPorAnios(Empleado oEmpleado);

	public boolean modificarEmpleado(Empleado oEmpleado, Empleado oEmpleadoModificado);
	
	
}
