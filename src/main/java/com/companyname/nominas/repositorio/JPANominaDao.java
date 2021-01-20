package com.companyname.nominas.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository(value = "nominaDao")
public class JPANominaDao implements NominaDao{


	private EntityManager em = null;

    /*
     * Sets the entity manager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
	public float mostrarSalario(String dni) {
		return (float) em.createQuery("select sueldo from Nomina where dni ='"+ dni +"'").getSingleResult();
	}

}

