package com.companyname.nominas.controlador;

import java.io.IOException;


import java.util.HashMap;

import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.companyname.nominas.servicio.NominaManager;


@Controller
@RequestMapping("/nominas")
public class NominaController {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private NominaManager nominaManager;

	
	@RequestMapping(value = "/mostrarSalario.htm")
	public ModelAndView handleRequest3(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		return new ModelAndView("mostrarSalario");
	}
	
	@RequestMapping(value = "/salarioPorDni.htm", method = RequestMethod.POST)
	public ModelAndView handleRequest4(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Map<String, Object> myModel = new HashMap<String, Object>();

		String dni = request.getParameter("dni");
		float salario = this.nominaManager.mostrarSalario(dni);
		myModel.put("dni", dni);
		myModel.put("salario", salario);
		
		return new ModelAndView("salarioPorDni", "model", myModel);
	}

	public void setNominaManager(NominaManager nominaManager) {
		this.nominaManager = nominaManager;
	}
}
