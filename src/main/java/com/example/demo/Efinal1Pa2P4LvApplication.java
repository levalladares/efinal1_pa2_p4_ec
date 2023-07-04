package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;
import com.example.demo.service.CitaMedicaService;
import com.example.demo.service.DoctorService;
import com.example.demo.service.PacienteService;

@SpringBootApplication
public class Efinal1Pa2P4LvApplication implements CommandLineRunner{
	
	@Autowired
	private CitaMedicaService citaMedicaService;
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private PacienteService pacienteService;

	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P4LvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Doctor doctor1 = new Doctor();
		doctor1.setNombre("Jose ");
		doctor1.setApellido("Bermeo");
		doctor1.setCedula("172324");
		doctor1.setnConsultorio("001");
		doctor1.setFechaNacimiento(LocalDate.of(1990,03,05));
		doctor1.setCodSenescyt("123asd");
		doctor1.setGenero("Masculino");
		//INGRESA DOCTOR
		System.out.println("INGRESA DOCTOR");
		this.doctorService.agregar(doctor1);
		
		Paciente paciente1 = new Paciente();
		paciente1.setNombre("Luis");
		paciente1.setApellido("Valladares");
		paciente1.setCedula("171011");
		paciente1.setFechaNacimiento(LocalDate.of(1999, 02, 23));
		paciente1.setCodigoSeguro("Iess123");
		paciente1.setEstatura("175 cm");
		paciente1.setPeso("70 kg");
		paciente1.setGenero("Masculino");
		//INGRESA PACIENTE
		System.out.println("INGRESA PACIENTE");
		this.pacienteService.guardar(paciente1);		
		
		//CREO CITA MEDICA
		System.out.println("CREO CITA MEDICA");
		this.citaMedicaService.guardar("1588",LocalDate.of(2023, 07, 30) ,new BigDecimal(25), "IESS_COTOCOLLAO", "172324", "171011");
		
		//ACTUALIZO CITA MEDICA
		System.out.println("ACTUALIZA CITA MEDICA");
		this.citaMedicaService.actualizar("1588", "Faringuitis aguda","paracetamol cada 8 horas y analgan cada 12 hotas", LocalDate.of(2023, 9, 23));
	
		
	}

}
