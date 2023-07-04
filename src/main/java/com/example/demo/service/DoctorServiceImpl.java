package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.modelo.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;
	@Override
	public void agregar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepository.insertar(doctor);
		
	}
	@Override
	public Doctor buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.doctorRepository.seleccionarD(cedula);
	}

}
