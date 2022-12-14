package com.idat.EFEFDavidSoteloReservaMicroservicio.servicio;

import java.util.List;


import com.idat.EFEFDavidSoteloReservaMicroservicio.model.Reserva;

public interface ReservaService {
	void guardarReserva(Reserva reserva);
	List<Reserva>listar();
}
