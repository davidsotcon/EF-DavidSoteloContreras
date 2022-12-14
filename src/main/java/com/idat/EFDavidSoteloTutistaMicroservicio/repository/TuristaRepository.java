package com.idat.EFDavidSoteloTutistaMicroservicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFDavidSoteloTutistaMicroservicio.dto.TuristaDTO;
import com.idat.EFDavidSoteloTutistaMicroservicio.model.Turista;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer> {
 
}
