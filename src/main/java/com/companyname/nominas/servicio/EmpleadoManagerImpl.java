package com.companyname.nominas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.companyname.nominas.modelo.Empleado;
import com.companyname.nominas.repositorio.EmpleadoDao;

@Service
public class EmpleadoManagerImpl implements EmpleadoManager {

	private static final long serialVersionUID = 1L;

	@Autowired
	private EmpleadoDao empleadoDao;

	public void setEmpleadoDao(EmpleadoDao empleadoDao) {
		this.empleadoDao = empleadoDao;
	}

	public boolean aniadirEmpleado(Empleado oEmpleado1) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Empleado> mostrarEmpleados() {
		return empleadoDao.mostrarEmpleados();
	}

	public List<Empleado> buscarEmpleadoPorDni(Empleado oEmpleado) {

		return empleadoDao.buscarEmpleadoPorDni(oEmpleado);
	}

	public List<Empleado> buscarEmpleadoPorNombre(Empleado oEmpleado) {

		return empleadoDao.buscarEmpleadoPorNombre(oEmpleado);
	}

	public List<Empleado> buscarEmpleadoPorSexo(Empleado oEmpleado) {

		return empleadoDao.buscarEmpleadoPorSexo(oEmpleado);
	}

	public List<Empleado> buscarEmpleadoPorCategoria(Empleado oEmpleado) {

		return empleadoDao.buscarEmpleadoPorCategoria(oEmpleado);
	}

	public List<Empleado> buscarEmpleadoPorAnios(Empleado oEmpleado) {

		return empleadoDao.buscarEmpleadoPorAnios(oEmpleado);
	}

	public boolean modificarEmpleado(Empleado oEmpleado, Empleado oEmpleadoModificado) {
		// TODO Auto-generated method stub
		return false;
	}

}