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

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Empleado> buscarEmpleadoPorDni(Empleado oEmpleado) {
		String dni = oEmpleado.getDni();
		return em.createQuery("select e from Empleado e where dni ='" + dni + "'").getResultList();
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Empleado> buscarEmpleadoPorNombre(Empleado oEmpleado) {

		String nombre = oEmpleado.getNombre();
		return em.createQuery("select e from Empleado e where nombre ='" + nombre + "'").getResultList();
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Empleado> buscarEmpleadoPorSexo(Empleado oEmpleado) {
		String sexo = oEmpleado.getSexo();
		return em.createQuery("select e from Empleado e where sexo='" + sexo + "'").getResultList();
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Empleado> buscarEmpleadoPorCategoria(Empleado oEmpleado) {
		byte categoria = oEmpleado.getCategoria();
		return em.createQuery("select e from Empleado e where categoria='" + categoria + "'").getResultList();
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Empleado> buscarEmpleadoPorAnios(Empleado oEmpleado) {
		byte anio = oEmpleado.getAnio();
		return em.createQuery("select e from Empleado e where anio='" + anio + "'").getResultList();
	}

	public boolean modificarEmpleado(Empleado oEmpleado, Empleado oEmpleadoModificado) {

		return false;
	}

}