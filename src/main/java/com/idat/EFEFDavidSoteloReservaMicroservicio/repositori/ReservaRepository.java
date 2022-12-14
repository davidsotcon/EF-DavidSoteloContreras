package com.idat.EFEFDavidSoteloReservaMicroservicio.repositori;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFEFDavidSoteloReservaMicroservicio.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva,Integer>{

}
