package com.idat.EFDavidSotelohospedajeMicroservicio.repositoriio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFDavidSotelohospedajeMicroservicio.model.HospedajeDetalle;

@Repository
public interface HospedajeDetalleRepository extends JpaRepository<HospedajeDetalle, Integer> {

}
