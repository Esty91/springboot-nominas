package com.companyname.nominas.repositorio;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.companyname.nominas.modelo.Empleado;



@Repository(value = "empleadoDao")
public class JPAEmpleadoDao implements EmpleadoDao {

	private EntityManager em = null;

	/*
	 * Sets the entity manager.
	 */
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Empleado> mostrarEmpleados() {
		return em.createQuery("select e from Empleado e order by dni").getResultList();
	}

	@Transactional(readOnly = false)
	public void saveEmpleado(Empleado emp) {
		em.merge(emp);
	}

	public boolean aniadirEmpleado(Empleado oEmpleado1) {
		
		return false;
	}

	public List<Empleado> buscarEmpleadoPorDni(Empleado oEmpleado) {
		
		return null;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Empleado> buscarEmpleadoPorNombre(Empleado oEmpleado) {

		String nombre = oEmpleado.getNombre();
		return em.createQuery("select e from Empleado where nombre ='" + nombre + "'").getResultList();
	}

	public List<Empleado> buscarEmpleadoPorSexo(Empleado oEmpleado) {
		
		return null;
	}

	public List<Empleado> buscarEmpleadoPorCategoria(Empleado oEmpleado) {
		
		return null;
	}

	public List<Empleado> buscarEmpleadoPorAnios(Empleado oEmpleado) {
		
		return null;
	}

	public boolean modificarEmpleado(Empleado oEmpleado, Empleado oEmpleadoModificado) {
		
		return false;
	}

}