package com.idat.EFDavidSoteloTutistaMicroservicio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.EFDavidSoteloTutistaMicroservicio.dto.TuristaDTO;
import com.idat.EFDavidSoteloTutistaMicroservicio.model.Turista;
import com.idat.EFDavidSoteloTutistaMicroservicio.repository.TuristaRepository;


public class TuristaServiceImp implements TuristaService {
	@Autowired
	private TuristaRepository repository;

	@Override
	public List<TuristaDTO> listar() {
		// TODO Auto-generated method stub
		List<TuristaDTO>listado=new ArrayList<>();
		TuristaDTO dto = null;
		List<Turista>lista = repository.findAll();
		
		for (Turista turista : lista) {
			dto = new TuristaDTO();
			dto.setNombreturista(turista.getNombreturista());
			dto.setNroCelular(turista.getNroCelular());
			dto.setDireccion(turista.getDireccion());
			dto.setIdTurista(turista.getIdTurista());
			listado.add(dto);
		}

		return listado;
	}

	@Override
	public TuristaDTO obtenerId(Integer id) {
		// TODO Auto-generated method stub
		Turista turista = repository.findById(id).orElse(null);
		TuristaDTO dto = null;
		dto.setNombreturista(turista.getNombreturista());
		dto.setNroCelular(turista.getNroCelular());
		dto.setDireccion(turista.getDireccion());
		dto.setIdTurista(turista.getIdTurista());
		return dto;
	}

	@Override
	public void guardar(TuristaDTO turista) {
		Turista turis = new Turista();
		turis.setNombreturista(turista.getNombreturista());
		turis.setNroCelular(turista.getNroCelular());
		turis.setDireccion(turista.getDireccion());
		turis.setIdTurista(turista.getIdTurista());
		repository.saveAndFlush(turis);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public void actualizar(TuristaDTO turista) {
		// TODO Auto-generated method stub
		Turista turis = new Turista();
		turis.setNombreturista(turista.getNombreturista());
		turis.setNroCelular(turista.getNroCelular());
		turis.setDireccion(turista.getDireccion());
		turis.setIdTurista(turista.getIdTurista());
		repository.saveAndFlush(turis);
		
	}
	
	
}
