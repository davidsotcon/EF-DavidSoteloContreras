package com.idat.EFDavidSoteloTutistaMicroservicio.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "turistasdto")
public class TuristaDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTurista;
	private String nombreturista;
	private String nroCelular;
	private String direccion;
}
