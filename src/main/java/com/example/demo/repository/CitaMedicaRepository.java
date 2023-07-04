package com.example.demo.repository;

import com.example.demo.repository.modelo.CitaMedica;

public interface CitaMedicaRepository {
	
	public void insertar(CitaMedica cita);
	public void actualizar( CitaMedica cita);
	public CitaMedica seleccionar(String nTurno);
	public void eliminar(String nTurno);
	public CitaMedica seleccionarCM (String nTurno);


}
