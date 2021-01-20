package com.companyname.nominas.servicio;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.companyname.nominas.repositorio.NominaDao;

@Service
public class NominaManagerImpl implements NominaManager {

	private static final long serialVersionUID = 1L;

	@Autowired
	private NominaDao nominaDao;

	public void setNominaDao(NominaDao nominaDao) {
		this.nominaDao = nominaDao;
	}

	public float mostrarSalario(String dni) {
		return nominaDao.mostrarSalario(dni);
	}
}
