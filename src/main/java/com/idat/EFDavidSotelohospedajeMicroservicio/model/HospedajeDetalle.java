package com.idat.EFDavidSotelohospedajeMicroservicio.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

public class HospedajeDetalle {
	
	private TuristaHospedaje fk = new TuristaHospedaje();

	

	
}
