package com.idat.EFDavidSotelohospedajeMicroservicio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
public class TuristaHospedaje implements Serializable{

	private static final long serialVersionUID = -6092198249288021953L;
	
	@Column(name = "id_turista",nullable = false)
	private Integer idTurista;
	
	@Column(name = "id_hospedaje",nullable = false)
	private Integer idHospedaje;
	
	public Integer getIdTurista() {
		return idTurista;
	}
	public void setIdTurista(Integer idTurista) {
		this.idTurista = idTurista;
	}
	public Integer getIdHospedaje() {
		return idHospedaje;
	}
	public void setIdHospedaje(Integer idHospedaje) {
		this.idHospedaje = idHospedaje;
	}
	
}
