package com.example.demo.repository.modelo;

import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
	@GeneratedValue(generator ="seq_doctor",strategy = GenerationType.SEQUENCE )
	@SequenceGenerator(name = "seq_doctor",sequenceName = "seq_doctor",allocationSize = 1)// el allocationSize de coincidir con el valor que pusimos en el incremento
	@Id
	@Column(name = "doct_id")
	private Integer id;
	
	@Column(name = "doct_cedula")
	private String cedula;
	
	@Column(name = "doct_nombre")
	private String nombre;
	
	@Column(name = "doct_apellido")
	private String apellido;
	
	@Column(name = "doct_fechaNacimiento")
	private LocalDate fechaNacimiento;
	
	@Column(name = "doct_nConsultorio")
	private String nConsultorio;
	
	@Column(name = "doct_codSenescyt")
	private String codSenescyt;
	
	@Column(name = "doct_genero")
	private String genero;
	
	@OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)
	private List <CitaMedica> citaMedicas;
	
	
	//TOSTRING
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", nConsultorio=" + nConsultorio + ", codSenescyt="
				+ codSenescyt + ", genero=" + genero + ", citaMedicas=" + citaMedicas + "]";
	}
	

	//GET Y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getnConsultorio() {
		return nConsultorio;
	}

	public void setnConsultorio(String nConsultorio) {
		this.nConsultorio = nConsultorio;
	}

	public String getCodSenescyt() {
		return codSenescyt;
	}

	public void setCodSenescyt(String codSenescyt) {
		this.codSenescyt = codSenescyt;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<CitaMedica> getCitaMedicas() {
		return citaMedicas;
	}

	public void setCitaMedicas(List<CitaMedica> citaMedicas) {
		this.citaMedicas = citaMedicas;
	}
	
	
	

	
	
	
}
