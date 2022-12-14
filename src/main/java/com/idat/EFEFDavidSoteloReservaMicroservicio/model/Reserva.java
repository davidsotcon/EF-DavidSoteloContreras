package com.idat.EFEFDavidSoteloReservaMicroservicio.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "reservas")
public class Reserva {
	@Id
	private Integer idReserva;
	private String costo;
}
