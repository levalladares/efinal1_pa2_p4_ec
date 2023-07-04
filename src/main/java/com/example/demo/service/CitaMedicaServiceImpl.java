package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CitaMedicaRepository;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.PacienteRepository;
import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;



@Service
public class CitaMedicaServiceImpl implements CitaMedicaService{

	@Autowired
	public CitaMedicaRepository citaMedicaRepository;
	@Autowired
	public DoctorRepository doctorRepository;
	@Autowired
	public PacienteRepository pacienteRepository;
	
	@Override
	public void guardar(String nCita, LocalDate fechaCita, BigDecimal valorCita, String lugarCita, String cedulaD,
			String cedulaP) {
		// TODO Auto-generated method stub
		CitaMedica cita=new CitaMedica();
		Doctor doctor= this.doctorRepository.seleccionarD(cedulaD);
		Paciente paciente =this.pacienteRepository.seleccionarP(cedulaP);
		cita.setnCita(nCita);
		cita.setFechaCita(fechaCita);
		cita.setValorCita(valorCita);
		cita.setLugarCita(lugarCita);
		cita.setDoctor(doctor);
		cita.setPaciente(paciente);
		this.citaMedicaRepository.insertar(cita);
		
	}

	@Override
	public void actualizar(String nTurno, String diagnostico, String receta, LocalDate fechaProxCita) {
		// TODO Auto-generated method stub
		CitaMedica citaMedica=citaMedicaRepository.seleccionarCM(nTurno);
		citaMedica.setDiagnostico(diagnostico);
		citaMedica.setReceta(receta);
		citaMedica.setFechaProxCita(fechaProxCita);
		this.citaMedicaRepository.actualizar(citaMedica);
		
	}

}
