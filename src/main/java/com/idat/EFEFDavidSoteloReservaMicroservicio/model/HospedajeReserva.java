package com.idat.EFEFDavidSoteloReservaMicroservicio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
@Embeddable
@Data
public class HospedajeReserva implements Serializable {


	private static final long serialVersionUID = -5625594659428777478L;
	@Column(name = "id_hospedaje",nullable = false)
	private Integer idHospedaje;
	@Column(name = "id_reserva",nullable = false)
	private Integer idReserva;
	

}
