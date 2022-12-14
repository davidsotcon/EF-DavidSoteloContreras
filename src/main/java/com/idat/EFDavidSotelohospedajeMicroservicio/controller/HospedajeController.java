package com.idat.EFDavidSotelohospedajeMicroservicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFDavidSotelohospedajeMicroservicio.model.Hospedaje;
import com.idat.EFDavidSotelohospedajeMicroservicio.service.HospedajeService;


@Controller
@RequestMapping("/api/hospedaje/evfinal")
public class HospedajeController {
	
	@Autowired
	private HospedajeService service;
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Hospedaje hopedaje) {
		service.guardarHospedaje(hopedaje);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignar() {
		service.asignarHospedaje();
	}

}
