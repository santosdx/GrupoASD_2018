package com.grupoAsd.activos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupoAsd.activos.model.PropietarioActivo;
import com.grupoAsd.activos.service.ServicioPropietarioActivo;

@RestController
public class PropietarioActivoController {

	@Autowired
	private ServicioPropietarioActivo servPropietarioActivo;
	
	@RequestMapping(value = "/propietario/{id}", method = RequestMethod.GET, produces = "application/json")
	public PropietarioActivo getPropietarioActivo(@PathVariable Integer id) {
		return servPropietarioActivo.buscarPropietarioActivoById(id);
	}
	
}
