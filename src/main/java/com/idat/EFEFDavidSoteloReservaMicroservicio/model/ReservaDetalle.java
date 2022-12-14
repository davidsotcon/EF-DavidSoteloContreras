package com.idat.EFEFDavidSoteloReservaMicroservicio.model;

import lombok.Data;

@Data
public class ReservaDetalle {

	private HospedajeReserva fk = new HospedajeReserva();
}
