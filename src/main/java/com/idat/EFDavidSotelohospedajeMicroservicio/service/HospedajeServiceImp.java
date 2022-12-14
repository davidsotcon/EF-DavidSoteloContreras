package com.idat.EFDavidSotelohospedajeMicroservicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFDavidSotelohospedajeMicroservicio.DTO.TuristaDTO;
import com.idat.EFDavidSotelohospedajeMicroservicio.cliente.OpenFeignClient;
import com.idat.EFDavidSotelohospedajeMicroservicio.model.Hospedaje;
import com.idat.EFDavidSotelohospedajeMicroservicio.model.HospedajeDetalle;
import com.idat.EFDavidSotelohospedajeMicroservicio.model.TuristaHospedaje;
import com.idat.EFDavidSotelohospedajeMicroservicio.repositoriio.HospedajeDetalleRepository;
import com.idat.EFDavidSotelohospedajeMicroservicio.repositoriio.HospedajeRepository;

@Service
public class HospedajeServiceImp implements HospedajeService {
	
	@Autowired
	private HospedajeRepository hospedajeRepositorio;
	@Autowired
	private HospedajeDetalleRepository hospedajeDetalleRepositorio;
	@Autowired
	private OpenFeignClient client;

	@Override
	public void guardarHospedaje(Hospedaje hospedaje) {
		// TODO Auto-generated method stub
		hospedajeRepositorio.save(hospedaje);
	}

	@Override
	public void asignarHospedaje() {
		// TODO Auto-generated method stub
		List<TuristaDTO> listado = client.listarTurista();
		TuristaHospedaje fk = null;
		HospedajeDetalle detalle = null;
		for (TuristaDTO turistadto : listado) {
			fk = new TuristaHospedaje();
			fk.setIdHospedaje(turistadto.getIdTurista());
			fk.setIdTurista(1);
			
			detalle = new HospedajeDetalle();
			detalle.setFk(fk);
			hospedajeDetalleRepositorio.save(detalle);
		}

	}

}
