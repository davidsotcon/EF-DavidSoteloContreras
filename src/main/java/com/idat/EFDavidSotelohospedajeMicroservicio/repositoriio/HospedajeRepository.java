package com.idat.EFDavidSotelohospedajeMicroservicio.repositoriio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFDavidSotelohospedajeMicroservicio.model.Hospedaje;

@Repository
public interface HospedajeRepository extends JpaRepository<Hospedaje,Integer>{

}
