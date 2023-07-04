package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "citaMedica")
public class CitaMedica {
	@GeneratedValue(generator ="seq_citaMedica",strategy = GenerationType.SEQUENCE )
	@SequenceGenerator(name = "seq_citaMedica",sequenceName = "seq_citaMedica",allocationSize = 1)// el allocationSize de coincidir con el valor que pusimos en el incremento
	@Id
	@Column(name = "cime_id")
	private Integer id;
	
	@Column(name = "cime_nCita")
	private String nCita;
	
	@Column(name = "cime_fechaCita")
	private LocalDate fechaCita;//
	
	@Column(name = "cime_valorCita")
	private BigDecimal valorCita;//
	
	@Column(name = "cime_lugarCita")
	private String lugarCita;//
	
	@Column(name = "cime_diagnostico")
	private String diagnostico;
	
	@Column(name = "cime_receta")
	private String receta;
	
	@Column(name = "cime_fechaProxCita")
	private LocalDate fechaProxCita;
	
	@ManyToOne
	@JoinColumn(name = "cime_id_doctor") 
	private Doctor doctor;
	
	@ManyToOne
	@JoinColumn(name = "cime_id_paciente")
	private Paciente paciente;
	
	//TOSTRING
	@Override
	public String toString() {
		return "CitaMedica [id=" + id + ", nCita=" + nCita + ", fechaCita=" + fechaCita + ", valorCita=" + valorCita
				+ ", lugarCita=" + lugarCita + ", diagnostico=" + diagnostico + ", receta=" + receta
				+ ", fechaProxCita=" + fechaProxCita + ", doctor=" + doctor + ", paciente=" + paciente + "]";
	}

	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getnCita() {
		return nCita;
	}

	public void setnCita(String nCita) {
		this.nCita = nCita;
	}

	public LocalDate getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDate fechaCita) {
		this.fechaCita = fechaCita;
	}

	public BigDecimal getValorCita() {
		return valorCita;
	}

	public void setValorCita(BigDecimal valorCita) {
		this.valorCita = valorCita;
	}

	public String getLugarCita() {
		return lugarCita;
	}

	public void setLugarCita(String lugarCita) {
		this.lugarCita = lugarCita;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getReceta() {
		return receta;
	}

	public void setReceta(String receta) {
		this.receta = receta;
	}

	public LocalDate getFechaProxCita() {
		return fechaProxCita;
	}

	public void setFechaProxCita(LocalDate fechaProxCita) {
		this.fechaProxCita = fechaProxCita;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	
	
	
	
	
	

}
