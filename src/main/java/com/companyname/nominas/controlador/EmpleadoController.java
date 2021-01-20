package com.companyname.nominas.controlador;

import java.io.IOException;


import java.util.HashMap;
import java.util.List;
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

import com.companyname.nominas.modelo.Empleado;
import com.companyname.nominas.servicio.EmpleadoManager;

@Controller
@RequestMapping("/nominas")
public class EmpleadoController {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private EmpleadoManager empleadoManager;

	@RequestMapping("/hello.htm")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Map<String, Object> myModel = new HashMap<String, Object>();

		myModel.put("empleados", this.empleadoManager.mostrarEmpleados());

		return new ModelAndView("hello", "model", myModel);
	}

	@RequestMapping("/mostrarEmpleados.htm")
	public ModelAndView handleRequest2(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Map<String, List<Empleado>> myModel = new HashMap<String, List<Empleado>>();

		myModel.put("empleados", this.empleadoManager.mostrarEmpleados());

		return new ModelAndView("mostrarEmpleados", "model", myModel);
	}

	@RequestMapping("/modificarDatos.htm")
	public ModelAndView handleRequest3(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		return new ModelAndView("modificarDatos");
	}

	@RequestMapping("/mostrarPorNombre.htm")
	public ModelAndView handleRequest4(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		return new ModelAndView("mostrarPorNombre");
	}

	@RequestMapping(value = "/empleadoPorNombre.htm", method = RequestMethod.POST)
	public ModelAndView handleRequest5(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, List<Empleado>> myModel = new HashMap<String, List<Empleado>>();
		String nombre = request.getParameter("nombre");
		String sexo = null;
		String dni = null;
		byte anio = 0;
		byte categoria = 0;

		Empleado oEmpleado = new Empleado(dni, nombre, categoria, anio, sexo);
		myModel.put("nombre", this.empleadoManager.buscarEmpleadoPorNombre(oEmpleado));
		return new ModelAndView("empleadoPorNombre", "model", myModel);
	}
	
	@RequestMapping("/mostrarPorDni.htm")
	public ModelAndView handleRequest8(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		return new ModelAndView("mostrarPorDni");
	}
	
	@RequestMapping(value = "/empleadoPorDni.htm", method = RequestMethod.POST)
	public ModelAndView handleRequest9(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, List<Empleado>> myModel = new HashMap<String, List<Empleado>>();
		String dni = request.getParameter("dni");
		String sexo = null;
		String nombre = null;
		byte anio = 0;
		byte categoria = 0;

		Empleado oEmpleado = new Empleado(dni, nombre, categoria, anio, sexo);
		myModel.put("dni", this.empleadoManager.buscarEmpleadoPorDni(oEmpleado));
		return new ModelAndView("empleadoPorDni", "model", myModel);
	}
	
	
	@RequestMapping("/mostrarPorSexo.htm")
	public ModelAndView handleRequest6(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		return new ModelAndView("mostrarPorSexo");
	}
	
	@RequestMapping(value = "/empleadoPorSexo.htm", method = RequestMethod.POST)
	public ModelAndView handleRequest7(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, List<Empleado>> myModel = new HashMap<String, List<Empleado>>();
		String sexo = request.getParameter("sexo");
		String nombre = null;
		String dni = null;
		byte anio = 0;
		byte categoria = 0;

		Empleado oEmpleado = new Empleado(dni, nombre, categoria, anio, sexo);
		myModel.put("sexo", this.empleadoManager.buscarEmpleadoPorSexo(oEmpleado));
		return new ModelAndView("empleadoPorSexo", "model", myModel);
	}
	
	@RequestMapping("/mostrarPorCategoria.htm")
	public ModelAndView handleRequest10(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		return new ModelAndView("mostrarPorCategoria");
	}

	@RequestMapping(value = "/empleadoPorCategoria.htm", method = RequestMethod.POST)
	public ModelAndView handleRequest11(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, List<Empleado>> myModel = new HashMap<String, List<Empleado>>();
		String sexo = null;
		String nombre = null;
		String dni = null;
		byte anio = 0;
		String categoria = request.getParameter("categoria");
		byte categoria1 = Byte.parseByte(categoria);

		Empleado oEmpleado = new Empleado(dni, nombre, categoria1, anio, sexo);
		myModel.put("categoria", this.empleadoManager.buscarEmpleadoPorCategoria(oEmpleado));
		return new ModelAndView("empleadoPorCategoria", "model", myModel);
	}
	
	@RequestMapping("/mostrarPorAnios.htm")
	public ModelAndView handleRequest12(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		return new ModelAndView("mostrarPorAnios");
	}
	
	@RequestMapping(value = "/empleadoPorAnios.htm", method = RequestMethod.POST)
	public ModelAndView handleRequest13(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, List<Empleado>> myModel = new HashMap<String, List<Empleado>>();
		String sexo = null;
		String nombre = null;
		String dni = null;
		byte categoria = 0;
		String anio = request.getParameter("anio");
		byte anio1 = Byte.parseByte(anio);

		Empleado oEmpleado = new Empleado(dni, nombre, categoria, anio1, sexo);
		myModel.put("anio", this.empleadoManager.buscarEmpleadoPorAnios(oEmpleado));
		return new ModelAndView("empleadoPorAnios", "model", myModel);
	}
	
	public void setEmpleadoManager(EmpleadoManager empleadoManager) {
		this.empleadoManager = empleadoManager;
	}
}