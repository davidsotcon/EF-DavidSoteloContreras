package com.idat.EFDavidSotelohospedajeMicroservicio.cliente;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.EFDavidSotelohospedajeMicroservicio.DTO.TuristaDTO;



@FeignClient(name ="Turista-microservicio",url = "localhost:8090" )
public interface OpenFeignClient {
	@GetMapping("/api/turista/evfinal/listar")
	public List<TuristaDTO>listarTurista() ;
}
