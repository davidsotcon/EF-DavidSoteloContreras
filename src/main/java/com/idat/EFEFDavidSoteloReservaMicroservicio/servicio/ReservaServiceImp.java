package com.idat.EFEFDavidSoteloReservaMicroservicio.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.idat.EFEFDavidSoteloReservaMicroservicio.model.Reserva;
import com.idat.EFEFDavidSoteloReservaMicroservicio.repositori.ReservaRepository;

public class ReservaServiceImp implements ReservaService {
	@Autowired
	private ReservaRepository repositorio;

	@Override
	public void guardarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		repositorio.save(reserva);
	}

	@Override
	public List<Reserva> listar() {
		// TODO Auto-generated method stub
		List<Reserva>listado=new ArrayList<>();
		Reserva dto = null;
		List<Reserva>lista = repositorio.findAll();
		
		for (Reserva reserva : lista) {
			dto = new Reserva();
			dto.setCosto(reserva.getCosto());
			dto.setIdReserva(reserva.getIdReserva());
			listado.add(dto);
		}

		return listado;
	}

}
