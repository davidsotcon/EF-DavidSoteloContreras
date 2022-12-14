package com.idat.EFDavidSoteloTutistaMicroservicio.service;

import java.util.List;

import com.idat.EFDavidSoteloTutistaMicroservicio.dto.TuristaDTO;



public interface TuristaService {
	List<TuristaDTO>listar();
	TuristaDTO obtenerId(Integer id);
	void guardar(TuristaDTO turista);
	void eliminar(Integer id);
	void actualizar(TuristaDTO turista);
}
