package com.example.demo.repository;

import com.example.demo.repository.modelo.Paciente;

public interface PacienteRepository {
	
	public void insertar(Paciente paciente);
	public void actualizar( Paciente paciente);
	public Paciente seleccionar(String nombre);
	public void eliminar(String nombre);
	public Paciente seleccionarP (String cedula);
	

}
