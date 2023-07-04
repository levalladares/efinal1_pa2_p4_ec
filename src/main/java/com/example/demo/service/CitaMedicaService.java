package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;


public interface CitaMedicaService {
	
	public void guardar( String nCita,LocalDate fechaCita, BigDecimal valorCita,
			String lugarCita, String cedulaD,String cedulaP);
	public void actualizar(String nTurno,String diagnostico,String receta,LocalDate fechaControl);
	
}
