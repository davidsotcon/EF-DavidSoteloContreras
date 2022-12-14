package com.idat.EFEFDavidSoteloReservaMicroservicio.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFEFDavidSoteloReservaMicroservicio.model.Reserva;
import com.idat.EFEFDavidSoteloReservaMicroservicio.servicio.ReservaService;



@Controller
@RequestMapping("/api/reserva/evfinal")
public class ReservaController {
	
	
	private ReservaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Reserva>listar(){
		return service.listar();
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Reserva reserva) {
		service.guardarReserva(reserva);
	}

}
